/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Observable;

/**
 *
 * @author User
 */
public class Sistema extends Observable implements Serializable {
    private ArrayList<Tematica> listaTematicas;
    private ArrayList<Postulante> listaPostulantes;
    private ArrayList<Evaluador> listaEvaluadores;
    private ArrayList<Persona> listaPersonas;
    private ArrayList<Entrevista> listaEntrevistas;
    private ArrayList<Puesto> listaPuestos;
    
    public Sistema() {
        this.listaTematicas = new ArrayList<>();
        this.listaPostulantes = new ArrayList<>();
        this.listaEvaluadores = new ArrayList<>();
        this.listaEntrevistas = new ArrayList<>();
        this.listaPuestos = new ArrayList<>();
        this.listaPersonas = new ArrayList<>();
    }
    
    public ArrayList<Tematica> getTematicas() {
        return listaTematicas;
    }
    
    public ArrayList<Evaluador> getEvaluadores() {
        return listaEvaluadores;
    }
    
    public ArrayList<Postulante> getPostulantes() {
        return listaPostulantes;
    }
    
    public ArrayList<Puesto> getPuestos() {
        return listaPuestos;
    }
    
    public ArrayList<Entrevista> getEntrevistas() {
        return listaEntrevistas;
    }
    
    public boolean agregarTematica(String nombre, String descripcion) {
        boolean existeNombre = false;
        for(Tematica unaTematica : this.listaTematicas) {
            if(unaTematica.getNombre().equalsIgnoreCase(nombre)) {
                existeNombre = true;
            }
        }
        
        if(!existeNombre) {
            Tematica nuevaTematica = new Tematica(nombre,descripcion);
            this.listaTematicas.add(nuevaTematica);
        }
        System.out.println("hola");
        setChanged();
        notifyObservers();
        
        return !existeNombre;
    }
    
    public boolean agregarPostulante(String nombre, String cedula, String direccion, String telefono, String mail, String linkedin, String formato, HashMap<String,String> temas) {
        boolean existeCedula = this.validarExisteCedula(cedula);
        
        if(!existeCedula) {
            Postulante nuevoPostulante = new Postulante(nombre, cedula, direccion, telefono, mail, linkedin, formato, temas);
            this.listaPersonas.add(nuevoPostulante);
            this.listaPostulantes.add(nuevoPostulante);
            setChanged();
            notifyObservers();
            System.out.println("Creado");
        }
        
        return !existeCedula;
    }
    
    public boolean validarExisteCedula(String cedula) {
        boolean existeCedula = false;
        
        for(Persona unaPersona : this.listaPersonas) {
            System.out.println("aca"+unaPersona.getCedula());
            System.out.println(cedula);
            if(unaPersona.getCedula().equals(cedula)) {
                existeCedula = true;
            }
        }
        
        return existeCedula;
    }
    
    public void agregarTematicaPostulante(String unNombre, String unNivel, String unaCedula) {
        for(Postulante unPostulante : this.listaPostulantes) {
            if(unPostulante.getCedula().equals(unaCedula)) {
                unPostulante.getTemas().put(unNombre,unNivel);
                System.out.println("se agregó tema a postulante");
            }
        }
    }
    
    public boolean agregarEvaluador(String nombre, String cedula, String direccion, String anioIngreso) {
        boolean existeCedula = this.validarExisteCedula(cedula);
        
        if(!existeCedula) {
            Evaluador nuevoEvaluador = new Evaluador(nombre, cedula, direccion, anioIngreso);
            this.listaPersonas.add(nuevoEvaluador);
            this.listaEvaluadores.add(nuevoEvaluador);
            setChanged();
            notifyObservers();
            System.out.println("Evaluador Creado");
        }
        
        return !existeCedula;
    }
    
    public void agregarEntrevista(String cedulaPos, String cedulaEval, int puntaje, String comentarios) {
        Postulante postulante = null;
        for (Postulante pos : this.listaPostulantes) {
            if(pos.getCedula().equals(cedulaPos)) {
                postulante = pos;
            }
        }
        
        Evaluador evaluador = null;
        for (Evaluador eval : this.listaEvaluadores) {
            if(eval.getCedula().equals(cedulaEval)) {
                evaluador = eval;
            }
        }
        
        Entrevista nuevaEntrevista = new Entrevista(postulante, evaluador, puntaje, comentarios);    
        
        this.listaEntrevistas.add(nuevaEntrevista);
    }
    
    public boolean agregarPuesto(String unNombre, String tipo, Object[] temasRequeridos) {
        boolean existeNombre = false;
        
        for(Puesto puesto : this.listaPuestos) {
            if(puesto.getNombre().equalsIgnoreCase(unNombre)) {
                existeNombre = true;
            }
        }
        
        // Esto es necesario?
        
        ArrayList<Tematica> temas = new ArrayList<>();
        for (Object temaReq : temasRequeridos) {
            for(Tematica tematica : this.listaTematicas) {
                if (tematica.getNombre().equalsIgnoreCase(temaReq.toString())) {
                    temas.add(tematica);
                }
            }
        }
        
        if(!existeNombre) {
            Puesto nuevoPuesto = new Puesto(unNombre, tipo, temas);
            this.listaPuestos.add(nuevoPuesto);
            System.out.println("Puesto agregado:");
        }
        
        return !existeNombre;
    }
    
    public boolean eliminarPostulante(String cedula) {
        boolean existeCedula = this.validarExisteCedula(cedula);

        if (existeCedula) {          
            Iterator<Postulante> iterator = this.listaPostulantes.iterator();
            Iterator<Persona> iterator2 = this.listaPersonas.iterator();

            while(iterator2.hasNext()) {
                Persona p = iterator2.next();
                if (p.getCedula().equals(cedula)) {
                    iterator2.remove();
                }
            }

            Postulante unPostulante = this.obtenerPostulante(cedula);
            this.eliminarEntrevistasPostulante(unPostulante);

            while (iterator.hasNext()) {
                Postulante p = iterator.next();
                if (p.getCedula().equals(cedula)) {
                    iterator.remove();
                    setChanged();
                    notifyObservers();
                }
            }

        }
        return existeCedula;
    }
    
    public void eliminarEntrevistasPostulante(Postulante unPostulante) {
        Iterator<Entrevista> iterator = this.listaEntrevistas.iterator();
        
        while(iterator.hasNext()) {
            Entrevista e = iterator.next();
            if(e.getPostulante().equals(unPostulante)) {
                iterator.remove();
                setChanged();
                notifyObservers();
            }
        }
    }
    
    public Postulante obtenerPostulante(String cedula) {
        Postulante p = null;
        for(Postulante unPostulante : this.listaPostulantes) {
            if (unPostulante.getCedula().equals(cedula)) {
                p = unPostulante;
            }
        }
        
        return p;
    }
    
    public ArrayList<Postulante> obtenerPostulantesParaPuesto(Puesto unPuesto, String nivel) {
        ArrayList<Postulante> listaPostulantesCumplen = new ArrayList<>();
        ArrayList<Entrevista> UltimasEntrevistas = new ArrayList<>();

        String formaTrabajo = unPuesto.getTipo();
        ArrayList<Tematica> temasRequeridos = unPuesto.getTemasRequeridos();
        int nivelRequerido = Integer.parseInt(nivel);
        
        this.listaPostulantes.forEach((Postulante p ) -> {
            boolean loTiene = true;
            for(Tematica tema : temasRequeridos) {
                if(p.getTemas().containsKey(tema.getNombre())) {
                    int nivelTemaPos = Integer.parseInt(p.getTemas().get(tema.getNombre()));
                    if(nivelTemaPos < nivelRequerido) {
                        loTiene = false;
                    }   
                } else {
                    loTiene = false;
                }
                
            }

            if(p.getFormato().equalsIgnoreCase(formaTrabajo) && loTiene) {
                listaPostulantesCumplen.add(p);
            }
        });
        
        listaPostulantesCumplen.forEach((Postulante unPos) -> {
            Entrevista ultimaE = this.obtenerUltimaEntrevistaPostulante(unPos);
            UltimasEntrevistas.add(ultimaE);
        });
        
        ArrayList<Postulante> respuesta = new ArrayList<>();
        
        if(!UltimasEntrevistas.isEmpty()) {
            respuesta = ordenarPostulantesPorEntrevista(UltimasEntrevistas);
        } 
        
        return respuesta;
    }
    
    private ArrayList<Postulante> ordenarPostulantesPorEntrevista(ArrayList<Entrevista> ultimasEntrevistas) {
        ArrayList<Postulante> postulantesOrdenados = new ArrayList<>();
        ultimasEntrevistas.removeIf(e -> e == null);
        
        ultimasEntrevistas.sort((Entrevista e1, Entrevista e2) -> {
            return e2.getPuntaje() - e1.getPuntaje();
        });
        
        ultimasEntrevistas.forEach((Entrevista e) -> {
            postulantesOrdenados.add(e.getPostulante());
        });
        
        return postulantesOrdenados;
    }
    
    public Entrevista obtenerUltimaEntrevistaPostulante(Postulante unPostulante) {
        Entrevista e = null;
        boolean encontrado = false;

        for(int i = this.listaEntrevistas.size() - 1; i > 0 && !encontrado; i--) {
            if(this.listaEntrevistas.get(i).getPostulante().equals(unPostulante)) {
                e = this.listaEntrevistas.get(i);
                encontrado = true;
            }
        }
        
        return e;
    }
    
    public void grabarArchivoConsulta(ArchivoGrabacion arch, ArrayList<Postulante> postulantesFiltrados, Puesto puestoSeleccionado) {
        arch.grabarLinea("Consulta para Puesto: "+puestoSeleccionado.getNombre());
        
        for(Postulante p : postulantesFiltrados) {
            arch.grabarLinea(p.formatoArchivo());
        }
        
        arch.cerrar();
    }
    
    public ArrayList<Entrevista> obtenerEntrevistasPostulante(Postulante p) {
        ArrayList<Entrevista> entrevistas = new ArrayList<>();
        
        this.listaEntrevistas.forEach((Entrevista e ) -> {
            if(e.getPostulante().equals(p)) {
                entrevistas.add(e);
            }
        });
        
        return entrevistas;
    }
    
    public int cantidadPostulantesSuperanNivel5(Tematica t) {
        int cantidad = 0;
        
        for(Postulante p : this.listaPostulantes) {
            for(Map.Entry<String,String> entry : p.getTemas().entrySet()) {
                int nivel = Integer.parseInt(entry.getValue());
                if(entry.getKey().equalsIgnoreCase(t.getNombre()) && nivel >= 5) {
                    cantidad++;
                }
            }
        }
        
        return cantidad;
    }
    
    public int cantidadPuestosRequierenTematica(Tematica t) {
        int cantidad = 0;
        
        for(Puesto p : this.listaPuestos) {
            if(p.getTemasRequeridos().contains(t)) {
                cantidad++;
            }
        }
        
        return cantidad;
    }
}

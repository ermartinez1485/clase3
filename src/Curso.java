
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class Curso {
    
    public int codigo;
    public String nombre;
    public int cantAlumnos;
    Profesor elProfe;
    Date fechaInicio;
    
    
    public Curso(){
        
        this.codigo=1002;
        this.nombre="Java";
        this.cantAlumnos=12;
        this.fechaInicio= new Date();
        this.elProfe = new Profesor();
        
        
    }
    
    public Curso(int cod, String nombre, int cantAlum, Profesor elprofe, Date fechaInicio){
        
        this.codigo=cod;
        this.nombre=nombre;
        this.cantAlumnos=cantAlum;
        this.elProfe=elprofe;
        this.fechaInicio=fechaInicio;
              
    }
    
    //getter and setter codigo
    public void setCodigo(int cod){
    
        this.codigo = cod;
    }
    
    public int getCodigo(){
    
        return this.codigo;
    }
    
    //getter and setter nombre
    public void setNombre(String nom){
    
        this.nombre = nom;
    }
    
    public String getNombre(){
    
        return this.nombre;
    }
    
    
    //getter setter alumn
    public void setCantAlum(int cantAlum){
    
        this.cantAlumnos = cantAlum;
    }

    public int getCantAlumnos(){
    
        return this.cantAlumnos;
    }
    
     //getter and setter profe
    public Profesor getElProfe() {
        return elProfe;
    }

    public void setElProfe(Profesor elProfe) {
        this.elProfe = elProfe;
    }

    //getter and setter fecha
    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    
    
    public void imprime(){
        
        System.out.println("Nombre: "+this.codigo);
        System.out.println("Cédula: "+this.nombre);
        System.out.println("Cantidad de Alumnos: "+this.cantAlumnos);
        this.elProfe.imprime();
        System.out.println("Fecha de Inicio: "+this.fechaInicio);
    
        
    }
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class Imprimir {
    
     public static void main(String[] args) {
        
         
         Profesor profe = new Profesor();
         
         profe.imprime();
         
         System.out.println("******************");  //sout
         
         Curso curso = new Curso();
         curso.imprime();
         
         System.out.println("******************");  //sout
         
         profe.setNombre("Luis");
         profe.setCedula(444444444);
         profe.setSalario(10000);
         profe.imprime();
         curso.setElProfe(profe);
         
         System.out.println("******************");  //sout
         
         //otra.getMitrabajo().setDireccion("nueva direccion");
         curso.imprime();
         System.out.println("******************");  //sout
         
         
         Curso prueba = curso;
         prueba.imprime();
         
    }
    
}

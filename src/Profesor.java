/**
 *
 * @author Eric Martinez
 */
public class Profesor {
    
    public String nombre;
    public long cedula;
    public double salario;
    
    public Profesor() {
        
        this.nombre = "Eric Martinez";
        this.cedula = 112700030;
        this.salario = 100.00;
        
    }

    public Profesor(String nombre, long cedula, double salario) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.salario = salario;
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getCedula() {
        return cedula;
    }

    public void setCedula(long cedula) {
        this.cedula = cedula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    
    public void imprime(){
        
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Cédula: "+this.cedula);
        System.out.println("Salario: "+this.salario);
    
    }    
}

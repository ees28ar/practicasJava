package poo.practicateoria;

public class EmpleadoContratado extends Empleado{
    private int valorContrato;


    public EmpleadoContratado (int dni, String nombre, String apellido, int valorContrato){
        super(dni, nombre, apellido);
        this.valorContrato=valorContrato;
    }


    public int calcularSueldo(){
        return this.valorContrato;
    }
}

package poo.practicateoria;

public class EmpleadoJornada extends Empleado{
    private int horasTrabajadas;
    private int valorPorHora;

    public EmpleadoJornada (int dni, String nombre, String apellido, int horasTrabajadas, int valorPorHora){
        super(dni, nombre, apellido);
        this.horasTrabajadas=horasTrabajadas;
        this.valorPorHora=valorPorHora;

        
    }

    @Override
    public int calcularSueldo() {
        // TODO Auto-generated method stub
        return (this.horasTrabajadas*this.valorPorHora);
    }
}

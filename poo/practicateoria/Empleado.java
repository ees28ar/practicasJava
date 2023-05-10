package poo.practicateoria;

public abstract class Empleado {
    private int dni;
    private String nombre;
    private String apellido;

    public Empleado (int dni, String nombre, String apellido) {
        this.dni=dni;
        this.nombre=nombre;
        this.apellido=apellido;
    }


    public abstract int calcularSueldo();

    public String getNombre() {
        return nombre;
    }

public void setNombre(String nombre) {
    this.nombre = nombre;
}


    public String tString(){
        return String.valueOf(this.dni) + 
        " - " + this.apellido + " - " + this.nombre;
    }

}

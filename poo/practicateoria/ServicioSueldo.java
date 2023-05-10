package poo.practicateoria;

public class ServicioSueldo {
    public static void main(String[] args) {
        /*Empleado emp1= new EmpleadoEfectivo(1234, "Homero", "Simpsons", 40000, 2);
        Empleado emp2= new EmpleadoJornada(456, "Lisa", "Simpsons", 100, 400);
        Empleado emp3= new EmpleadoContratado(789, "Bart", "Simpsons", 550);

            System.out.println(emp1.getNombre() + ", "+ emp1.calcularSueldo());
    System.out.println(emp2.getNombre() + ", "+ emp2.calcularSueldo());
    System.out.println(emp3.getNombre() + ", "+ emp3.calcularSueldo());*/

        EmpleadoContratado [] contratados= new EmpleadoContratado [4];

        contratados [0]= new EmpleadoContratado(789, "Brisa", "Simpsons", 684);
        contratados [1]= new EmpleadoContratado(789, "Bianca", "Simpsons", 550);
        contratados [2]= new EmpleadoContratado(789, "Marce", "Simpsons", 698);
        contratados [3]= new EmpleadoContratado(789, "Eduardo", "Simpsons", 789);

    for (EmpleadoContratado e : contratados){
        System.out.println(e.getNombre()+" ,"+e.calcularSueldo());
    }

    
    }
}

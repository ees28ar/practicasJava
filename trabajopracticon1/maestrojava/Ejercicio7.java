package trabajopracticon1.maestrojava;

public class Ejercicio7 {
    public static void main(String[] args) {

        double masaObject= 50;


        double velocidadAngular= 120;

        double radio= 8;

        double fuerzaCentripeta= masaObject*Math.pow(velocidadAngular, 2);

        System.out.println("La fuerza Centripeta necesaria para mantener uno objeto en una trayectoria circular, de masa "+ masaObject +" Velocidad angular "+ velocidadAngular +" y radio de la trayectoria "+ radio+" es: "+fuerzaCentripeta);
    }
}

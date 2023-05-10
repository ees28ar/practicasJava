package trabajopracticon1.maestrojava;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        //Cálculo de la energía cinética:
        Scanner Entrada= new Scanner(System.in);
            System.out.println("Ingrese Masa del objeto");
            double masaObject= Entrada.nextInt();

            System.out.println("Ingrese Velocidad del objeto");
            double velocidadObject= Entrada.nextInt();

            double energiaCinetica= (0.5*masaObject)*Math.pow(velocidadObject, 2);

            System.out.println("La energía cinética de un objeto en movimiento, con "+masaObject +" y " + velocidadObject+" es: "+energiaCinetica);
        Entrada.close();

}

}

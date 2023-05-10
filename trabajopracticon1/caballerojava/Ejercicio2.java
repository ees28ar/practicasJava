package trabajopracticon1.caballerojava;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        // Conversión de dólares a pesos:Escribir un programa en Java que solicite al usuario una cantidad en dólares y muestre el equivalente en pesos, utilizando una tasa de cambio fija .Porejemplo ,si la tasa de cambio es de 1 dólar=20 pesos,y el usuario ingresa 50 dólares,el programa deberá mostrar 1000 pesos.

        Scanner entrada=new Scanner(System.in);
        System.out.println("Introduce cantidad de dolares");
        double dolar=entrada.nextInt();
        double tasaPesos=20;
        double cambioAPesos=dolar*tasaPesos;

        System.out.println(dolar+ " Dolares son "+cambioAPesos+" Pesos");
        entrada.close();

    }
}

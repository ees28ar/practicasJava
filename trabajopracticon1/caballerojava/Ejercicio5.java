package trabajopracticon1.caballerojava;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
/* Conversión de pesos a euros:Escribir un programa en Java que solicite al usuario una cantidad en pesos y muestre el equivalente en euros, utilizando una tasa de cambio fija .Porejemplo ,si la tasa de cambio es de 1 euro=20 pesos,y el usuario ingresa 5000 pesos,el programa deberá mostrar 250 euros. */
        Scanner Entrada= new Scanner(System.in);
        System.out.println( "Ingrese Monto Pesos");
        double pesos=Entrada.nextInt();
        double tasaFija=20;
        double cambioAEuro=pesos/tasaFija;

        System.out.println(pesos+ " Libras son "+cambioAEuro+" Dolares");
        Entrada.close();

    }
}

package trabajopracticon1.caballerojava;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
       /* Conversión de euros a dolares:Escribir un programa en Java que solicite al usuario una cantidad en euros y muestre el equivalente en dolares, utilizando una tasa de cambio fija .Porejemplo ,si la tasa de cambio es de 1 euro=1.20 dolares,y el usuario ingresa 100 euros,el programa deberá mostrar 120 dolares. */

        Scanner Entrada=new Scanner(System.in);
        System.out.println("Introduce cantidad de Dolares");
        double euro=Entrada.nextInt();
        double tasaFija= 1.20;
        double cambioADolar=euro*tasaFija;

        System.out.println(euro+ " Euros son "+cambioADolar+" Dolares");
        Entrada.close();
    }
}

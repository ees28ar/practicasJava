package trabajopracticon1.caballerojava;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        /* Conversión de libras a dolares:Escribir un programa en Java que solicite al usuario una cantidad en libras y muestre el equivalente en dolares, utilizando una tasa de cambio fija .Porejemplo ,si la tasa de cambio es de 1 libras=1.40 dolares,y el usuario ingresa 50 libras,el programa deberá mostrar 70 dolares. */
        Scanner Entrada= new Scanner(System.in);
        System.out.println("Ingrese monto de Libras Esterlinas");
        double libra= Entrada.nextInt();
        double tasaFija=1.40;
        double cambioADolar=libra*tasaFija;

        System.out.println(libra+ " Libras son "+cambioADolar+" Dolares");
        Entrada.close();
    }
}

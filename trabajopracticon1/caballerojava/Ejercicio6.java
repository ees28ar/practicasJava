package trabajopracticon1.caballerojava;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {


      Scanner input = new Scanner(System.in);
      
      // Definimos la tasa de cambio de bitcoin a dólares
      final double tasaCambio = 50000;
      
      // Pedimos al usuario la cantidad de bitcoins a convertir
      System.out.print("Ingrese la cantidad de bitcoins a convertir: ");
      double bitcoins = input.nextDouble();
      
      // Calculamos la cantidad de dólares equivalentes a la cantidad de bitcoins ingresada
      double dolares = bitcoins * tasaCambio;
      
      // Mostramos el resultado al usuario
      System.out.println(bitcoins + " bitcoins equivalen a " + dolares + " dólares.");
      input.close();
   }
}

       /* Conversión de bitcoins a dolares:Escribir un programa en Java que solicite al usuario una cantidad en pesos y muestre el equivalente en euros, utilizando una tasa de cambio fija .Porejemplo ,si la tasa de cambio es de 1 bitcoins=50000 dolares,y el usuario ingresa 0.5 bitcoins ,el programa deberá mostrar 25000 dolares. 
       Scanner entrada= new Scanner(System.in);
       System.out.println( "Ingrese Monto Pesos");
       double bitcoins=entrada.nextDouble();
       double tasaFija=50000;
       double cambioADolar=bitcoins*tasaFija;

       System.out.println(bitcoins+ " Libras son "+cambioADolar+" Dolares");
       entrada.close(); 
      */

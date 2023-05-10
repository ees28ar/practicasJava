package trabajopracticon1.iniciadojava;

public class Ejercicio2 {
    public static void main(String[] args) {
 /* Suma de dos números bis:Se les solicita que guarden dos números enteros y los sumen.
 El resultado guardarlo, mostrarlo por pantalla junto con un mensaje que indique si se trata de un número paro impar       
 */
        int  valorA= 10;
        int valorB=5;
        int resultado= valorA+valorB;
        double calculoPar= resultado%2;  
        String paridad = (calculoPar==0)?"Par":"Impar";
        String texto= String.format("%d y es %s", resultado, paridad);
        System.out.println("El Resultado de la Suma es entre " + valorA + " y "+valorB+ " es : " + texto);
  

    }
}


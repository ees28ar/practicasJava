package trabajopracticon2.caballerojava;

import java.util.Arrays;

public class Ejercicio4 {
    public static void main(String[] args) {
        /*Realizar un programa que guarde cierta cantidad de números con
punto decimal en un arreglo. Luego, el programa debe ordenar los números de
forma ascendente y mostrarlos en pantalla. */
        double [] valores={2.15, 8.36, 14.3,6.2};
        
        
        Arrays.sort(valores);

        for (double d : valores) {
            System.out.println(d);
        }

        System.out.println("-----------Similar---------");

        System.out.println(Arrays.toString(valores));
    }
}


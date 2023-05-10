package trabajopracticon2.caballerojava;

import java.util.Arrays;

public class Ejercicio2 {
    public static void main(String[] args) {
        /*Realizar un programa donde se guarden 5 en
un arreglo. Luego, el programa debe mostrar en pantalla el valor máximo y mínimo
de los números ingresados */
        int [] valores={10,5,16,82,36};
        int mayor=0;
        int menor=1000;

        for (int i : valores) {
            if (i>mayor){
                mayor=i;
            }
        }

        for (int i : valores) {
            if (i<menor){
                menor=i;
            }
        }
System.out.println("El valor Mayor del array es: "+ mayor);
System.out.println("El valor Menor del array es: "+ menor);

System.out.println("----------------opcion 2------------");
int[] numeros = {10, 5, 20, 15, 8};

        // Obtener el valor máximo y mínimo usando la clase Arrays de Java
        int maximo = Arrays.stream(numeros).max().getAsInt();
        int minimo = Arrays.stream(numeros).min().getAsInt();

        // Mostrar los resultados en pantalla
        System.out.println("Valor máximo: " + maximo);
        System.out.println("Valor mínimo: " + minimo);

    }
}

package trabajopracticon2.maestrojava;

import java.util.Arrays;

public class Ejercicio3 {
    public static void main(String[] args) {
        /*Dado dos arreglos con cualquier tipo de valor (Ya sea
String, Char, Integer, etc), realice la unión de ambos arreglos en un tercer arreglo */

    // Arreglos originales
    Integer[] arr1 = {1, 2, 3};
    Integer[] arr2 = {4, 5, 6};
    
    // Crear tercer arreglo con tamaño igual a la suma de los tamaños de los dos arreglos originales
    Integer[] arr3 = new Integer[arr1.length + arr2.length];
    
    // Copiar los elementos del primer arreglo al tercer arreglo, comenzando desde la posición 0
    System.arraycopy(arr1, 0, arr3, 0, arr1.length);
    
    // Copiar los elementos del segundo arreglo al tercer arreglo, comenzando desde la posición final del primer arreglo
    System.arraycopy(arr2, 0, arr3, arr1.length, arr2.length);
    
    // Imprimir el tercer arreglo que contiene la unión de los dos arreglos originales
    System.out.println(Arrays.toString(arr3));


    }
}

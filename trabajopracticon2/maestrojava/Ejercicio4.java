package trabajopracticon2.maestrojava;

public class Ejercicio4 {
    public static void main(String[] args) {
        /*Dado un arreglo de enteros, una posición del
arreglo y la cantidad de N traslados a hacer en un arreglo. Lo que debe hacer es
tomar el elemento de la posición del arreglo y trasladarlo N cantidad de veces, si el
traslado es mayor al tamaño del arreglo informar por pantalla. */

        int array []={1,2,3,4};
        int posicion=3;
        int traslados=1;

        int temp=array[posicion];

        for (int i=posicion; i>traslados; i--){
            array[i]=array[i-1];
        }
        array[traslados]=temp;
        System.out.println(array.toString());
        
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
          }
    }
}

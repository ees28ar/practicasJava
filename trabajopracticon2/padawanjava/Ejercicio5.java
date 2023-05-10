package trabajopracticon2.padawanjava;

public class Ejercicio5 {
    public static void main(String[] args) {
        /*Realizar un programa que muestre por pantalla los
números enteros positivos que sean divisibles por 7 y que sean menores que 100. */

        for (int i=0; i<=100;i++){
            if (i%7==0){
                System.out.println(i);
            }
        }
    }
}

package trabajopracticon2.iniciadojava;

public class Ejercicio5 {
    public static void main(String[] args) {
        /*Realizar un programa que calcule la suma de los
primeros N números naturales, donde N es un número entero guardado en memoria */
        int numeroN=3;
        int acum=0;
        for (int i=0;i<=numeroN;i++){
            
            acum=acum+i;
           

        }
        System.out.println(acum);

    }
}

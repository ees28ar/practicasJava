package trabajopracticon1.iniciadojava;

public class Ejercicio5 {
    public static void main(String[] args) {
//Triangulo de asteriscos:Se le solicita que creen un programa que imprima un triángulo de asteriscos en la consola.
        final String ASTERICO="*";
        System.out.println("---------OPCIÓN 1------");
        System.out.printf("%6s", ASTERICO);
        System.out.println("");
        System.out.printf("%4s %4s", ASTERICO, ASTERICO);
        System.out.println("");
        System.out.printf("%3s %6s", ASTERICO, ASTERICO);
        System.out.println("");
        System.out.printf("%4s %4s", ASTERICO, ASTERICO);
        System.out.println("");
        System.out.printf("%6s", ASTERICO);
        System.out.println("");
        System.out.println("---------OPCIÓN 2------");
        System.out.println(ASTERICO);
        System.out.println(ASTERICO+ASTERICO);
        System.out.println(ASTERICO+ASTERICO+ASTERICO);
        System.out.println(ASTERICO+ASTERICO+ASTERICO+ASTERICO);
        System.out.println(ASTERICO+ASTERICO+ASTERICO+ASTERICO+ASTERICO);
        System.out.println(ASTERICO+ASTERICO+ASTERICO+ASTERICO+ASTERICO+ASTERICO);       
    }
}
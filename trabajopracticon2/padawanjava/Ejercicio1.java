package trabajopracticon2.padawanjava;

public class Ejercicio1 {
    public static void main(String[] args) {
        /*Demuestre cómo convertir un bucle WHILE en un
        DO WHILE.   */

        int cont=0;
        while (true){
            cont+=1;
            System.out.println(cont);
            if (cont==5){
                break;
            }

        }
    }
}

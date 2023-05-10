package trabajopracticon1.maestrojava;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        //Cálculo de la velocidad final:
        Scanner Entrada= new Scanner(System.in);
            System.out.println("Ingrese Velocidad Inicial");
            double velocidadInicial= Entrada.nextInt();

            System.out.println("Ingrese Aceleraciòn de la Gravedad");
            double aceleraGravedad= Entrada.nextInt();

            System.out.println("Ingrese Tiempor Transcurrido");
            double tiempoTranscurrido= Entrada.nextInt();

            double velocidadFinal= velocidadInicial+aceleraGravedad*tiempoTranscurrido;

            System.out.println("La Velocidad Final es: "+velocidadFinal);
        Entrada.close();
    }
}

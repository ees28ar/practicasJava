package trabajopracticon2.padawanjava;

public class Ejercicio8a {
    public static void main(String[] args) {
        /*Realice un menú de opciones, donde la opción se guarde en
una variable (Sin pedir por teclado), muestre la opción elegida y fuerce su salida
bucle. */
        int numeroN=7;
        System.out.println("Determina el dia de la semana del Nùmero guardado");
        System.out.println("Número:"+ numeroN);
        switch (numeroN){
        case 1:
            System.out.println("Lunes");
            break;
        case 2: 
            System.out.println("Martes");
            break;
            case 3:
            System.out.println("Miercoles");
            break;
        case 4: 
            System.out.println("Jueves");
            break;
            case 5:
            System.out.println("Viernes");
            break;
        case 6: 
            System.out.println("Sàbado");
            break;
            case 7:
            System.out.println("Domingo");
            break;
        }

    }
}

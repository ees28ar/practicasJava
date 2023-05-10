package trabajopracticon2.padawanjava;

public class Ejercicio10 {
    public static void main(String[] args) {
        int opcion=0;
        System.out.println("Ingrese la opción requerida: ");
        System.out.println("1.- LOGIN");
        System.out.println("2.- REGISTER");
        System.out.println("3.- EXIT");
        while (true){
        System.out.println("Opción Elegida: "+opcion);
         if (opcion==1){
            System.out.println("Bienvenido");
            break;
         }else if (opcion==2){
            System.out.println("Registrando");
            break;
         } else if (opcion==3){
            System.out.println("Hasta Luego");
            break;
         }
         System.out.println("Opción Incorrecta");
         break;
        }

    }
}

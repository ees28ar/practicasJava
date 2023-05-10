package trabajopracticon2.caballerojava;

public class Ejercicio1 {
    public static void main(String[] args) {
       int [] valores={10,5,16,82,36}; 
       int busqueda=12;
       int bandera=0;

       for (int numero: valores){
        if (numero==busqueda){
            System.out.println("El Número: "+busqueda+" se encuentra en el Arreglo");
             bandera++;
            break;
        }      
       }
       if (bandera==0)
       System.out.println("El Número: "+busqueda+" NO se encuentra en el Arreglo");
    }
}

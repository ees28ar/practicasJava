package trabajopracticon2.iniciadojava;

public class Ejercicio2 {
    public static void main(String[] args) {
 /*Mis amigos : Guarde en variables el nombre de N cantidad de amigos, itere sobre
esa cantidad mostrando el nombre de cada amigo. */
        String [] amigos = {"Brisa", "Bianca", "Marce", "Blaky"};
        for(int i=0;i<=3;i++){
  
            System.out.println(amigos[i]);
    }
System.out.println("----------------Otra manera------------");
    for(String nombre : amigos){
  
        System.out.println(nombre);
}
}
}

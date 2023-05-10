package trabajopracticon2.padawanjava;

public class Ejercicio7a {
    public static void main(String[] args) {
        /*Guarda en variables el nombre de N cantidad de amigos,
itere sobre esa cantidad luego muestre el nombre de cada amigo si y sólo si este
amigo es mayor de edad, en caso de ser menor de edad imprima un mensaje
diciendole a ese amigo porque no lo muestra por pantalla */
        String [] nombre={"Bianca","Brisa","Marce","Juany"};
        int [] edades= {12,7,40,25};

        for(int i = 0; i < edades.length; i++){
            if (edades[i]>=18){
                System.out.println(nombre[i]+" tiene "+edades[i]+" años de Edad");
            }
              System.out.println( );

        }
        for(int j = 0; j < edades.length; j++){
            if (edades[j]<18){
                System.out.print(nombre[j]+", ");
                System.out.println(" no puedo mostrarte porque eres menor de Edad");

    }
}
}
}

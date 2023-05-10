package trabajopracticon1.padawanjava;

public class Ejercicio3 {
    public static void main(String[] args) {
        //Guarde en diferentes espacios de memoria distintos valore sde edad y los nombres de esas personas,luego saque su promedio e imprima por pantalla el nombre de la persona, su edad. Por último imprimir el promedio de sus edades.

        String nom1= "Brisa";
        int edad1=7;
        String nom2= "Bianca";
        int edad2=12;
        String nom3= "Marcela";
        int edad3=39;
        String nom4= "Gere";
        int edad4=9;

        double promeEdad=(edad1+edad2+edad3+edad4)/4;
        
        System.out.println("El promedio de edad de "+nom1+", "+nom2+", "+nom3+", "+nom4+", "+ " es"+ " "+promeEdad);
    }
}

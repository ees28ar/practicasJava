package trabajopracticon2.iniciadojava;

public class Ejercicio1 {
    public static void main(String[] args) {
        //Triangulo de asteriscos : Se le solicita que creen un programa que imprima un triángulo de asteriscos en la consola. Usar bucles.
        for(int i=0;i<=10;i++){//Notemos que escribir i+=2 es similar a escribir i = i + 2
            String asterisco = new String(new char[i]).replace("\0", "*");
            System.out.println(asterisco);
}
    }
}

/*En cada iteración, se crea una nueva cadena de caracteres vacía utilizando la clase String y el constructor new char[i]. 
Luego, se reemplaza cada caracter vacío "\0" de la cadena por el caracter asterisco "*" utilizando el método replace().

Finalmente, se muestra la cadena resultante en la consola utilizando el método System.out.println(). */
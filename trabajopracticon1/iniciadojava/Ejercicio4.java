package trabajopracticon1.iniciadojava;

public class Ejercicio4 {
    public static void main(String[] args) {
    //Cálculo de divisibilidad:Se le solicita que guarden dos números enteros y los sumen,determine si el primer número es divisible por el segundo número y muestre el resultado
    
        int  valorA= 84;
        int valorB=5;
        int resultado= valorA+valorB;
        double calculoDiv= valorA%valorB;  
        String divisible = (calculoDiv==0)?"Es Divisible":"No es Divisible";
        String texto= String.format("%d", resultado);
        System.out.println("El Resultado de la Suma  entre " + valorA + " y "+valorB+ " es: " + texto + " y "+ valorA +" " +  divisible + " de " +  valorB);
  

    }
}

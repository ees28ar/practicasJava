package trabajopracticon1.maestrojava;

public class Ejercicio3 {
    public static void main(String[] args) {
        //Cálculo de la hipotenusa de un triángulo
        double valorCateto1=6;
        double valorCateto2=8;

        double sumaCatetos=(Math.pow(valorCateto1, 2))+(Math.pow(valorCateto2, 2));
        double calculoHipotenusa=Math.sqrt(sumaCatetos);
       
      
       System.out.println("El valor de la Hipotenusa con Catetos con los soguientes valores "+ valorCateto1+" y "+valorCateto2+" es "+calculoHipotenusa);

    }
}

package trabajopracticon1.caballerojava;

public class Ejercicio1 {
    public static void main(String[] args) {
        //Dados dos números, uno real y el otro entero. Obtenga el porcentaje que indique el segundo número del primer número

        double valorReal=28.5;
        int valorEntero=12;

        double calculaPorcentaje=(valorEntero*valorReal)/100;
        //quitar parte decimal en java, convertimos calculaPorcentaje en su parte entera mediante una conversión explícita (casting) a int. El resultado se almacena en la variable integerPart.
        int parteEntera = (int) calculaPorcentaje;

        System.out.println("El " + valorEntero + " por ciento de "+ valorReal+ " es "+ parteEntera);
    }
}

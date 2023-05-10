package imperativa;

import java.util.function.DoublePredicate;

public class ConversionDatos {
    public static void main(String[] args) {
        
        //Promocion
         int value1=5;
         
         System.out.println("El valor de la Promociòn es " + value1);
         //Contracción

         int value2 = (int) 5.23f;//parsing
         System.out.println("El valor de la Caontracción  es " + value2);

        //implicita
         double value3 = 10 +20.5d;
        System.out.println("Valor por implicita "+ value3);

    }
}

package trabajopracticon1.iniciadojava;



public class Ejercicio10 {
    public static void main(String[] args) {
        //Se le solicita que guarde en un espacio de memoria la acumulación de quince multiplicaciones entre dos númerosenteros divididos por el número de la multiplicación
        int valueA=5;
        int valueB=2;
        
        double result=((valueA*valueB)/1+(valueA*valueB)/2+(valueA*valueB)/3+(valueA*valueB)/4+(valueA*valueB)/5+(valueA*valueB)/6+(valueA*valueB)/7+(valueA*valueB)/8+(valueA*valueB)/9+(valueA*valueB)/10+(valueA*valueB)/11+(valueA*valueB)/12+(valueA*valueB)/13+(valueA*valueB)/14+(valueA*valueB)/15);
        System.out.println(result);

        System.out.println("Opción 2");
        System.out.println("--------");
        
        double acum=0;

        for (int i = 1; i <= 15; i++) {
            double resulado2=(valueA*valueB)/i;
            acum=resulado2+=acum;
          }
          System.out.println(acum);
    }

   

}

/*
 *  System.out.println(valueA++); //valueA = valueA + 1
    System.out.println(valueA--); //valueA = valueA  -1

    //ACUMULADORES valueA = valueA + 5
    System.out.println("Acumulador " + (valueA += 5)); //Es igual a valueA = valueA + 5
    System.out.println( "Desacumulador " + (valueA -= 10)); //Es igual a valueA = valueA - 10


    System.out.println(constanteValue);
 */
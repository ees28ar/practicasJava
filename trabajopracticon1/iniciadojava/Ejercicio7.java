package trabajopracticon1.iniciadojava;

public class Ejercicio7 {
    public static void main(String[] args) {
    //Multiplicación: Se le solicita que guarde dos números reales y losmultiplique,luego guarde otros dos números enteros y multiplicarlos.Guarde en un espacio de memoria la suma entre estas dos multiplicaciones¿ Que resultado le da?¿Entero o real?¿Porqué?
    double valorA=4;
    double valorB=8;
    double multiReal= valorA+valorB;
    
    int valorC=4;
    int valorD=5;

    int multiEnt= valorC+valorD;

    double resultFinal=multiReal+multiEnt;
        System.out.println(resultFinal);

    /* La razón por la cual la multiplicación entre un número de tipo double y un número de tipo entero (int, short, byte, etc.) da como resultado un número de tipo double en Java, es debido a la regla de promoción numérica que se aplica en las expresiones aritméticas.
La promoción numérica es una regla que se aplica en las expresiones aritméticas en Java para determinar el tipo de dato resultante de la operación. En el caso de la multiplicación entre un número de tipo double y un número de tipo entero, la regla de promoción numérica establece que se debe convertir el número de tipo entero a un número de tipo double antes de realizar la operación. Esto se hace para evitar la pérdida de precisión en los cálculos, ya que los números de tipo double tienen una mayor precisión que los números enteros.
 */



    }
}

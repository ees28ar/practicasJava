package imperativa;

public class DecalaracionesEnJava {
    public static void main(String[] args) {
        
        float valor1= 34.5f; ///Convierte el double a float, porque java tiene una preferencia de double por float

        double valor2= 50.2;

        //SENTENCIA long valueLong = 123;
        //EXPRESIÒN 12345 + 5

        long valueLong= 123;

        //Constante

        final char constanteValue= 'A';
        final char constanteValue2= '\u0044'; //un char puede ser un unicode

        //CONTADORES
        int valueA=10;
        System.out.println(valueA++); //valueA+1
        System.out.println(valueA++);

        //ACUMULADOR valueA =ValueA + 5
        System.out.println(valueA+=5);



    }
}

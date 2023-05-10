package trabajopracticon2.padawanjava;

public class Ejercicio4 {
    public static void main(String[] args) {
        int inicioRango=2;
        int finalRango=10;
        int acumulador=0;

        for (int i=inicioRango; i<=finalRango;i++){
            if (i%2!=0){
                acumulador= acumulador+i;
            }
        }
        System.out.println(acumulador);

    }
}

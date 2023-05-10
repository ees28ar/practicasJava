package trabajopracticon2.caballerojava;

import java.util.Arrays;

public class Ejercicio5 {
    public static void main(String[] args) {
        /*Cree dos arreglos con números decimales,
luego recortarlos y reste ambos arreglos el resultado aplicarlos a un tercer arreglo, si
la resta da negativo entonces guarde 0. */
        
        double [] valores={2.15, 8.36, 14.3,6.2};
        double [] valores2={8.2,3.6,5.7,8.8};
        double [] resta=new double[5];
        int tamaño=valores.length;

        for (int i=0; i<tamaño;i++) {
            if (valores[i]-valores2[i]>=0){
                resta[i]=valores[i]-valores2[i];

            }else if (valores[i]-valores2[i]<0){
                resta[i]=0;
            }

            
        }
System.out.println(Arrays.toString(resta));
//puedo mostrar iterando con un for

    }
}

package trabajopracticon2.maestrojava;

import java.util.Arrays;

public class Ejercicio1 {
    public static void main(String[] args) {
        /*Dado un arreglo con valores enteros, realice la
búsqueda de ese entero y si lo encuentra eliminarlo, si no lo encuentra informe por
pantalla */

int[] valores = {2, 5, 7, 8, 10, 12};
int valorBuscado = 10;
System.out.println(Arrays.toString(valores));
int indice = -1;
for (int i = 0; i < valores.length; i++) {
    if (valores[i] == valorBuscado) {
        indice = i;
        break;
    }
}

if (indice != -1) {
    int[] nuevosValores = new int[valores.length - 1];
    for (int i = 0, k = 0; i < valores.length; i++) {
        if (i == indice) {
            continue;
        }
        nuevosValores[k++] = valores[i];
    }
    valores = nuevosValores;
    System.out.println("El valor " + valorBuscado + " fue eliminado del arreglo");
} else {
    System.out.println("El valor " + valorBuscado + " no se encontró en el arreglo");
}

System.out.println(Arrays.toString(valores));
    
    }


}

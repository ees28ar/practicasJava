package trabajopracticon2.iniciadojava;

public class Ejercicio7 {
    public static void main(String[] args) {
        /*Escribe un programa que imprima un título para el programa,
luego un listado (Seguido, NO con saltos de línea) de las N notas de mis exámenes,
donde los N números son guardados en variables o constantes según corresponda.
Luego obtenga el promedio de esas calificaciones y me diga si aprobé o no y con
cuanto */
final int MATEMATICA=7;
final int LENGUA=8;
final int HISTORIA=10;
final int NATURALES=2;
int PROMEDIO=((MATEMATICA+LENGUA+HISTORIA+NATURALES)/4);
final String TITULO="CALIFICACIONES";
final String SUBTITULO="PROMEDIO";


System.out.println("--------------------");
System.out.printf("%17s\n", TITULO);
System.out.println("--------------------");
System.out.printf("%7s %8s\n", "MATEMATICA", MATEMATICA);
System.out.printf("%6s %12s\n", "LENGUA", LENGUA);
System.out.printf("%7s %10s\n", "HISTORIA", HISTORIA);
System.out.printf("%7s %9s\n", "NATURALES", NATURALES);
System.out.println("--------------------");
System.out.printf("%14s\n", SUBTITULO);
System.out.println("--------------------");
if ( PROMEDIO>=6){
    System.out.printf("%7s %4s\n", "APROBADO CON ", PROMEDIO);;
}else{
    System.out.printf("%7s %3s\n", "DESAPROBADO CON ", PROMEDIO);;
}


/*System.out.println("");

System.out.println("");
System.out.printf("%3s %6s", TITULO, TITULO);
System.out.println("");
System.out.printf("%4s %4s", TITULO, TITULO);
System.out.println("");
System.out.printf("%6s", TITULO);*/
    }
}

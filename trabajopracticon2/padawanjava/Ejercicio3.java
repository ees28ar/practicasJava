package trabajopracticon2.padawanjava;

public class Ejercicio3 {
    public static void main(String[] args) {
        int numeroN=5;
          int acum=0;
        for (int i=numeroN; i>0; i--){
            if (i!=numeroN){
                acum=acum*i;
            }else{
                acum=i;
            }          
        }
        System.out.println(acum);

    }

}

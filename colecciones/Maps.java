package colecciones;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Maps {
    public static void main(String[] args) {
             treeSetExample();
        hashSetExample();
        }

        private static void hashSetExample(){
            Set<String> set = new HashSet<>();

            set.add("manzana");
            set.add("naranja");
            set.add("pera");
            set.add("fruta1");
            set.add("fruta2");
            set.add("fruta3");
            set.add("fruta4");

            //For each
            for (String elemento : set) {
                System.out.println(elemento);
            }

        }

        private static void treeSetExample(){
            TreeSet<String> set = new TreeSet<>();
            set.add("manzana");
            set.add("naranja");
            set.add("pera");
            set.add("frutilla");

    /*El método subSet() devuelve una vista ordenada del conjunto original, que
     contiene todos los elementos entre el elemento de inicio (en este caso, "frutilla")
      y el elemento final (en este caso, "naranja"). Los elementos dentro del subconjunto
      se mantienen en el mismo orden que en el conjunto original.
     */
            Set subSet = set.subSet("manzana", "pera");
            System.out.println("subset : " + subSet);
    }
}

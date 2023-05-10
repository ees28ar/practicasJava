package trabajopracticon1.padawanjava;

public class Ejercicio4 {
    public static void main(String[] args) {
        //Guarde en un espacio de memoria sus Kilogramos y luego,en otro espacio de memoria realice la conversión de esos kilogramos A libras .Utilice una constante de los valores que no van a cambiar en esta conversión. Muestre el resultado por pantalla

        final double constante=2.204622621857;
        double peso=90;

        double pesoenLibra=  peso*constante;

        System.out.println(peso +" Kilos" + " En libras es "+pesoenLibra);
    }

}

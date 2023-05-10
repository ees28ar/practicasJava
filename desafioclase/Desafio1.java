package desafioclase;

public class Desafio1 {
    public static void main(String[] args) {
        /*Desafio!                                                                                                                                     Realizar un programa y guarden en una variable la edad de un cliente y determine si es un niño (menor a 13 años), adolescente (entre 13 y 18 años),
        adulto joven (entre 18 y 35 años) o adulto (mayor a 35 años).*/

        int edadCliente=20;

        if (edadCliente < 13) {
            System.out.println("El cliente es un Niño");
}        else if (edadCliente >= 13 && edadCliente <= 18) {
             System.out.println("El Cliente es un Adolescente");
}        else if (edadCliente > 18 && edadCliente <= 35) {
            System.out.println("El cliente es un Adulto Joven");
}       else {
            System.out.println("El cliente es un Adulto");
}
    }
}

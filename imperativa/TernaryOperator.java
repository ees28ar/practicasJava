package imperativa;
public class TernaryOperator {
    public static void main(String[] args) {
        boolean esUnAuto= true;
        boolean fueUnAuto = (esUnAuto)?true:false;
        System.out.println(fueUnAuto);
        String mensajeAuto=(5>2)?"Este es una cadena si es true":"Cadena si es False";
        System.out.println(mensajeAuto);
        boolean encendido=false;
        String mensajeConsola=(encendido)?"E Vehiculo esta encendido":"El vehiculo esta apagado";
        System.out.println(mensajeConsola);
    }
}

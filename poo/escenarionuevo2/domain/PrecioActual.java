package domain;
import java.util.Scanner;
import java.time.LocalDateTime;

public class PrecioActual {

    //su valor, la fecha y hora en la que fue cargado
    private static Scanner scanner = new Scanner(System.in);
    private double valor;
    private LocalDateTime fechaDeCarga;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public LocalDateTime getFechaDeCarga() {
        return fechaDeCarga;
    }

    public void setFechaDeCarga(LocalDateTime fechaDeCarga) {
        this.fechaDeCarga = fechaDeCarga;
    }

    private static PrecioActual crearPrecioActual(){
        PrecioActual precioActual = new PrecioActual();
        System.out.println("INGRESE PRECIO DEL PRODUCTO : ");
        precioActual.setValor(getScanner().nextDouble());
        precioActual.setFechaDeCarga(LocalDateTime.now());

        return precioActual;
          

    


    }
    private static Scanner getScanner() {
        return null;
    }

    }


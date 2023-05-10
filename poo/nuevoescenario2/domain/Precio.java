package domain;
import java.time.LocalDateTime;

public class Precio {
    private double precio;
    private String fechaHoraCarga;
    private double precioTachado;
    private String fechaFinPromocion;
    
    public Precio(double precio, String fechaHoraPrecio, double precioTachado, String fechaFinPromocion) {
        this.precio = precio;
        this.fechaHoraCarga = fechaHoraPrecio;
        this.precioTachado = precioTachado;
        this.fechaFinPromocion = fechaFinPromocion;
    }
    
    public double getPrecio() {
        return precio;
    }
    
    public String getFechaHoraCarga() {
        return fechaHoraCarga;
    }
    
    public double esPrecioTachado() {
        return precioTachado;
    }
    
    public String getFechaFinPromocion() {
        return fechaFinPromocion;
    }
    
    public void setFechaFinPromocion(String fechaFinPromocion) {
        this.fechaFinPromocion = fechaFinPromocion;
    }
}

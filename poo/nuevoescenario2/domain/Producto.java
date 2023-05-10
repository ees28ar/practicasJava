package domain;

import java.time.LocalDateTime;

public class Producto {
    private String codigo;
    private String nombre;
    private String descripcion;
    private Categoria categoria;
    private double precioActual;
    private double precioTachado;
    private LocalDateTime fechaPrecioActual;
    private LocalDateTime fechaPrecioTachado;
    private double descuento;

    public Producto(String nombre, String descripcion, Categoria categoria, double precioActual, double precioTachado) {
        this.codigo = generarCodigoAleatorio();
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.precioActual = precioActual;
        this.precioTachado = precioTachado;
        this.fechaPrecioActual = LocalDateTime.now();
        this.fechaPrecioTachado = null;
        this.descuento = calcularDescuento();
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public double getPrecioActual() {
        return precioActual;
    }

    public void setPrecioActual(double precioActual) {
        this.precioActual = precioActual;
        this.fechaPrecioActual = LocalDateTime.now();
        this.descuento = calcularDescuento();
    }

    public double getPrecioTachado() {
        return precioTachado;
    }

    public void setPrecioTachado(double precioTachado, LocalDateTime fechaVencimiento) {
        this.precioTachado = precioTachado;
        this.fechaPrecioTachado = fechaVencimiento;
        this.descuento = calcularDescuento();
    }

    public LocalDateTime getFechaPrecioActual() {
        return fechaPrecioActual;
    }

    public LocalDateTime getFechaPrecioTachado() {
        return fechaPrecioTachado;
    }

    public double getDescuento() {
        return descuento;
    }

    private String generarCodigoAleatorio() {
        // Código de generación aleatoria
        return "COD" + Math.random() * 1000;
    }

    private double calcularDescuento() {
        double descuentoCalculado = 0.0;

        if (precioTachado > 0 && fechaPrecioTachado != null && fechaPrecioTachado.isAfter(LocalDateTime.now())) {
            descuentoCalculado = ((precioTachado - precioActual) / precioTachado) * 100;
        }

        return descuentoCalculado;
    }
}

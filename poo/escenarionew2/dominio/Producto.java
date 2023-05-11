package poo.escenarionew2.dominio;

import java.util.Scanner;
import java.util.UUID;



public class Producto {
    private UUID id;
    private String nombre;
    private String descripcion;
    private Categoria categoria;
    private double precioActual;
    
    public Producto(UUID id, String nombre, String descripcion, Categoria categoria, Double precioActual) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.precioActual = precioActual;
    }
    
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPrecioActual() {
        return precioActual;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }


    public void setPrecioActual(Double precioActual) {
        this.precioActual = precioActual;
    }


    }

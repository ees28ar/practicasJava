package domain;

import java.util.Scanner;

import domain.PrecioActual;

public class Producto {
    private String nombre;
    private String descripcion;
    private Categoria categoria;
    private PrecioActual precioActual;
    
    public Producto(String nombre, String descripcion, Categoria categoria, PrecioActual precioActual) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.precioActual = precioActual;
    }
    
    // Getters y setters
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

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }


    public void setPrecioActual(PrecioActual precioActual) {
        this.precioActual = precioActual;
    }


    public static Producto cargarProducto(Categoria[] categorias) {
        Producto[] productos = new Producto[10];
        int cantidadProductos = 0;
    
        // Cargar algunos productos
        Scanner scanner = new Scanner(System.in);
        String opcion = "";
        while (!opcion.equals("0")) {
            System.out.println("Ingrese los datos del producto (o 0 para salir):");
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            if (nombre.equals("0")) {
                opcion = "0";
            } else {
                System.out.print("Descripción: ");
                String descripcion = scanner.nextLine();
                System.out.print("Precio: ");
                scanner.nextLine(); // Limpiar el buffer de entrada
                System.out.print("Categoría (nombre): ");
                String nombreCategoria = scanner.nextLine();
    
                // Buscar la categoría por su nombre
                Categoria categoria = null;
                for (int i = 0; i < categorias.length; i++) {
                    Categoria c = categorias[i];
                    if (c != null && c.getNombre().equals(nombreCategoria)) {
                        categoria = c;
                        break;
                    }
                }
                if (categoria == null) {
                    System.out.println("La categoría no existe.");
                    return null;
                }
    
                if (categoria != null) {
                    Producto producto = new Producto(nombre, descripcion, categoria, precio);
                    productos[cantidadProductos] = producto;
                    cantidadProductos++;
                    System.out.println("Producto agregado con éxito.");
                }
            }

    }
                // Imprimir la lista de productos
                System.out.println("Lista de productos:");
                for (int i = 0; i < cantidadProductos; i++) {
                    Producto producto = productos[i];
                    System.out.println(producto.getNombre() + " - " + producto.getDescripcion() + " - " +
                        producto.getCategoria().getNombre() + " - $" + producto.getPrecio());
        }
                return null;
    }
}

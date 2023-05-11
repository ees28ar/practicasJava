/*
import java.util.Scanner;

import domain.Categoria;
import domain.Producto;
import domain.Precio;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Categoria> categorias = new ArrayList<Categoria>();

        




















        
        // Cargar categorías
        Categoria categoria1 = new Categoria( "Categoría 1", "Limpieza", true);
        Categoria categoria2 = new Categoria("Categoría 2", "Comestible", true);
        categorias.add(categoria1);
        categorias.add(categoria2);
    
        // Cargar productos
        System.out.print("Ingrese el nombre del producto: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese la descripción del producto: ");
        String descripcion = scanner.nextLine();

        System.out.print("Ingrese la categoría del producto: ");
        String categoria = scanner.nextLine();

        // Buscar categoría en la lista de categorías
        Categoria categoriaProducto = null;
        for (Categoria c : categorias) {
            if (c.getNombre().equals(categoria)) {
                categoriaProducto = c;
                break;
            }
        }

        if (categoriaProducto == null) {
            System.out.println("La categoría ingresada no existe");
            return;
        }

        System.out.print("Ingrese el precio actual del producto: ");
        double precioActual = scanner.nextDouble();

        System.out.print("Ingrese el precio tachado del producto: ");
        double precioTachado = scanner.nextDouble();

        System.out.print("Ingrese la fecha y hora en que se cargó el precio (en formato dd/MM/yyyy HH:mm:ss): ");
        scanner.nextLine(); // Consumir el salto de línea anterior
        String fechaHoraPrecio = scanner.nextLine();

        System.out.print("Ingrese el descuento del producto (en porcentaje): ");
        double descuento = scanner.nextDouble();

        System.out.print("Ingrese la fecha y hora en que se cargó el precio (en formato dd/MM/yyyy HH:mm:ss): ");
        scanner.nextLine(); // Consumir el salto de línea anterior
        String fechaFinPromocion = scanner.nextLine();

       
        Precio precio = new Precio(precioActual, fechaHoraPrecio, precioTachado, fechaFinPromocion);
        Producto producto = new Producto(nombre, descripcion, categoriaProducto, precioActual, descuento);

        categoriaProducto.agregarProducto(producto);

        System.out.println("Producto cargado exitosamente en la categoría " + categoriaProducto.getNombre());
    }
}
 */
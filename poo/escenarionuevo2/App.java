import java.util.Scanner;

import domain.Categoria;
import domain.PrecioActual;
import domain.Producto;

public class App {
    public static void main(String[] args) {
        Categoria[] categorias = Categoria.cargarCategorias();

        System.out.println("\nCategorias ingresadas:");
        for (int i = 0; i < categorias.length; i++) {
            Categoria categoria = categorias[i];
            if (categoria != null) {
                System.out.println(categoria.getCodigo() + " - " + categoria.getNombre());
            }
        }

       Producto producto = Producto.cargarProducto(categorias);
        
       

}
}


        /*
        Scanner scanner = new Scanner(System.in);
        
        String nombre;
        String descripcion;
        Categoria categoria = null;
        double precio;
        
        System.out.println("Ingrese los datos del producto:");
        System.out.print("Nombre: ");
        nombre = scanner.nextLine();
        System.out.print("Descripción: ");
        descripcion = scanner.nextLine();
        System.out.print("Categoría: ");
        String nombreCategoria = scanner.nextLine();
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
        System.out.print("Precio: ");
        precio = scanner.nextDouble();
        scanner.nextLine(); 
        
        Producto producto = new Producto(nombre, descripcion, categoria, precio);
      
        return producto;

        
    }


public static void main(String[] args) {
    // Crear algunas categorías
    Categoria categoria1 = new Categoria("C1", "Categoría 1");
    Categoria categoria2 = new Categoria("C2", "Categoría 2");

    // Crear un array para almacenar los productos
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
            double precio = scanner.nextDouble();
            scanner.nextLine(); // Limpiar el buffer de entrada
            System.out.print("Categoría (nombre): ");
            String nombreCategoria = scanner.nextLine();

            // Buscar la categoría por su nombre
            Categoria categoria = null;
            if (nombreCategoria.equals(categoria1.getNombre())) {
                categoria = categoria1;
            } else if (nombreCategoria.equals(categoria2.getNombre())) {
                categoria = categoria2;
            } else {
                System.out.println("La categoría " + nombreCategoria + " no existe.");
            }

            if (categoria != null) {
                Producto producto = new Producto(nombre, descripcion, categoria, precio);
                productos[cantidadProductos] = producto;
                cantidadProductos++;
                System.out.println("Producto agregado con éxito.");
            }
        }
    }

    
}
*/
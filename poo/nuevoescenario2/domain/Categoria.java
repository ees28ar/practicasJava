package domain;

import java.util.ArrayList;
import java.util.Scanner;

public class Categoria {
    private String nombre;
    private String descripcion;
    private boolean disponible;
    private ArrayList<Producto> productos;
    

    public Categoria(String nombre, String descripcion, boolean disponible) {
             this.nombre = nombre;
        this.descripcion = descripcion;
        this.disponible = disponible;
        this.productos = new ArrayList<>();

    }



    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }
}
/* 
public static Categoria cargarCategorias() {
    Categoria[] categorias = new Categoria[10];
    int i = 0;
    Scanner scanner = new Scanner(System.in);
    
    String codigo;
    String nombre;
    boolean activa;
    
    System.out.println("Ingrese los datos de las categorias (Ingrese 0 para terminar):");
    while (i < 10) {
        System.out.print("Codigo: ");
        codigo = scanner.nextLine();
        if (codigo.equals("0")) {
            break;
        }
        System.out.print("Nombre: ");
        nombre = scanner.nextLine();
        System.out.print("Activa (true/false): ");
        activa = scanner.nextBoolean();
        scanner.nextLine(); // Limpiar buffer de entrada
        
        Categoria Categoria = new Categoria(codigo, nombre, null, activa);
        categorias[i] = categoria;
        i++;
    }
    
}
}
*/
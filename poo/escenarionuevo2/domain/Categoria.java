package domain;

import java.util.Scanner;

public class Categoria {
    private String nombre;
    private String descripcion;
    
    public Categoria(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
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

    public String getCodigo() {
        return null;
    }


    public static Categoria[] cargarCategorias() {
        Categoria[] categorias = new Categoria[10];
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        
        String nombre;
        String descripcion;
        
        System.out.println("Ingrese las categorías (Ingrese 0 para terminar):");
        while (i < 10) {
            System.out.print("Nombre: ");
            nombre = scanner.nextLine();
            if (nombre.equals("0")) {
                break;
            }
            System.out.print("Descripción: ");
            descripcion = scanner.nextLine();
            
            Categoria categoria = new Categoria(nombre, descripcion);
            categorias[i] = categoria;
            i++;
        }
        
        return categorias;
    }
}

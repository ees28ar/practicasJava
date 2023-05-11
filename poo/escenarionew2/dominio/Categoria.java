package poo.escenarionew2.dominio;

import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

public class Categoria {
    private String nombre;
    private String descripcion;
    private boolean isDiponible;
    
    public Categoria(String nombre, String descripcion, boolean isDiponible) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.isDiponible= isDiponible;

    }
    
    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setIsdiponible(Boolean isDiponible) {
        this.isDiponible = isDiponible;
    }

    public boolean getIsdiponible() {
        return isDiponible;
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

 


    public static Categoria[] cargarCategorias() {
        Categoria[] categorias = new Categoria[10];
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        
        String nombre;
        String descripcion;
        boolean isDiponible;
        
        System.out.println("INGRESE CATEGORIAS (Ingrese 0 para terminar):");
        while (i < 10) {
            System.out.print("Nombre: ");
            nombre = scanner.nextLine();
            if (nombre.equals("0")) {
                break;
            }
            System.out.print("Descripción: ");
            descripcion = scanner.nextLine();
            

            System.out.print("¿Se Encuentra Disponible?: ");
            isDiponible = scanner.nextBoolean();
            System.out.println("Categoria agregada Exitosamente");
            Categoria categoria = new Categoria(nombre, descripcion, isDiponible);
            categorias[i] = categoria;
            i++;
            scanner.nextLine(); 
        }
        
        return categorias;
    }
}

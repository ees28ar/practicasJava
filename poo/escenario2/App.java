package poo.escenario2;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
public class App {
    public static void main(String[] args) {
                // Crear tienda
                Tienda tienda = new Tienda();

                // Cargar categorías
                tienda.cargarCategorias();

                // Scanner para solicitar datos por consola
                Scanner scanner = new Scanner(System.in);

                // Solicitar datos de producto
                System.out.println("Ingrese el nombre del producto:");
                String nombre = scanner.nextLine();

                System.out.println("Ingrese la descripción del producto:");
                String descripcion = scanner.nextLine();

                System.out.println("Ingrese el código de la categoría del producto:");
                String codigoCategoria = scanner.nextLine();

                System.out.println("Ingrese el precio actual del producto:");
                double precioActual = scanner.nextDouble();
                scanner.nextLine();

                System.out.println("¿El producto tiene precio tachado? (s/n)");
                String opcion = scanner.nextLine();

                double precioTachado = 0;
                LocalDateTime fechaFinTachado = null;

                if (opcion.equalsIgnoreCase("s")) {
                    System.out.println("Ingrese el precio tachado del producto:");
                    precioTachado = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.println("Ingrese la fecha y hora de finalización de la promoción (en formato yyyy-mm-ddThh:mm):");
                    String fechaFinTachadoString = scanner.nextLine();
                    fechaFinTachado = LocalDateTime.parse(fechaFinTachadoString);
                }

                // Crear producto
                Producto producto = new Producto(nombre, descripcion, codigoCategoria, precioActual, precioTachado, fechaFinTachado);

                // Agregar producto a la tienda
                tienda.agregarProducto(producto);

                // Mostrar productos de la tienda
                tienda.mostrarProductos();
            }
        }

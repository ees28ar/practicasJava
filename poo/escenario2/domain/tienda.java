package poo.escenario2.domain;
import java.util.*;
public class tienda {

        private List<Categoria> categorias;
        private List<Producto> productos;

        public Tienda() {
            categorias = new ArrayList<>();
            productos = new ArrayList<>();
        }

        public void agregarCategoria(Categoria categoria) {
            categorias.add(categoria);
        }

        public void agregarProducto(Producto producto) {
            productos.add(producto);
        }

        public List<Producto> getProductos() {
            return productos;
        }

        public List<Categoria> getCategorias() {
            return categorias;
        }

        public List<Producto> getProductosPorCategoria(Categoria categoria) {
            List<Producto> productosPorCategoria = new ArrayList<>();
            for (Producto producto : productos) {
                if (producto.getCategoria().equals(categoria)) {
                    productosPorCategoria.add(producto);
                }
            }
            return productosPorCategoria;
        }

        public List<Producto> getTop5ProductosMasCaros() {
            Collections.sort(productos, Collections.reverseOrder());
            return productos.subList(0, Math.min(productos.size(), 5));
        }

        public List<Producto> getTop5ProductosMasBaratos() {
            Collections.sort(productos);
            return productos.subList(0, Math.min(productos.size(), 5));
        }
    public void listarProductosPorCategoria(String nombreCategoria) {
        boolean encontrado = false;
        for (Categoria categoria : categorias) {
            if (categoria.getNombre().equalsIgnoreCase(nombreCategoria) && categoria.isDisponible()) {
                encontrado = true;
                System.out.println("Productos en la categoría " + nombreCategoria + ":");
                for (Producto producto : categoria.getProductos()) {
                    System.out.println("- " + producto.getNombre() + ": " + producto.getDescripcion() + " - Precio online: " + producto.getPrecioOnline() + " - Precio tachado: " + producto.getPrecioTachado() + " - Descuento: " + producto.getDescuento() + "%");
                }
                break;
            }
        }
        if (!encontrado) {
            System.out.println("La categoría " + nombreCategoria + " no existe o no está disponible.");
        }
    }


}



/*package poo.escenario2.domain;
import java.time.LocalDateTime;
import java.util.UUID;


public class producto {

    public class Producto {
        private UUID codigo;
        private String nombre;
        private String descripcion;
        private Categoria categoria;
        private Precio precioActual;
        private Precio precioTachado;
        private double descuento;

        public Producto(String nombre, String descripcion, Categoria categoria, Precio precioActual) {
            this.codigo = UUID.randomUUID();
            this.nombre = nombre;
            this.descripcion = descripcion;
            this.categoria = categoria;
            this.precioActual = precioActual;
            this.descuento = 0.0;
        }

        public UUID getCodigo() {
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

        public Precio getPrecioActual() {
            return precioActual;
        }

        public void setPrecioActual(Precio precioActual) {
            this.precioActual = precioActual;
        }

        public Precio getPrecioTachado() {
            return precioTachado;
        }

        public void setPrecioTachado(Precio precioTachado) {
            this.precioTachado = precioTachado;
        }

        public double getDescuento() {
            return descuento;
        }

        public void setDescuento(double descuento) {
            this.descuento = descuento;
        }

        public void calcularDescuento() {
            double descuento = 0.0;
            if (precioTachado != null) {
                double porcentajeDescuento = (1 - (precioActual.getPrecio() / precioTachado.getPrecio())) * 100;
                this.descuento = Math.round(porcentajeDescuento * 100.0) / 100.0;
            }
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(nombre).append(" - ").append(descripcion).append(" - ");
            sb.append("Precio online: ").append(precioActual.getPrecio()).append(" - ");
            if (precioTachado != null) {
                sb.append("Precio tachado: ").append(precioTachado.getPrecio()).append(" - ");
                sb.append("Descuento: ").append(descuento).append("%");
            }
            return sb.toString();
        }
    }
}*/


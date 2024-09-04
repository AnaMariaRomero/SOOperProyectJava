package sooper.contenedores;

import java.util.Set;

import sooper.productos.IProducto;

public interface IContenedor {

    String getReferencia();

    int getVolumen();

    int volumentDisponible();

    int getResistencia();

    Set<IProducto> getProductos();

    String getTipo();

    boolean meter(IProducto producto);

    boolean resiste(IProducto producto);

    boolean ocupado();

    static void getContenedores() {

    }
}

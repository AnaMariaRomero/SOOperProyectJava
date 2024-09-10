package sooper;

import java.util.Set;

public interface IContenedor {

    String getReferencia();

    int getVolumen();

    int getSuperficie();

    int volumentDisponible();

    int getResistencia();

    Set<IProducto> getProductos();

    String getTipo();

    boolean meter(IProducto producto);

    boolean resiste(IProducto producto);

    boolean ocupado();

    void getContenedores();
}

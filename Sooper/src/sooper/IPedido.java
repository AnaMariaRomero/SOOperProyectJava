package sooper;

import java.util.Set;
import sooper.contenedores.IContenedor;
import sooper.productos.IProducto;

public interface IPedido {

    String getReferencia();

    Set<IProducto> getProductos();

    Set<IContenedor> getCibContenedores();

    void assContenedor(IContenedor contendor);

    IContenedor addProducto(IProducto producto);
}

package sooper;

import java.util.Set;

public interface IPedido {

    String getReferencia();

    Set<IProducto> getProductos();

    Set<IContenedor> getCibContenedores();

    void assContenedor(IContenedor contendor);

    IContenedor addProducto(IProducto producto);
}

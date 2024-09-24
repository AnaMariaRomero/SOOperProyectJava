package sooper;

import sooper.enums.Categoria;

public interface IProducto {

    String getReferencia();

    int getPeso();

    int getVolumen();

    Categoria getCategoria();

    boolean esCompatible();

    boolean tengoEspacio(IContenedor contenedor);

    public static void getProductos() {

    }
}

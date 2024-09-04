package sooper.productos;

import sooper.contenedores.IContenedor;

public interface IProducto {

    String getReferencia();

    int getPeso();

    int getVolumen();

    String getCategoria();

    boolean esCompatible();

    boolean tengoEspacio(IContenedor contenedor);

    public static void getProductos() {

    }
}

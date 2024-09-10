package sooper;

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

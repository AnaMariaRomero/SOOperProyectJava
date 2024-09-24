package sooper.productos;

import sooper.IProducto;
import sooper.enums.Categoria;

public class Higiene extends Producto {

    public Higiene(String referencia, int peso, int volumen) {
        super(referencia, peso, volumen);
    }

    @Override
    public Categoria getCategoria() {
        return Categoria.HIGUIENE;
    }

    @Override
    public boolean esCompatible(IProducto p) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}

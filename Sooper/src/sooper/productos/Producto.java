package sooper.productos;

import sooper.IContenedor;
import sooper.IProducto;

public abstract class Producto implements IProducto {

    @Override
    public String getReferencia() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getPeso() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getVolumen() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String getCategoria() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean esCompatible() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean tengoEspacio(IContenedor contenedor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}

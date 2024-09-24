package sooper.productos;

import sooper.IContenedor;
import sooper.IProducto;

public abstract class Producto implements IProducto {

    private final int peso;
    private final String referencia;
    private final int volumen;
    private IContenedor contenedor;

    public Producto(String referencia, int peso, int volumen) {
        this.peso = peso;
        this.volumen = volumen;
        this.referencia = referencia;
    }

    @Override
    public String getReferencia() {
        return referencia;
    }

    @Override
    public int getPeso() {
        return peso;
    }

    @Override
    public int getVolumen() {
        return volumen;
    }

    @Override
    public boolean tengoEspacio(IContenedor contenedor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void meter(IContenedor contenedor) {
        this.contenedor = contenedor;
    }

}

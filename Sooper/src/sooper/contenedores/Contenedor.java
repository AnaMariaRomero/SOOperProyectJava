package sooper.contenedores;

import java.util.Set;
import sooper.IContenedor;
import sooper.IProducto;

public abstract class Contenedor implements IContenedor {

    private final String referencia;
    private final int alto;
    private Set<IProducto> productos;
    private int resistencia;

    public Contenedor(String referencia, int alto) {
        this.alto = alto;
        this.referencia = referencia;
    }

    @Override
    public String getReferencia() {
        return referencia;
    }

    @Override
    public int getVolumen() {
        return alto * getSuperficie();
    }

    @Override
    public int volumentDisponible() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getResistencia() {
        return resistencia;
    }

    @Override
    public Set<IProducto> getProductos() {
        return productos;
    }

    @Override
    public boolean meter(IProducto producto) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean resiste(IProducto producto) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean ocupado() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void getContenedores() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}

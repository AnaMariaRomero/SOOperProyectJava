package sooper.contenedores;

import java.util.Iterator;
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
        boolean resistenciaOk = this.resiste(producto);
        boolean volumenOk = producto.tengoEspacio(this);
        boolean compatibilidadOk = true;

        boolean compatibleOk;
        for (Iterator var6 = this.productos.iterator(); var6.hasNext(); compatibilidadOk &= compatibleOk) {
            IProducto p = (IProducto) var6.next();
            compatibleOk = producto.esCompatible(p);
        }

        boolean acepta = resistenciaOk && volumenOk && compatibilidadOk;
        if (acepta) {
            this.productos.add(producto);
            //producto.meter(this);
        }

        return acepta;
    }

    @Override
    public boolean resiste(IProducto producto) {
        return this.resistencia > producto.getPeso();
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

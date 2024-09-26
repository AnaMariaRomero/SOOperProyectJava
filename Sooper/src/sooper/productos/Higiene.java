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
        //tenemos que asegurar que NO sea de alimentacion
        return !Categoria.ALIMENTACION.equals(p.getCategoria());
    }
}

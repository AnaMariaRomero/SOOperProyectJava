package sooper.productos;

import sooper.IProducto;
import sooper.enums.Categoria;

public class Alimentacion extends Producto {

    public Alimentacion(String referencia, int peso, int volumen) {
        super(referencia, peso, volumen);
    }

    @Override
    public Categoria getCategoria() {
        return Categoria.ALIMENTACION;
    }

    //dejo que cada clase que extiende del producto (las hijas) me diga si es compatible
    @Override
    public boolean esCompatible(IProducto p) {
        //comprobamos que la categoria del producto sea Alimentacion
        return Categoria.ALIMENTACION.equals(p.getCategoria());
    }
}

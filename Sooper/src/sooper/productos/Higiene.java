package sooper.productos;

import sooper.enums.Categoria;

public class Higiene extends Producto{

    public Higiene(String referencia, int peso, int volumen) {
        super(referencia, peso, volumen);
    }

    @Override
    public Categoria getCategoria() {
        return Categoria.HIGUIENE;
    }
}

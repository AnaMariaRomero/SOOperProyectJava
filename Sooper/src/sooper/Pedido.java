package sooper;

import java.util.HashSet;
import java.util.Set;

public class Pedido implements IPedido {

    private final String referencia;
    private final Set<IContenedor> contenedores;

    public Pedido(String referencia) {
        this.referencia = referencia;
        this.contenedores = new HashSet();
    }

    @Override
    public String getReferencia() {
        return this.referencia;
    }

    @Override
    public Set<IProducto> getProductos() {

        return null;
    }

    @Override
    public Set<IContenedor> getContenedores() {
        return this.contenedores;
    }

    @Override
    public void addContenedor(IContenedor contenedor) {
        this.contenedores.add(contenedor);
    }

    @Override
    public IContenedor addProducto(IProducto producto) {
        for (IContenedor contenedor : this.contenedores) {
            if (contenedor.meter(producto)) {
                return contenedor;
            }
        }

        return null;
    }

    @Override
    public String toString() {
        // el retorno del padre return super.toString();
        StringBuilder string = new StringBuilder();
        string.append("Pedido").append(referencia).append("\n");
        for (IContenedor contenedor : contenedores) {
            string.append("\t").append(contenedor).append("\n");
        }
        return string.toString();
    }

}

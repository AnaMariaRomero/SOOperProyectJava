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
        Set<IProducto> productos = null;
        //recorremos todos los productos
        for (IContenedor contenedor : this.contenedores) {
            if (productos == null) {
                productos = contenedor.getProductos();
            } else {
                productos.addAll(contenedor.getProductos());
            }
        }
        return productos;
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
        //recorremos todos los productos
        for (IContenedor contenedor : this.contenedores) {
            //luego, preguntamos al contenedor si admite el producto
            if (contenedor.meter(producto)) {
                //devolvemos el contenedor donde colocamos el producto
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
            for (IProducto producto : contenedor.getProductos()) {
                string.append("\t").append(producto).append("\n");
            }
        }
        return string.toString();
    }

}

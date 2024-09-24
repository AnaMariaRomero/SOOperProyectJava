package sooper;

import java.util.Set;


public class Pedido implements IPedido{

    private String referencia;
    private Set<IContenedor> contenedores;

    public Pedido(String referencia) {
        this.referencia = referencia;        
    }

    @Override
    public String getReferencia() {
        return referencia;
    }

    @Override
    public Set<IProducto> getProductos() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getProductos'");
    }

    @Override
    public Set<IContenedor> getContenedores() {
        return contenedores;
    }

    @Override
    public void addContenedor(IContenedor contendor) {
        contenedores.add(contendor);
    }

    @Override
    public IContenedor addProducto(IProducto producto) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addProducto'");
    }

}

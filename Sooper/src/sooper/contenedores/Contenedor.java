package sooper.contenedores;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import sooper.IContenedor;
import sooper.IProducto;

public abstract class Contenedor implements IContenedor {

    private final String referencia;
    private final int alto;
    //para que no nos llore al iterar products vacios, creamos a modo HeasSet
    private final Set<IProducto> productos = new HashSet<>();
    private final int resistencia;

    public Contenedor(String referencia, int alto, int resistencia) {
        this.alto = alto;
        this.referencia = referencia;
        this.resistencia = resistencia;
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
        //nos fijamos si tenemos volumen, esto es: el volumen propio
        //del contenedor y le restamos el volumen de los productos que tenemos
        return getVolumen() - volumenOcupado();
    }

    public int volumenOcupado() {
        int resultado = 0;
        for (IProducto producto : productos) {
            //consultamos el volumen de cada producto
            resultado += producto.getVolumen();
        }
        return resultado;
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
        //nos fijamos por la resistencia del contenedor con respecto al producto
        boolean resistenciaOk = this.resiste(producto);
        //nos fijamos si el volumen está bien para meter el producto
        boolean volumenOk = producto.tengoEspacio(this);
        boolean compatibilidadOk = true;

        boolean compatibleOk;
        /*necesitamos verificar la compatibilidad de los productos dentro de nuestro contenedor
        para ello necesitamos verificar si 
        -Los productos de alimentación no pueden ser mezclados con los de las otras categorías. 
        -Los productos de higiene no se pueden mezclar ni con los de alimentación,
        - y los de droguería, ni con los de alimentación ni con los de mascotas.
         */
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
        //el peso del producto debe ser más pqueño que la resistencia del contenedor
        return producto.getPeso() < this.resistencia;
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

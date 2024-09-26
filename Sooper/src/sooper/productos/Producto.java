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
        //necesito decirle si tengo espacio dentro de mi contenedor
        return contenedor.volumentDisponible() > volumen;
    }

    public void meter(IContenedor contenedor) {
        this.contenedor = contenedor;
    }

    //sobreescribo el toString para mostrar el contenido del producto    @Override
    @Override
    public String toString() {
        return "Producto{"
                + "peso=" + peso
                + ", referencia='" + referencia + '\''
                + ", volumen=" + volumen
                + '}';
    }
}

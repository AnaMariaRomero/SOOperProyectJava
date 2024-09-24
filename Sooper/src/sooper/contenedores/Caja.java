package sooper.contenedores;

import sooper.enums.TipoContenedor;

public class Caja extends Contenedor {

    private int ancho;
    private int largo;

    // iniciamos una caja con el constructor
    public Caja(String referencia, int ancho, int largo, int alto) {
        super(referencia, alto);
        this.setAncho(ancho);
        this.setLargo(largo);
    }

    public int getSuperficie() {
        return getLargo() * getAncho();
    }

    public TipoContenedor getTipo() {
        return TipoContenedor.CAJA;
    }

    public int getLargo() {
        return largo;
    }

    public final void setLargo(int largo) {
        this.largo = largo;
    }

    public int getAncho() {
        return ancho;
    }

    public final void setAncho(int ancho) {
        this.ancho = ancho;
    }

}

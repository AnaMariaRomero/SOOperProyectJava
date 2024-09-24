package sooper.contenedores;

import sooper.enums.TipoContenedor;

public class Bolsa extends Contenedor {

    private final int resistencia;
    private final int ancho;

    public Bolsa(String referencia, int alto, int ancho, int resistencia) {
        super(referencia, alto);
        this.resistencia = resistencia;
        this.ancho = ancho;
    }

    public int getSuperficie() {
        return (int) (Math.PI) * ((this.getDiametro()) / 2) * 2;
    }

    public TipoContenedor getTipo() {
        return TipoContenedor.BOLSA;
    }

    public int getDiametro() {
        return this.ancho;
    }

    public int getResistencia(){
        return resistencia;
    }

}

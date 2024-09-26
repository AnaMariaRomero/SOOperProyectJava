package sooper.contenedores;

import sooper.enums.TipoContenedor;

public class Bolsa extends Contenedor {

    private final int ancho;

    public Bolsa(String referencia, int alto, int ancho, int resistencia) {
        super(referencia, alto, resistencia);
        this.ancho = ancho;
    }

    @Override
    public int getSuperficie() {
        return (int) (Math.PI) * ((this.getDiametro()) / 2) * 2;
    }

    @Override
    public TipoContenedor getTipo() {
        return TipoContenedor.BOLSA;
    }

    public int getDiametro() {
        return (int) ((2 * this.ancho) / Math.PI);
    }

}

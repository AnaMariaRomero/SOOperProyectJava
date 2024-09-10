package sooper.contenedores;

public class Bolsa extends Contenedor {

    private final int resistencia;
    private final String tipo = "bolsa";
    private final int ancho;

    public Bolsa(String referencia, int alto, int resistencia, int ancho) {
        super(referencia, alto);
        this.resistencia = resistencia;
        this.ancho = ancho;
    }

    public int getSuperficie() {
        return (int) (Math.PI) * ((this.getDiametro()) / 2) * 2;
    }

    public String getTipo() {
        return tipo;
    }

    public int getDiametro() {
        return this.ancho;
    }

}

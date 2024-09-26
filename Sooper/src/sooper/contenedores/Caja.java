package sooper.contenedores;

import sooper.IProducto;
import sooper.enums.TipoContenedor;

public class Caja extends Contenedor {

    private int ancho;
    private int largo;

    // iniciamos una caja con el constructor
    public Caja(String referencia, int ancho, int largo, int alto) {
        //la caja no tiene resistencia por lo tanto le ponemos 0
        super(referencia, alto, 0);
        this.setAncho(ancho);
        this.setLargo(largo);
    }

    @Override
    public int getSuperficie() {
        return getLargo() * getAncho();
    }

    @Override
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

    /*hay una parte que dice: Las cajas son rectangulares
     y aguantan “cualquier peso”, mientras que las bolsas
      tienen una resistencia máxima.
      
      Por lo tanto, para las cajas vamos a crear un metodo que
      nos dija que el contenedor de tipo caja va a resistir cualquier peso, 
      mientras que para la bolsa tenemos que hacer otra cuestion.*/
    @Override
    public boolean resiste(IProducto producto) {
        return true;
    }

}

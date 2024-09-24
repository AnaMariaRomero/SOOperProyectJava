package sooper;

import sooper.contenedores.Bolsa;
import sooper.contenedores.Caja;

public class Supermercado {

    public static void main(String[] args) {
        IPedido iPedido = new Pedido("0001");

        IContenedor bolsa1 = new Bolsa("Bolsa1", 40, 25, 10);
        IContenedor caja1 = new Caja("caja1", 30, 50, 75);
        iPedido.addContenedor(bolsa1);
        iPedido.addContenedor(caja1);
    }
}

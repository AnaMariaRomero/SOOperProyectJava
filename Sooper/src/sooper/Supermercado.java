package sooper;

import sooper.contenedores.Bolsa;
import sooper.contenedores.Caja;
import sooper.productos.Congelados;
import sooper.productos.Fresco;
import sooper.productos.Higiene;

public class Supermercado {

    public static void main(String[] args) {
        IPedido iPedido = new Pedido("0001");

        IContenedor bolsa1 = new Bolsa("Bolsa1", 40, 25, 10);
        IContenedor caja1 = new Caja("caja1", 30, 50, 75);

        //creacion de contenedores + agregado de contenedores al pedido
        iPedido.addContenedor(bolsa1);
        iPedido.addContenedor(caja1);

        //creacion de productos para meter a los contenedores del pedido
        IProducto manzanas = new Fresco("MZN", 1000, 1500);
        IProducto helado = new Congelados("HLD", 800, 1000);
        IProducto papelWC = new Higiene("PWC", 800, 2500);
        IProducto peras = new Fresco("PER", 800, 1200);

        IContenedor contenedorManzanas = iPedido.addProducto(manzanas);
        IContenedor contenedorHelado = iPedido.addProducto(helado);
        IContenedor contenedorPapel = iPedido.addProducto(papelWC);
        IContenedor contenedorPeras = iPedido.addProducto(peras);

        System.out.println("Mi pedido: " + iPedido);

    }
}

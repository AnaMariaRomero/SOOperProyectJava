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
        IContenedor bolsa2 = new Bolsa("B111", 40, 25, 900);
        IContenedor caja2 = new Caja("C222", 30, 50, 75);
        iPedido.addContenedor(bolsa2);
        iPedido.addContenedor(caja2);
        //creacion de contenedores + agregado de contenedores al pedido
        iPedido.addContenedor(bolsa1);
        iPedido.addContenedor(caja1);
        System.out.println("Bolsa: " + bolsa1);
        System.out.println("Caja: " + caja1);
        System.out.println("Mi pedido con contenedores: " + iPedido);

        //creacion de productos para meter a los contenedores del pedido
        IProducto manzanas = new Fresco("MZN", 1000, 1500);
        IProducto helado = new Congelados("HLD", 800, 1000);
        IProducto papelWC = new Higiene("PWC", 800, 2500);
        IProducto peras = new Fresco("PER", 800, 1200);

        iPedido.addProducto(manzanas);
        iPedido.addProducto(helado);
        iPedido.addProducto(papelWC);
        iPedido.addProducto(peras);

        System.out.println("Mi pedido: " + iPedido.toString());

    }
}

package br.com.aula09.brownie3;

public class Main {
    public static void main(String[] args) {
        Brownie brownieNutella = new BrownieNutella("Brownie de Nutella", 7.50, "Nutella");
        Brownie brownieCafe = new BrownieCafe("Brownie de Café", 6.00, "Café");
        Brownie brownieDoceDeLeite = new BrownieDoceDeLeite("Brownie de Doce de Leite", 6.50, "Doce de leite");
        Comprador comprador = new Comprador("Kauã", 15.0);

        brownieNutella.mostrarInfo();
        brownieCafe.mostrarInfo();
        brownieDoceDeLeite.mostrarInfo();

        if (brownieCafe instanceof BrownieCafe){
            BrownieCafe bc = (BrownieCafe) brownieCafe;
            bc.adicionaCafe();
        }

        comprador.efetuarCompra(brownieNutella);
        comprador.efetuarCompra(brownieDoceDeLeite);
        comprador.efetuarCompra(brownieCafe);

        Brownie.calculaValorTotalCompra();
    }
}

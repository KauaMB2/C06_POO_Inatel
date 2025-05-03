package br.com.aula09.brownie3;

public class BrownieNutella extends Brownie {
    public BrownieNutella(String nome, double preco, String sabor){
        super(nome, preco, sabor);
    }

    public void adicionaNutella(){
        System.out.println("Foi adicionado mais Nutella no " + this.nome);
    }

    @Override
    public void addCarrinhoDeCompras(){
        System.out.println("Adicionado um brownie de nutella no carrinho de compras");
        super.addCarrinhoDeCompras();
    }

}

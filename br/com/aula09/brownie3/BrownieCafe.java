package br.com.aula09.brownie3;

public class BrownieCafe extends Brownie {
    public BrownieCafe(String nome, double preco, String sabor){
        super(nome, preco, sabor);
    }

    public void adicionaCafe(){
        System.out.println("Foi adicionado mais café no " + this.nome);
    }

    @Override
    public void addCarrinhoDeCompras(){
        System.out.println("Adicionado um brownie de café no carrinho de compras");
        super.addCarrinhoDeCompras();
    }
}

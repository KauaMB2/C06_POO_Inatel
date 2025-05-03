package br.com.aula09.brownie3;

public class BrownieDoceDeLeite extends Brownie {
    public BrownieDoceDeLeite(String nome, double preco, String sabor){
        super(nome, preco, sabor);
    }
    public void adicionaDoceDeLeite(){
        System.out.println("Foi adicionado mais leite no " + this.nome);
    }

    @Override
    public void addCarrinhoDeCompras(){
        System.out.println("Adicionado um brownie de doce de leite no carrinho de compras");
        super.addCarrinhoDeCompras();
    }
}

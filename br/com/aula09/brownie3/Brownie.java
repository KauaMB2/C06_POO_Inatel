package br.com.aula09.brownie3;

public class Brownie {
    protected String nome;
    protected double preco;
    protected String sabor;
    protected static Brownie[] carrinho = new Brownie[100];
    protected static int quantidadeNoCarrinho = 0;
    public Brownie(String nome, double preco, String sabor){
        this.nome = nome;
        this.preco = preco;
        this.sabor = sabor;
    }
    public void addCarrinhoDeCompras() {
        if (quantidadeNoCarrinho < carrinho.length) {
            carrinho[quantidadeNoCarrinho] = this;
            quantidadeNoCarrinho++;
            System.out.println(this.nome + " foi adicionado no carrinho.");
        } else {
            System.out.println("Carrinho cheio!");
        }
    }

    public static void calculaValorTotalCompra() {
        double total = 0;
        for (int i = 0; i < quantidadeNoCarrinho; i++) {
            total += carrinho[i].preco;
        }
        System.out.println("Valor total da compra: R$ " + total);
    }

    public void mostrarInfo(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Preço: " + this.preco);
        System.out.println("Sabor: " + this.sabor);
    }

}

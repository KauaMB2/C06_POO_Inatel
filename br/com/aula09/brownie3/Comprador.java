package br.com.aula09.brownie3;

public class Comprador {
    private String nome;
    private double saldo;
    public Comprador(String nome, double saldo){
        this.nome = nome;
        this.saldo = saldo;
    }

    public void efetuarCompra(Brownie brownie){
        if(brownie.preco > this.saldo){
            System.out.println("Não é possível efetuar a compra. Preço do brownie é maior que o saldo disponível.");
            return;
        }
        brownie.addCarrinhoDeCompras();
        this.saldo-=brownie.preco;
        if(this.saldo < 0.0){
            this.saldo = 0.0;
        }
    }

}

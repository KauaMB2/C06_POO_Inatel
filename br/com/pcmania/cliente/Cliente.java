package br.com.pcmania.cliente;

import br.com.pcmania.computador.Computador;

public class Cliente {
    private String nome;
    private long cpf;
    private Computador[] computadores;

    public Cliente(String nome, long cpf){
        this.nome = nome;
        this.cpf = cpf;
        this.computadores = new Computador[10];
    }

    public String getNome(){
        return this.nome;
    }

    public long getCpf(){
        return this.cpf;
    }

    public Computador[] getComputadores(){
        return this.computadores;
    }

    public float calculaTotalCompra(){
        float total = 0;
        for (Computador carrinhoDeCompra : computadores) {
            if (carrinhoDeCompra != null) {
                total += carrinhoDeCompra.getPreco();
            }
        }
        return total;
    }

    public void compra(Computador computador){
        for (int i = 0; i < computadores.length; i++) {
            if (computadores[i] == null) {
                computadores[i] = computador;
                System.out.println("Computador adicionado ao carrinho: " + computador.getMarca());
                return;
            }
        }
    }
}

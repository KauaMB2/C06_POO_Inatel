package br.com.aula06;

public class Conta {
    private int numero;
    private float saldo;
    private float limite;
    private Cliente cliente;

    public Conta(int numero, float saldo, float limite, Cliente cliente) {
        this.numero = numero;
        this.saldo = saldo;
        this.limite = limite;
        this.cliente = cliente;
    }

    public void sacar(float quantia) {
        if (quantia <= (saldo + limite)) {
            saldo -= quantia;
            System.out.println("Saque de R$" + quantia + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para sacar R$" + quantia);
        }
    }

    public void depositar(float quantia) {
        saldo += quantia;
        System.out.println("Depósito de R$" + quantia + " realizado com sucesso.");
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}

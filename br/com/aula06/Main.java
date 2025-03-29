package br.com.aula06;

public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("Fulano da Silva", 12345678900L);

        Conta conta = new Conta(1234, 0.0f, 500.0f, cliente);

        System.out.println("Cliente: " + conta.getCliente().getNome());
        System.out.println("CPF: " + conta.getCliente().getCpf());
        System.out.println("Número da Conta: " + conta.getNumero());
        System.out.println("Saldo Inicial: " + conta.getSaldo());
        System.out.println("Limite: " + conta.getLimite());

        conta.depositar(1000f);
        conta.sacar(300f);
        conta.sacar(800f);

        conta.sacar(800f);

        System.out.println("Saldo Final: " + conta.getSaldo());
    }
}

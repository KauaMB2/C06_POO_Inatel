package br.com.pcmania;

import br.com.pcmania.cliente.Cliente;
import br.com.pcmania.computador.Computador;
import br.com.pcmania.hardwarebasico.HardwareBasico;
import br.com.pcmania.memoriausb.MemoriaUSB;
import br.com.pcmania.sistemaoperacional.SistemaOperacional;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HardwareBasico proc1 = new HardwareBasico("Pentium Core i3", 2200);
        HardwareBasico ram1 = new HardwareBasico("Memória RAM", 8);
        HardwareBasico hd1 = new HardwareBasico("HD", 500);

        HardwareBasico proc2 = new HardwareBasico("Pentium Core i5", 3370);
        HardwareBasico ram2 = new HardwareBasico("Memória RAM", 16);
        HardwareBasico hd2 = new HardwareBasico("HD", 1000);

        HardwareBasico proc3 = new HardwareBasico("Pentium Core i7", 4500);
        HardwareBasico ram3 = new HardwareBasico("Memória RAM", 32);
        HardwareBasico hd3 = new HardwareBasico("HD", 2000);

        MemoriaUSB usb1 = new MemoriaUSB("Pen-drive", 16);
        MemoriaUSB usb2 = new MemoriaUSB("Pen-drive", 32);
        MemoriaUSB usb3 = new MemoriaUSB("HD Externo", 1000);

        SistemaOperacional so1 = new SistemaOperacional("Linux Ubuntu", 32);
        SistemaOperacional so2 = new SistemaOperacional("Windows 8", 64);
        SistemaOperacional so3 = new SistemaOperacional("Windows 10", 64);

        Computador pc1 = new Computador("Apple", 8000, proc1, ram1, hd1, so1);
        Computador pc2 = new Computador("Samsung", 9234, proc2, ram2, hd2, so2);
        Computador pc3 = new Computador("Dell", 15678, proc3, ram3, hd3, so3);

        pc1.addMemoriaUSB(usb1);
        pc2.addMemoriaUSB(usb2);
        pc3.addMemoriaUSB(usb3);

        printTable(pc1, pc2, pc3);

        Cliente c1 = new Cliente("Kauã", 654165523);

        Scanner scanner = new Scanner(System.in);
        String promocaoSelecionada = "0";
        do {
            System.out.printf("Total comprado até agora: R$ %.2f\n", c1.calculaTotalCompra());
            System.out.println("0 - Finalizar compra");
            System.out.println("1 - Promoção 1");
            System.out.println("2 - Promoção 2");
            System.out.println("3 - Promoção 3");
            System.out.print("Selecione uma das promoções acima: ");
            promocaoSelecionada = scanner.nextLine();
            switch (promocaoSelecionada) {
                case "0":
                    break;
                case "1":
                    c1.compra(pc1);
                    break;
                case "2":
                    c1.compra(pc2);
                    break;
                case "3":
                    c1.compra(pc3);
                    break;
                default:
                    System.out.println("Você digitou uma opção inválida. Somente '0', '1', '2' ou '3' são aceitos como dígitos de entrada.");
                    break;
            }
        } while (!promocaoSelecionada.equals("0"));
        scanner.close();
        System.out.println("COMPRA FINALIZADA!!!!!");
        System.out.printf("Preço final: R$ %.2f\n", c1.calculaTotalCompra());
        System.out.println("Nome do cliente: " + c1.getNome());
        System.out.println("CPF do cliente: " + c1.getCpf());
        System.out.println("Computadores comprados: ");
        for (Computador computador : c1.getComputadores()){
            if(computador != null){
                computador.mostrarPCConfigs();
            }
        }
    }

    public static void printTable(Computador pc1, Computador pc2, Computador pc3) {
        System.out.println("+--------------------------------+--------------------------+--------------------------+--------------------------+");
        System.out.println("|          Informação            |        Promoção 1        |        Promoção 2        |        Promoção 3        |");
        System.out.println("+--------------------------------+--------------------------+--------------------------+--------------------------+");

        System.out.printf("| %-30s | %-24s | %-24s | %-24s |\n", "Marca", pc1.getMarca(), pc2.getMarca(), pc3.getMarca());

        System.out.printf("| %-30s | %-24s | %-24s | %-24s |\n", "Preço",
                String.format("R$ %.2f", pc1.getPreco()),
                String.format("R$ %.2f", pc2.getPreco()),
                String.format("R$ %.2f", pc3.getPreco()));

        System.out.printf("| %-30s | %-24s | %-24s | %-24s |\n", "Processador",
                pc1.getProcessador().getNome() + " " + pc1.getProcessador().getCapacidade() + " MHz",
                pc2.getProcessador().getNome() + " " + pc2.getProcessador().getCapacidade() + " MHz",
                pc3.getProcessador().getNome() + " " + pc3.getProcessador().getCapacidade() + " MHz");

        System.out.printf("| %-30s | %-24s | %-24s | %-24s |\n", "Memória RAM",
                pc1.getMemoriaRAM().getCapacidade() + " GB",
                pc2.getMemoriaRAM().getCapacidade() + " GB",
                pc3.getMemoriaRAM().getCapacidade() + " GB");

        System.out.printf("| %-30s | %-24s | %-24s | %-24s |\n", "Armazenamento",
                pc1.getMemoriaROM().getCapacidade() + " GB",
                pc2.getMemoriaROM().getCapacidade() + " GB",
                pc3.getMemoriaROM().getCapacidade() + " GB");

        System.out.printf("| %-30s | %-24s | %-24s | %-24s |\n", "Sistema Operacional",
                pc1.getSistemaOperacional().getNome() + " (" + pc1.getSistemaOperacional().getTipo() + " bits)",
                pc2.getSistemaOperacional().getNome() + " (" + pc2.getSistemaOperacional().getTipo() + " bits)",
                pc3.getSistemaOperacional().getNome() + " (" + pc3.getSistemaOperacional().getTipo() + " bits)");

        System.out.printf("| %-30s | %-24s | %-24s | %-24s |\n", "Memória USB",
                pc1.getMemoriaUSB().getNome() + " " + pc1.getMemoriaUSB().getCapacidade() + " GB",
                pc2.getMemoriaUSB().getNome() + " " + pc2.getMemoriaUSB().getCapacidade() + " GB",
                pc3.getMemoriaUSB().getNome() + " " + pc3.getMemoriaUSB().getCapacidade() + " GB");

        System.out.println("+--------------------------------+--------------------------+--------------------------+--------------------------+");
    }

}

package br.com.pcmania.computador;

import br.com.pcmania.hardwarebasico.HardwareBasico;
import br.com.pcmania.memoriausb.MemoriaUSB;
import br.com.pcmania.sistemaoperacional.SistemaOperacional;

public class Computador {
    private String marca;
    private float preco;
    private MemoriaUSB memoriaUSB;
    private HardwareBasico processador;
    private SistemaOperacional sistemaOperacional;
    private HardwareBasico memoriaRAM;
    private HardwareBasico memoriaROM;

    public Computador(String marca, float preco, HardwareBasico processador,
                      HardwareBasico memoriaRAM, HardwareBasico memoriaROM, SistemaOperacional sistemaOperacional) {
        this.marca = marca;
        this.preco = preco;
        this.processador = processador;
        this.memoriaRAM = memoriaRAM;
        this.memoriaROM = memoriaROM;
        this.sistemaOperacional = sistemaOperacional;
        this.memoriaUSB = null;
    }

    public void mostrarPCConfigs(){
        System.out.println("==========================================================");
        System.out.println("Marca: " + this.marca + " | Preço: " + this.preco);
        System.out.println("Memória USB instalada: " + (this.memoriaUSB != null ? this.memoriaUSB.getCapacidade() + " Gb" : "Nenhuma memória USB instalada."));
        System.out.println("Processador: " + this.processador.getNome() + " | Capacidade: " + this.processador.getCapacidade() + " Mhz");
        System.out.println("Memória RAM: " + this.memoriaRAM.getNome() + " | Capacidade: " + this.memoriaRAM.getCapacidade() + " Gb");
        System.out.println("Memória ROM: " + this.memoriaROM.getNome() + " | Capacidade: " + this.memoriaROM.getCapacidade() + " Gb");
    }

    public void addMemoriaUSB(MemoriaUSB musb) {
        if (this.memoriaUSB == null) {
            this.memoriaUSB = musb;
        } else {
            System.out.println("Já existe uma memória USB instalada. Não é possível adicionar outra.");
        }
    }

    // Getters
    public String getMarca() {
        return marca;
    }

    public float getPreco() {
        return preco;
    }

    public HardwareBasico getProcessador() {
        return processador;
    }

    public SistemaOperacional getSistemaOperacional() {
        return sistemaOperacional;
    }

    public HardwareBasico getMemoriaRAM() {
        return memoriaRAM;
    }

    public HardwareBasico getMemoriaROM() {
        return memoriaROM;
    }

    public MemoriaUSB getMemoriaUSB() {
        return memoriaUSB;
    }
}
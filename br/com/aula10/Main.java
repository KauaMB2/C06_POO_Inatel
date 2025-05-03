package br.com.aula10;

public class Main {
    public static void main(String args[]){
        Lontra lontra = new Lontra("Lontra 1", 100.0);
        Cachorro cachorro = new Cachorro("Cachorro 1", 100.0);
        Boi boi = new Boi("Boi 1", 100.0);
        lontra.emitirSom();
        cachorro.emitirSom();
        boi.emitirSom();
    }
}

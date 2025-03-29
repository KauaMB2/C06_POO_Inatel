package br.com.aula05.multiplicidade;

public class Main {
    public static void main(String[] args) {
        Cantina c = new Cantina("Cantina do Inatel");
        Salgado s1 = new Salgado("Salada de Frango");
        Salgado s2 = new Salgado("Salada de Atum");
        Salgado s3 = new Salgado("Pão com pernil");
        c.addSalgado(s1);
        c.addSalgado(s2);
        c.addSalgado(s3);
        c.mostraInfo();
    }
}

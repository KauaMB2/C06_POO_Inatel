package br.com.aula05.multiplicidade;

class Cantina {
    String nome;
    Salgado[] salgados;
    int count;

    public Cantina(String nome) {
        this.nome = nome;
        this.salgados = new Salgado[10];
        this.count = 0;
    }

    public void addSalgado(Salgado novoSalgado) {
        if (count == salgados.length) {
            Salgado[] newSalgados = new Salgado[salgados.length * 2];
            System.arraycopy(salgados, 0, newSalgados, 0, salgados.length);
            salgados = newSalgados;
        }
        salgados[count] = novoSalgado;
        count++;
    }

    public void mostraInfo() {
        System.out.println("Cantina: " + this.nome);
        System.out.println("Salgados: ");
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + " - " + this.salgados[i].nome);
        }
    }
}

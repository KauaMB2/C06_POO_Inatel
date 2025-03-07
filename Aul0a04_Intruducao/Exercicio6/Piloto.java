package Aul0a04_Intruducao.Exercicio6;

class Piloto {
    String nome;
    boolean vilao;

    public Piloto(String nome, boolean vilao) {
        this.nome = nome;
        this.vilao = vilao;
    }

    public void soltaSuperPoder() {
        System.out.println(nome + " usou seu superpoder!");
    }
}
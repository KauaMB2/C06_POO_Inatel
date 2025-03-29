package br.com.aula04.Biblioteca;

class Autor{
    public String nome;
    public String nacionalidade;
    public Autor (String nome, String nacionalidade){
        this.nome = nome;
        this.nacionalidade = nacionalidade;
    }
    public Livro escreverLivro(String titulo) {
        Livro livro = new Livro(titulo, this);
        return livro;
    }
    public String obterBiografia(){
        return "O autor "+this.nome+" é de "+this.nacionalidade;
    }
}
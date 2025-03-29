package br.com.aula04.Biblioteca;

class Livro{
    public String titulo;
    public Autor autor;
    public Livro (String titulo, Autor autor){
        this.titulo = titulo;
        this.autor = autor;
    }
    public void detalhes (){
        System.out.println("Nome: " + this.titulo + " | Autor: " + this.autor);
    }
    public void emprestar (){
        System.out.println("Livro " + this.titulo + " emprestado");
    }
    public void devolver (){
        System.out.println("Livro " + this.titulo + " devolvido");
    }
}
package br.com.aula04.Biblioteca;

public class Main {
    public static void main(String[] args) {
        Autor autor1 = new Autor("Machado de Assis", "Brasileira");
        Autor autor2 = new Autor("Platão", "Grego");

        Livro livro1 = autor1.escreverLivro("Dom Casmurro");
        Livro livro2 = autor2.escreverLivro("A República");

        Biblioteca biblioteca = new Biblioteca("Biblioteca Municipal", "Avenida Inatel, 123");
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);

        Pessoa pessoa = new Pessoa("Carlos", 25);
        pessoa.emprestarLivro(livro1);
        pessoa.listarLivrosEmprestados();

        pessoa.devolverLivro(livro1);
        pessoa.listarLivrosEmprestados();

        biblioteca.listarLivro();
    }
}

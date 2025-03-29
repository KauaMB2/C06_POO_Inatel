package br.com.aula04.Biblioteca;

class Pessoa{
    public String nome;
    public int idade; 
    private Livro[] livros;
    private int numberOfBooks;
    public Pessoa (String nome, int idade){
        this.nome = nome;
        this.idade = idade;
        this.livros = new Livro[10];
        this.numberOfBooks = 0;
    }
    public void emprestarLivro(Livro livro){
        this.livros[numberOfBooks] = livro;
        this.numberOfBooks++;
        livro.emprestar();
    }
    public void devolverLivro(Livro livro){
        boolean found = false;
        for (int i = 0; i < numberOfBooks; i++) {
            if (livros[i] == livro) {
                livros[i] = livros[numberOfBooks - 1];
                livros[numberOfBooks - 1] = null;
                numberOfBooks--;
                found = true;
                livro.devolver();
                break;
            }
        }
        if (!found) {
            System.out.println("Livro não encontrado na lista de empréstimos.");
        }
    }
    public void listarLivroEmprestado(Livro livro){
        System.out.println("Livro emprestado: " + livro.titulo);
    }
    public void listarLivrosEmprestados(){
        System.out.println("Número total de livros emprestados para " + nome + ": " + numberOfBooks);
        for (int i=0; i<numberOfBooks; i++){
            System.out.println("Livro " + livros[i].titulo + " do autor " + livros[i].autor.nome);
        }
    }
}
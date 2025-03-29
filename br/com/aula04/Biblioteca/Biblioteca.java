package br.com.aula04.Biblioteca;

class Biblioteca{
    public String nome;
    public String endereco;
    private Livro[] livros;
    private int numberOfBooks;
    public Biblioteca (String nome, String endereco){
        this.nome = nome;
        this.endereco = endereco;
        this.livros = new Livro[100];
        this.numberOfBooks = 0;
    }
    public void adicionarLivro(Livro livro){
        livros[numberOfBooks] = livro;
        numberOfBooks++;
        System.out.println("Livro " + livro.titulo + " adicionado com sucesso!");
    }
    public void removerLivro(Livro livro){
        boolean found = false;
        for (int i = 0; i < numberOfBooks; i++) {
            if (livros[i] == livro) {
                livros[i] = livros[numberOfBooks - 1];
                livros[numberOfBooks - 1] = null;
                numberOfBooks--;
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Livro não encontrado na lista de empréstimos.");
        }
    }
    public void listarLivro(){
        System.out.println("Número total de livros é: " + numberOfBooks);
        for (int i=0; i<numberOfBooks; i++){
            System.out.println("Livro " + livros[i].titulo + " do autor " + livros[i].autor.nome);
        }
    }
}
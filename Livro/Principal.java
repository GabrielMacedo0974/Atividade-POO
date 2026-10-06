package Livro;

public class Principal {
    public static void main(String[] args) {
        Livro meuLivro = new Livro("Dom Casmurro", "Machado de Assis", "Principis", "978-8538012345", 256);

        meuLivro.lerLivro(10);

        System.out.println("-----------------------------------");

        meuLivro.abrirLivro();
        meuLivro.lerLivro(10);
        meuLivro.lerLivro(35);
    }
}

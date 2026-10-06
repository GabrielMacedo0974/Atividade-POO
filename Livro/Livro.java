package Livro;

public class Livro {
    String titulo;
    String autor;
    String editora;
    String isbn;
    int numeroPaginas;
    boolean aberto;

    public Livro(String titulo, String autor, String editora, String isbn, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.isbn = isbn;
        this.numeroPaginas = numeroPaginas;
        this.aberto = false;
    }

    //Titulo
    public String getTitulo() {return titulo;}
    public void setTitulo(String titulo) {this.titulo = titulo;}

    //Autor
    public String getAutor() {return autor;}
    public void setAutor(String autor) {this.autor = autor;}

    //Editora
    public String getEditora() {return editora;}
    public void setEditora(String editora) {this.editora = editora;}

    //Isbn
    public String getIsbn() {return isbn;}
    public void setIsbn(String isbn) {this.isbn = isbn;}

    //Numero de Paginas
    public int getNumeroPaginas() {return numeroPaginas;}
    public void setNumeroPaginas(int numeroPaginas) {this.numeroPaginas = numeroPaginas;}

    //Estado do Livro (Aberto ou Fechado)
    public boolean isaberto() {return aberto;}

    //Abrir Livro
    public void abrirLivro() {
        if (this.aberto) {
            System.out.println("Livro \"" + this.titulo + "\" já aberto.");
        } else {
            this.aberto = true;
            System.out.println("Voce Abriu o Livro: \"" + this.titulo + "\".");
        }
    }


    //Ler Paginas Especificas
    public void lerLivro(int numero) {
        if (!this.aberto) {
            System.out.println("É Necessario Abrir o Livro para ler ");
        } else if (numero <= 0 || numero > this.numeroPaginas) {
            System.out.println("Pagina " + numero + "Invalida. o Livro Possui " + this.numeroPaginas + "Paginas.");
        }else  {
            System.out.println("Lendo pagina " + numero + " de \"" + this.titulo + "\".");
        }
    }
}
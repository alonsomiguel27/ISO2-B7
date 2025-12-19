package Servidor;

public class BibliografiaRecomendada {

    private String isbn;
    private String titulo;
    private String autor;

    public BibliografiaRecomendada(String isbn, String titulo, String autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }
}

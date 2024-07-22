package list.Terceiro;

public class Biblioteca {
    public static void main(String[] args) {
        catalogoLivros c = new catalogoLivros();
        c.adicionarLivro("Livro 1","A", 2006);
        c.adicionarLivro("Livro 1","C", 2005);
        c.adicionarLivro("Livro 2","B", 2004);
        c.adicionarLivro("Livro 3","B", 1976);
        c.adicionarLivro("Livro 4", "A",2015);

        System.out.println(c.pesquisarTitulo("Livro 1"));

    }
}

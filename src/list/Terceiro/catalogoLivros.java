package list.Terceiro;

import java.util.ArrayList;
import java.util.List;

public class catalogoLivros {
    private List<Livro> livroList;

    public catalogoLivros() {
        this.livroList = new ArrayList<>();
    }
    public void adicionarLivro(String titulo, String autor, int anoDePublicacao) {
        livroList.add(new Livro(titulo, autor, anoDePublicacao));
    }
    public List<Livro> pesquisarAutor (String autor){
        List<Livro> livrosAutor = new ArrayList<>();
        if(!livroList.isEmpty()){
            for(Livro livro : livroList){
                if (livro.getAutor().equalsIgnoreCase(autor)){
                    livrosAutor.add(livro);
                }
            }
        }
        return livrosAutor;
    }
    public List<Livro> pesquisarPorAno(int anoInicial, int anoFinal){
        List<Livro> livrosPorAno = new ArrayList<>();
        if(!livroList.isEmpty()){
            for (Livro livro : livroList){
                if (livro.getAnoDePublicacao() >= anoInicial && livro.getAnoDePublicacao() <= anoFinal){
                    livrosPorAno.add(livro);
                }
            }
        }
        return livrosPorAno;
    }
    public Livro pesquisarTitulo(String titulo){
        Livro livroTitulo = null;
        if (!livroList.isEmpty()){
            for (Livro livro : livroList ){
                if (livro.getTitulo().equalsIgnoreCase(titulo)){
                    livroTitulo = livro;
                    break;
                }
            }
        }
        return livroTitulo;
    }

}

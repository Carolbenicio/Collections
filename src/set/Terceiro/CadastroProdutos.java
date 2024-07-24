package set.Terceiro;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(int codigo, String nome, double preço, int quantidade){
        produtoSet.add(new Produto(nome, codigo, preço, quantidade));
    }
    public Set<Produto> exibiProdutosNome() {
        Set<Produto> produtosNome = new TreeSet<>(produtoSet);
        return produtosNome;
    }
    public Set<Produto> exibiProdutosPreço(){
        Set<Produto> produtosPreço = new TreeSet<>(new CompararPreço());
        produtosPreço.addAll(produtoSet);
        return produtosPreço;
    }
    public class CompararPreço implements Comparator<Produto>{
        public int compare(Produto p1, Produto p2) {
            return Double.compare(p1.getPreço(), p2.getPreço());
        }
    }
}

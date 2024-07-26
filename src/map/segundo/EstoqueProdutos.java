package map.segundo;
import java.util.HashMap;
import java.util.Map;
public class EstoqueProdutos {
    
    private Map<Long, Produto> estoqueMap;

    public EstoqueProdutos(){
        this.estoqueMap = new HashMap<>();
    }
    public void addProduto(long cod, String nome, double preço, int quantidade){
        estoqueMap.put(cod, new Produto(nome, preço, quantidade));
    }
    public void exibirProdutos(){
        System.out.println(estoqueMap);
    }
    public double calculaValorTotal(){
       double valorTotal = 0;
        if (!estoqueMap.isEmpty()) {
            for (Produto p : estoqueMap.values()) {
                valorTotal += p.getQuantidade() * p.getPreço();
            }
        }
        return valorTotal;
    }
    public Produto obterProdutoCaro() {
        Produto produtoCaro = null;
        double maiorPreço = Double.MIN_VALUE;
    
        for (Produto p : estoqueMap.values()) {
            if (p.getPreço() > maiorPreço) {
                produtoCaro = p;
            }
        }
    
        return produtoCaro;
    }
    
} 

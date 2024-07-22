package list.Segundo;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {
    List<Item> Compras;

    public CarrinhoCompras() {
        this.Compras = new ArrayList<Item>();
    }
    public void adicionarItem(String nome, int quantidade, double preço) {
        Item novoItem = new Item(nome, quantidade, preço); // Crie um novo objeto Item
        this.Compras.add(novoItem); // Adicione o objeto Item à lista
    }
    public void removerItem(Item item) {
        this.Compras.remove(item);
    }
    public double calcularValorTotal(int quantidade, double preço){
        return quantidade * preço;
    }
    public void exibirItens(){
        System.out.println("Compras: " + Compras);
    }
   }

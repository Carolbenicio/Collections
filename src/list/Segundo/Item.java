package list.Segundo;

public class Item {
    String nome;
    int quantidade;
    double preço;

    public Item(String nome, int quantidade, double preço) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preço = preço;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPreço() {
        return preço;
    }

    @Override
    public String toString() {
        return "Item{" +
                "nome='" + nome + '\'' +
                ", quantidade=" + quantidade +
                ", preço=" + preço +
                '}';
    }
}

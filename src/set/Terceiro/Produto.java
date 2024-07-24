package set.Terceiro;

import java.util.Comparator;

import set.Primeiro.p1;

public class Produto implements Comparable<Produto>{
    private String nome;
    private int codigo;
    private double preço;
    private int quantidade;
    
    public Produto(String nome, int codigo, double preço, int quantidade) {
        this.nome = nome;
        this.codigo = codigo;
        this.preço = preço;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public double getPreço() {
        return preço;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + codigo;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Produto other = (Produto) obj;
        if (codigo != other.codigo)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Produto [nome=" + nome + ", codigo=" + codigo + ", preço=" + preço + ", quantidade=" + quantidade + "]";
    }

    @Override
    public int compareTo(Produto p) {
        return nome.compareToIgnoreCase(p.getNome());
    }  
}

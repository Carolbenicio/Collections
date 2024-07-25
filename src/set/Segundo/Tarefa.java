package set.Segundo;

public class Tarefa {
    private String descricao;
    private boolean Concluida;

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }
    

    public Tarefa(boolean concluida) {
        Concluida = concluida;
    }


    public String getDescricao() {
        return descricao;
    }

    public boolean isConcluida() {
        return Concluida;
    }

    @Override
    public String toString() {
        return "Tarefa [ descriç ão = " + descricao + ", Concluida= " + Concluida + "]";
    }

    
    
}

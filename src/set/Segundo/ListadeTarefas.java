package set.Segundo;

import java.util.HashSet;
import java.util.Set;

public class ListadeTarefas {
    private Set<Tarefa> tSet;

    public ListadeTarefas() {
        this.tSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        tSet.add(new Tarefa(descricao));
    }
    public void removerTarefa(String descricao){
        Tarefa tarefaRemove = null;
        for (Tarefa t : tSet) {
            if (t.getDescricao() != null) {
                tarefaRemove = t;
                break;
            }
        }
        tSet.remove(tarefaRemove);
    }
    public void exibiTarefas(){
        if (!tSet.isEmpty()) {
            System.out.println(tSet);
        } else{
            System.out.println("Tarefa não encontrada");
        }
    }
    public int contarTarefas(){
        return tSet.size(); 
    }
    public Set<Tarefa> contarConcluidasTarefas(){
        boolean tarefaConcluida;
        for (Tarefa t: tSet) {
            if (t.isConcluida()) {
                tarefaConcluida = true;
            }
        }
        return tSet;
    }
    public Set<Tarefa> contarTarefasPendentes(){
        boolean tarefaPendente;
        for (Tarefa t: tSet) {
            if (t.isConcluida()) {
                tarefaPendente = false;
            }
        }
        return tSet;
    }
    public static void limparLista(Set<String> tSet) {
        tSet.clear();
    }
}


package list.Primeiro;
import java.util.ArrayList;
import java.util.List;

public class Listadetarefas {
    private List<Tarefa> tarefaList;

    public Listadetarefas() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descriçao){
        tarefaList.add(new Tarefa(descriçao));
    }
    public void removerTarefa(String descriçao){
        List<Tarefa> tarefaRemover  = new ArrayList<>();
        for(Tarefa tarefa : tarefaList){
            if (tarefa.getDescriçao().equalsIgnoreCase(descriçao)){
                tarefaRemover.add(tarefa);
              }
            }
        tarefaList.removeAll(tarefaRemover);
        }
        public int quantidadeTarefa(){
        return tarefaList.size();
        }
        public void obterDescriçoesTarefas(){
            System.out.println("Tarefas: " + tarefaList);
        }

    }


package set.Segundo;

public class Super {
    public static void main(String[] args) {
        ListadeTarefas l = new ListadeTarefas();

        l.exibiTarefas();

        l.adicionarTarefa("Tarefa 1");
        l.adicionarTarefa("Tarefa 2");
        l.adicionarTarefa("Tarefa 3");
        l.adicionarTarefa("Tarefa 4");

        l.removerTarefa("Tarefa 1");
        l.exibiTarefas(); 
        System.out.println(l.contarTarefas());
        
    }
}

package list.Primeiro;

public class testando {
    public static void main(String[] args) {
        Listadetarefas lista = new Listadetarefas();

        System.out.println("Quantidade: " + lista.quantidadeTarefa());
        lista.adicionarTarefa("Tarefa 1");
        lista.adicionarTarefa("Tarefa 2");
        lista.adicionarTarefa("Tarefa 3");
        System.out.println("Quantidade: " + lista.quantidadeTarefa());

        //lista.removerTarefa("Tarefa 3");
        //System.out.println("Quantidade: " + lista.quantidadeTarefa());

        lista.obterDescriçoesTarefas();

    }
}

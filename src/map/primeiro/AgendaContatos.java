package map.primeiro;
import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendMap; 

    public AgendaContatos() {
        this.agendMap = new HashMap<>();
    }
    public void adicionarContatos(String nome, Integer telefone){
       agendMap.put(nome, telefone);
    }
    public void removerContatos(String nome){
        if (!agendMap.isEmpty()) {
            agendMap.remove(nome);
        }
    }
    public void exibirContatos(){
        System.out.println(agendMap);
    }
    public Integer pesquisarNome(String nome){
        Integer numeroNome = null;
        if (!agendMap.isEmpty()) {
           numeroNome = agendMap.get(nome);
        }
        return numeroNome;
    }
}


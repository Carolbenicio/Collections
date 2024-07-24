package set.Segundo;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();

    }

    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }
    public void exibirContato(){
        System.out.println(contatoSet);
    }
    public Set<Contato> pesquisarContatos(String nome){
        Set<Contato> contatoNome = new HashSet<>();
        for(Contato c : contatoSet){
            if (c.getNome().startsWith(nome)) {
                contatoNome.add(c);
            }
        }
        return contatoNome;
    }
    public Contato atualizarContato(String nome, int novoNumero){
        Contato contatoNovo = null;
        for (Contato c : contatoSet) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                contatoNovo = c;
                break;
            }
        }
        return contatoNovo;
    }

}

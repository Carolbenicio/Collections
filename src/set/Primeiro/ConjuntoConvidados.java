package set.Primeiro;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }
    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadoSet.add(new Convidado(nome,codigoConvite));
    }
    public void removerConvidado (int codigoConvite) {
        Convidado convidadoRemover = null;
        for (Convidado c : convidadoSet) {
            if (c.getCodigoConvite() == codigoConvite) {
                convidadoRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoRemover);
    }
    public int contarConvidados() {
        return convidadoSet.size();
    }
    public Set<Convidado> imprimirConvidados() {
        System.out.println(convidadoSet);
        return convidadoSet;
    }
}

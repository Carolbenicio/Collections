package set.Primeiro;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<Palavra> palavraSet;

    public ConjuntoPalavrasUnicas() {
        this.palavraSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        palavraSet.add(new Palavra(palavra));
    }

    public void removerPalavra(String palavra) {
        Palavra palavra1 = null;
        for (Palavra p : palavraSet) {
            if (p.getPalavra() == palavra) {
                palavraSet.remove(p);
                break;
            }
        }
    }

    public void verificarPalavra(String palavra) {
        palavraSet.contains(palavra);
    }

    public void exibirPalavrasUnicas() {
        for (Palavra palavra : palavraSet) {
            System.out.println(palavra);
        }
    }

    @Override
    public String toString() {
        return "ConjuntoPalavrasUnicas{" +
                "palavraSet=" + palavraSet +
                '}';

    }
}



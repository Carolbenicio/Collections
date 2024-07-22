package list.Quarto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdemPessoas {
    private List<Pessoa> pessoaList;

    public OrdemPessoas() {
        this.pessoaList = new ArrayList<>() ;
    }
    public void adicionarPessoas(String nome, int idade, double altura ){
        pessoaList.add(new Pessoa(nome,idade,altura));
    }
    //usando comparable
    public List<Pessoa> ordenaIdade(){
        List<Pessoa> pessoasIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasIdade);
        return pessoasIdade;
    }
    public List<Pessoa> ordenaAltura(){
        List<Pessoa> pessoaAltura = new ArrayList<>(pessoaList);
        pessoaAltura.sort(new ComparatorPorAltura());
        return pessoaAltura;
    }
}

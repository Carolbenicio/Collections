package set.Primeiro;

import java.util.Collections; 

public class p1 {
    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjunto = new ConjuntoPalavrasUnicas();

        conjunto.adicionarPalavra("Um");
        conjunto.adicionarPalavra("dois");
        conjunto.adicionarPalavra("Tres");
        conjunto.adicionarPalavra("Quatro");
        conjunto.adicionarPalavra("Cinco");


        //ystem.out.println(conjunto);
        //conjunto.verificarPalavra("Cinco");
        conjunto.exibirPalavrasUnicas();


    }
}

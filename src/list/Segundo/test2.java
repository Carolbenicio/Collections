package list.Segundo;

public class test2 {
    public static void main(String[] args) {
        CarrinhoCompras compras = new CarrinhoCompras();
        compras.exibirItens();
        compras.adicionarItem("Base", 3, 40.00);
        compras.adicionarItem("Batom", 1, 50.00);
        compras.exibirItens();

        System.out.println("Valor total: " + compras.calcularValorTotal(3,40));

    }
}

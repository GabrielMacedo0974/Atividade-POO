package Produto;

public class Principal {
    public static void main(String[] args) {
        Produtos produto1 = new Produtos(101, "Teclado", "Teclado Red Dragon", 150, 200.0);

        System.out.println("Codigo: " + produto1.getCodigo());
        System.out.println("Nome: " + produto1.getNome());
        System.out.println("Preco: R$ " + produto1.getPrecoVenda());
        System.out.println("------------------------------------------");

        System.out.println("---Tentativa de Venda Excessiva---");
        produto1.vender(11);
        System.out.println("------------------------------------------");

        System.out.println("---Realizando Venda ---");
        produto1.vender(10);
        System.out.println("Estoque Restante: " + produto1.getQuantidade());
        System.out.println("----------------------------------------");

        //Repondo Estoque
        System.out.println("---Reposicao Estoque ---");
        produto1.reporEstoque(10);
        System.out.println("Estoque Apos Reposicao: " + produto1.getQuantidade());
        System.out.println("--------------------------------------");

    }
}

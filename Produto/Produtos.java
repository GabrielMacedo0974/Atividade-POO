package Produto;

public class Produtos {
    private int codigo;
    private String nome;
    private String descricao;
    private double precoVenda;
    private double quantidade;

    public Produtos(int codigo,String nome, String descricao, double precoVenda, Double quantidade)
    {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.precoVenda = precoVenda;
        this.quantidade = quantidade;
    }
    //Codigo
    public int getCodigo() {return codigo; }
    public void setCodigo(int codigo) {this.codigo = codigo; }

    //Nome
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    //Descricao
    public String getDescricao() {return descricao;}
    public void setDescricao(String descricao) {this.descricao = descricao;}

    //Preco Vendas
    public double getPrecoVenda() {return precoVenda;}
    public void setPrecoVenda(double precoVenda) {this.precoVenda = precoVenda;}

    //Quantidade
    public double getQuantidade() {return quantidade;}
    public void setQuantidade(double quantidade) {this.quantidade = quantidade;}

    //Realizar Venda
    public void vender(double quantidadeVenda) {
        if (quantidadeVenda <= 0) {
            System.out.println("Quantidade de Venda invalida!");
        } else if (quantidadeVenda > this.quantidade) {
            System.out.println("Quantidade Insuficiente no Estoque, Saldo Atual de " + this.nome + ": " + this.quantidade);
        } else {
            this.quantidade -= quantidadeVenda;
            double total = quantidadeVenda * this.precoVenda;
            System.out.println("Venda Realizada: " + quantidadeVenda + " unidade(s)" + this.nome + " R$" + this.precoVenda);
        }
    }
    //Repor Estoque
    public void reporEstoque(int reposicaoEstoque){
            if (reposicaoEstoque > 0){
                this.quantidade += reposicaoEstoque;
                System.out.println("Estoque Reposto Com Sucesso: " + this.nome + ": " + this.quantidade);
            }else {
                System.out.println("Reposicao Invalida");
            }
        }
    }

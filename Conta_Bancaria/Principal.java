package Conta_Bancaria;

public class Principal {
    public static void main(String[] args) {
        ContaBancaria contaPf = new ContaBancaria(0, 650, null, null,0.0);
        ContaBancaria contaPj = new ContaBancaria(0, 650, null, null,0.0);

        // criando informacoes de um objeto pessoa fisica
        contaPf.numConta = 265486;
        contaPf.agencia = 105;
        contaPf.titular = "Eduardo da Silva";
        contaPf.tipoConta = "Pessoa Fisica";

        contaPf.depositar(500.00);
        contaPf.sacar(500.00);
        double saldofinal = contaPf.consultarSaldo();

        //criando informacoes de um objeto pessoa juridica
        contaPj.numConta = 232659;
        contaPj.agencia = 658;
        contaPj.titular = "Padaria O Sonho";
        contaPj.tipoConta = "Pessoa Juridica";

        contaPj.depositar(5000.00);
        contaPj.sacar(500.00);

        //converter um valor double para um valor inteiro
        double total = 250.35;
        int totalConvertido = (int) total;

        //converter um valor String para um valor inteiro
        String idade = "25";
        int totalConvertido2 = Integer.parseInt(idade);

        //converter um valor boolean para String
        boolean aceita = true;
        String aceitaConvertido = String.valueOf(aceita);
    }
}

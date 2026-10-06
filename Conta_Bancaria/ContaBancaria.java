package Conta_Bancaria;

public class ContaBancaria {

    int numConta, agencia;
    String titular, tipoConta;
    double saldo = 0.00;
    final double TAXA_MANUTENCAO_CONTA = 5.00;

    public ContaBancaria(int numConta, int agencia, String titular, String tipoConta, double saldo) {

        this.numConta = numConta;
        this.agencia = agencia;
        this.titular = titular;
        this.tipoConta = tipoConta;

    }
    public void  depositar(double saldo) {
        this.saldo += saldo;
    }
    public void sacar(double saldo) {
        this.saldo -= saldo;
    }
    public double consultarSaldo() {
        saldo = saldo - TAXA_MANUTENCAO_CONTA;
        return saldo;
    }
}

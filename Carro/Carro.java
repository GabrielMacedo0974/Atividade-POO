package Carro;

public class Carro {
    private String cor;
    private String placa;
    private int ano;
    private String modelo;
    private int velocidadeAtual ;
    private int velocidadeMaxima ;

    public Carro( String placa, String cor, int ano, String modelo, int velocidadeMaxima) {
        this.placa = placa;
        this.cor = cor;
        this.ano = ano;
        this.modelo = modelo;
        this.velocidadeMaxima = velocidadeMaxima;
        this.velocidadeAtual = 0;

    }
    //cor
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {this.cor = cor;}

    //placa
    public String getPlaca() {return placa;}
    public void setPlaca(String placa) {this.placa = placa;}

    //ano
    public int getAno() {return ano;}
    public void setAno(int ano) {this.ano = ano;}

    //modelo
    public String getModelo() {return modelo;}
    public void setModelo(String modelo) {this.modelo = modelo;}

    //velocidadeAtual
    public int getVelocidadeAtual() {return velocidadeAtual; }
    public void setVelocidadeAtual(int velocidadeAtual) {this.velocidadeAtual = velocidadeAtual;}

    //velocidadeMaxima
    public int getVelocidadeMaxima() {return velocidadeMaxima;}

    public void setVelocidadeMaxima(int velocidadeMaxima){this.velocidadeMaxima = velocidadeMaxima; }

    public void acelerar(int velocidade){
        if (velocidade>getVelocidadeAtual() && velocidade<=getVelocidadeAtual()){
            setVelocidadeAtual(getVelocidadeAtual()+ velocidade) ;
            System.out.println("Carro acelerou para " + getVelocidadeAtual() + "km/h");
        }
        else{
            System.out.println("Use o método desacelerar () para desacelerar");
        }
    }
    public void desacelerar(int velocidade){
        if (velocidade < getVelocidadeAtual() && velocidade>=0){
            setVelocidadeAtual(getVelocidadeAtual()- velocidade) ;
            System.out.println("O carro desacelerou para " + getVelocidadeAtual() + "km/h");
        }
        else if (velocidade> getVelocidadeAtual()) {
            System.out.println("O carro parou");

        }
    }
}


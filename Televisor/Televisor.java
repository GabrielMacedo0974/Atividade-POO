package Televisor;

public class Televisor {
    private String marca;
    private Double polegadas;
    private int volume;
    private int canalAtual;
    private boolean ligada;

    public Televisor(String marca, Double polegadas, int volume, int canalAtual, boolean ligada) {
        this.marca = marca;
        this.polegadas = polegadas;
        this.volume = volume;
        this.canalAtual = canalAtual;
        this.ligada = ligada;
    }

    //marca
    public String getmarca() {return marca;}
    public void setmarca(String marca) {this.marca = marca;}

    //cpf
    public Double getpolegadas() {return polegadas;}
    public void setpolegadas(double polegadas) {this.polegadas = polegadas;}

    //volume
    public int getvolume() {return volume;}
    public void setvolume(int volume) {this.volume = volume;}

    //canal atual
    public int getcanalAtual() {return canalAtual;}
    public void setcanalAtual(int canalAtual) {this.canalAtual = canalAtual;}

    //Ligada
    public Boolean getligada() {return ligada;}
    public void setligada(Boolean ligada) {this.ligada = ligada;}

    //liga tv
    public void ligar() {
        this.ligada = true;
        System.out.println("Ligado");}

    //desligar tv
    public void desligar() {
        this.ligada = false;
        System.out.println("Desligado");}

    //trocar canal
    public void trocarCanal(int novocanal) {
        if (!this.ligada) {
            System.out.println("A Tv está desligada!");
        } else if (novocanal <= 0) {
        System.out.println("Canal invalido");
        } else  {
            this.canalAtual = novocanal;
            System.out.println("Canal trocado para: " + this.canalAtual );
        }
    }

}
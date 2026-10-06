package Celular;

public class Celular {
    private String numero;
    private String marca;
    private String modelo;
    private String Empresa;
    private int nivelBateria;

    public Celular(String numero, String marca, String modelo, String Empresa, int nivelBateria)
    {
        this.numero = numero;
        this.marca = marca;
        this.modelo = modelo;
        this.Empresa = Empresa;
        this.nivelBateria = nivelBateria;
    }
    //Numero
    public String getNumero() {return numero;}
    public void setNumero(String numero) {this.numero = numero;}

    //Marca
    public String getMarca() {return marca;}
    public void setMarca(String marca) {this.marca = marca;}

    //Modelo
    public String getModelo() {return modelo;}
    public void setModelo(String modelo) {this.modelo = modelo;}

    //Empresa
    public String getEmpresa() {return Empresa;}
    public void setEmpresa(String Empresa) {this.Empresa = Empresa;}

    //Nivel Bateria
    public double getNivelBateria() {return nivelBateria;}
    public void setNivelBateria() {this.nivelBateria = nivelBateria;}

    //Enviar Mensagem (Consome 1% de Bateria
    public void enviarMensagem(String texto){
        if (this.nivelBateria <= 0){
            System.out.println("Celular Desligado por falta de Bateria");
        }else {
            this.nivelBateria -= 1;
            System.out.println("Mensagem : " + texto + "| Bateria Restante: " + this.nivelBateria + "%");
        }
    }

    //Realizar Chamada (Consome 3% de Bateria
    public void realizarChamada(String numeroDestino){
        if (this.nivelBateria < 3){
            System.out.println("Bateria Insuficiente para Realizar Chamada");
        }else {
            this.nivelBateria -= 5;
            System.out.println("Chamando " + numeroDestino + " para realizar Chamada. Bateria: " + this.nivelBateria + "%");
        }
    }
    public void carregarBateria(int quantidade){
        if (quantidade > 0){
            this.nivelBateria += quantidade;
        if (this.nivelBateria > 100){
        this.nivelBateria = 100;}
        }
        System.out.println("A Bateria Está Carregada em: "  + this.nivelBateria + "%");
    }
}

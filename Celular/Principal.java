package Celular;

public class Principal {
    public static void main(String[] args) {
        Celular meuCelular = new Celular ("81987467061", "POCO", "POCO X7 PRO", "XIAOMI", 75);

    meuCelular.realizarChamada("8192822888");
    System.out.println("---------------------------------");


    meuCelular.enviarMensagem("Bom dia ");
    System.out.println("---------------------------------");

    meuCelular.carregarBateria(50);
    meuCelular.realizarChamada("8192822888");
    }
}

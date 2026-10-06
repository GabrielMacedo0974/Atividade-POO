package Televisor;

public class Principal {
    public static void main(String[] args) {

    // desligada no canal 1
    Televisor tv = new Televisor("Samsung", 55.0, 15, 5, false);

    //trocar canal com a tv desligada
    tv.trocarCanal(12);

    System.out.println("--------------------------");

    //Ligar tv e trocar canal
    tv.ligar();
    tv.trocarCanal(12);
    }
}

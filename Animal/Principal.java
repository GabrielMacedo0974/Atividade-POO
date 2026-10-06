package Animal;

public class Principal {
    public static void main(String[] args) {
        Animal pet1 = new Animal("Morgana", "Gato", "Vira-Lata", 0, 2.0);

        System.out.println("===Testando Animal");
        System.out.println("Nome: " + pet1.getNome());
        System.out.println("Peso Inicial: " + pet1.getPeso() + "kg");
        System.out.println("---------------------------------------");

        pet1.emitirSom();
        pet1.comer("Racao Premier");
        System.out.println("--------------------------------------");
        System.out.println("Peso Final: " + pet1.getPeso() + "kg");
   }
}

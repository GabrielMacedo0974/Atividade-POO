package Pessoa;

public class Principal {
    public static void main(String[] args) {
        Pessoa novaPessoa = new Pessoa("Gabriel Macedo", "00000000000", "GabrielMacedo097430@gmail.com",
                "81987467061", 25062007);
        novaPessoa.exibirDados();

        System.out.println("\n---------------------------------------------------\n");

        Pessoa novaPessoa2 = new Pessoa("Darlan Melo", "00000000000", "Darlan@gmail.com",
                "81984437561", 20042000);
        novaPessoa2.exibirDados();
    }
}

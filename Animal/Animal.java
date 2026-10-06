package Animal;

public class Animal {
    String nome;
    String especie;
    String raça;
    int idade;
    double peso;

    public Animal(String nome, String especie, String raça, int idade, double peso)
    {
        this.nome = nome;
        this.especie = especie;
        this.raça = raça;
        this.idade = idade;
        this.peso = peso;
    }

    //Nome
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    //Especie
    public String getEspecie() {return especie;}
    public void setEspecie(String especie) {this.especie = especie;}

    //Raça
    public String getRaça() {return raça;}
    public void setRaça(String raça) {this.raça = raça;}

    //Idade
    public int getIdade() {return idade;}
    public void setIdade(int idade) {this.idade = idade;}

    //Peso
    public double getPeso() {return peso;}
    public void setPeso(double peso) {this.peso = peso;}

    //Emitir som Da Especie
    public void emitirSom(){
        System.out.println(this.nome + "(" + this.especie + ") esta fazendo barulho: ");

        if (this.especie !=null && this.especie.equalsIgnoreCase("Cachorro")){
            System.out.println("AU! AU!");
        }else if (this.especie !=null && this.especie.equalsIgnoreCase("Gato")){
            System.out.println("Miau! Miau!");
        }else {
            System.out.println("Som de Animal");
        }
    }

    //Simular alimentacao e aumento de peso do animal
    public void comer(String alimento){
        if ((alimento == null) || alimento.trim().isEmpty()) {
        System.out.println("Alimento Invalido Fornecido para" + this.nome + ".");
        }else {
        this.peso += 0.1;
        System.out.println(this.nome + " Comeu "+ alimento + "\nNovo Peso: " + String.format("%.2f", this.peso) + "Kg.");
        }
    }
}

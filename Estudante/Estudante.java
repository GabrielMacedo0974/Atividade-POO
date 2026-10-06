package Estudante;

public class Estudante {
    private String nome;
    private String matricula;
    private String curso;
    private int idade;
    private double notaMedia;


    public Estudante(String nome, String matricula, String curso, int idade, double notaMedia)
    {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.idade = idade;
        this.notaMedia = notaMedia;
    }

    //nome
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    //matricula
    public String getMatricula() {return matricula;}
    public void setMatricula(String matricula) {this.matricula = matricula;}

    //curso
    public String getCurso() {return curso;}
    public void setCurso(String curso) {this.curso = curso;}

    //idade
    public int getIdade() {return idade;}
    public void setIdade(int idade) {this.idade = idade;}

    //nota media
    public double getNotaMedia() {return notaMedia;}
    public void setNotaMedia(double notaMedia) {this.notaMedia = notaMedia;}

    public void registrarNota(double nota){
        if(nota >= 0.0 && nota <= 10.0){
            this.notaMedia = nota;
            System.out.println("Nota: " + nota + "\nresgistrada com sucesso\n" + this.nome);
        }else {
            System.out.println("Falha ao registrar nota");
        }
    }

    public String verificarSituacao(){
        if(this.notaMedia >= 7.0){
            return "Aprovado";
        } else if (this.notaMedia >=5.0){
            return "Recuperacao";
        }else {
            return "Reprovado";}
    }

}
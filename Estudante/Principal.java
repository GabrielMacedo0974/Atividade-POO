package Estudante;

public class Principal {
    public static void main(String[] args) {
        Estudante aluno = new Estudante("Gabriel Macedo","50870","ADS",19,0.0);

    //registrando nota
        aluno.registrarNota(7.0);

    //exibindo situacao
    System.out.println("Aluno: "+ aluno.getNome());
    System.out.println("Media: "+ aluno.getNotaMedia());
    System.out.println("Situacao: "+ aluno.verificarSituacao());

    }
}

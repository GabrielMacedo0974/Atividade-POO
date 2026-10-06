package Pessoa;

public class Pessoa {
    private String nome;
    private String cpf;
    private String email;
    private String telefone;
    private int dataNascimento;

    public  Pessoa(String nome, String cpf, String email ,String telefone, int dataNascimento)
    {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
    }
    //Nome
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    //Cpf
    public String getCpf() {return cpf;}
    public void setCpf(String cpf) {this.cpf = cpf;}

    //Email
    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}

    //Telefone
    public String getTelefone() {return telefone;}
    public void setTelefone(String telefone) {this.telefone = telefone;}

    //Data De Nascimento
    public int getDataNascimento() {return dataNascimento;}
    public void setDataNascimento(int dataNascimento) {this.dataNascimento = dataNascimento;}

    //Analisar Cpf com 11 digitos
    public boolean ValidarCpf() {
        if (this.cpf == null) {
            return false;
        }
        // Remove Ponto e Traco
        String cpfLimpo = this.cpf.replaceAll("[^0-9]", "");

        // Verifica se há 11 digitos
        return cpfLimpo.length() == 11   ;
    }

    public void exibirDados()
    {
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Email: " + this.email);
        System.out.println("Telefone: " + this.telefone);
        System.out.println("Data de Nascimento: " + this.dataNascimento);
    }
}


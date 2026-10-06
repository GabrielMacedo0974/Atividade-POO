package Funcionario;

public class Funcionario {
    private String nome;
    private String cpf;
    private String cargo;
    private String departamento;
    private double salarioMensal;


    public Funcionario( String nome, String cpf, String cargo, double salarioMensal, String departamento)
    {
        this.nome = nome;
        this.cpf = cpf;
        this.cargo = cargo;
        this.salarioMensal = salarioMensal;
        this.departamento = departamento;
    }
    //nome
    public String getNome() {return nome; }

    public void setNome(String nome) {this.nome = nome;}

    //cpf
    public String getCpf() {return cpf; }

    public void setCpf(String cpf) {this.cpf = cpf;}

    //cargo
    public String getCargo() {return cargo; }

    public void setCargo(String cargo) {this.cargo = cargo;}

    //salario Mensal
    public double getsalarioMensal(){
        return salarioMensal; }

    public void setSalarioMensal(double salarioMensal){
        this.salarioMensal = salarioMensal;}

    //departamento
    public String getdepartamento(){ return departamento; }

    public void setDepartamento(String departamento){ this.departamento = departamento;}

    public double consultarSalarioAnual(){
        return this.salarioMensal * 12;
    }

    public void aumentoPercentual(double porcentagem){
        if (porcentagem > 0){
            this.salarioMensal += this.salarioMensal * (porcentagem / 100);
        }else {
            System.out.println("O Aumento percentual deve ser maior que 0");
        }
    }
    }
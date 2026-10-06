package Funcionario;

public class Principal {
    public static void main(String[] args) {
        Funcionario contaFun = new Funcionario(null, "00000000000", null, 0000, null);

        //informacoes do funcionario

        contaFun.setNome("Gabriel Macedo");
        contaFun.setCpf ("17274662414") ;
        contaFun.setCargo ("Desenvolvedor");
        contaFun.setDepartamento ("Programacao");
        contaFun.setSalarioMensal (2000);

       System.out.println("Nome: " + contaFun.getNome());
       System.out.println("CPF: " + contaFun.getCpf());
       System.out.println("Cargo: " + contaFun.getCargo());
        System.out.println("Departamento: " + contaFun.getdepartamento());
       System.out.println("Salario Mensal: " + contaFun.getsalarioMensal());
        System.out.println("Salario Anual: R$ " + contaFun.consultarSalarioAnual());


       System.out.println("--------------------------------------");


        contaFun.aumentoPercentual(10.0);

        System.out.println("Salario com aumento (10%): R$ " + contaFun.getsalarioMensal());
        System.out.println("Salario Anual com aumento (10%): R$ " + contaFun.consultarSalarioAnual());

    }
}

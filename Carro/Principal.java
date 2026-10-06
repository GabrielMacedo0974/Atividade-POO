package Carro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Principal {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Digite a placa do carro: ");
        String placa = br.readLine();

        System.out.println("Digite a cor do carro: ");
        String cor = br.readLine();

        System.out.println("Digite o ano do carro: ");
        int ano = Integer.parseInt(br.readLine());

        System.out.println("Digite o modelo do carro: ");
        String modelo = br.readLine();

        System.out.println("Digite a velocidade maxima do carro: ");
        int velicidadeMaxima = Integer.parseInt(br.readLine());

        Carro novoCarro = new Carro(placa, cor, ano, modelo, velicidadeMaxima);

        System.out.println("Digite a velocidade de aceleracao do carro: ");
        int aceleracao = Integer.parseInt(br.readLine());

        novoCarro.acelerar(aceleracao);
    }
}

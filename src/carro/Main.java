package carro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("----------------------------------------------------");
        System.out.println("Vamos configurar o seu próximo carro?");
        System.out.println("Digite alguns dados abaixo que vou te mostrar opções");
        System.out.println("----------------------------------------------------\n");

        int sairLoja = 2; //flag para sair da configuração

        //Inseridos dados do usuário
        Scanner entrada = new Scanner(System.in);

        while(sairLoja == 2) {
            //Escolhendo quantas portas
            System.out.println("Quantas portas você deseja?");
            System.out.println("1 - duas portas");
            System.out.println("2 - quatro portas");
            int carroPortas = entrada.nextInt();

            //Escolhendo um tipo de carroceira
            System.out.println("Escolha um tipo de carroceria:");
            System.out.println("1 - hatch");
            System.out.println("2 - sedan");
            System.out.println("3 - SUV");
            int carroCarroceria = entrada.nextInt();

            //Escolhendo marca de carro
            System.out.println("Escolha uma marca:");
            System.out.println("1 - Ford");
            System.out.println("2 - Fiat");
            System.out.println("3 - Volkswagen");
            int carroMarca = entrada.nextInt();

            Carro meuCarro = new Carro(carroPortas, carroCarroceria, carroMarca);

            meuCarro.CarroEscolhido();

            //Verificando se o usuário quer sair da configuração
            System.out.println("\nDeseja encerrar a configuração do carro? 1 - SIM | 2 - NÃO");
            sairLoja = entrada.nextInt();
        }// fim while
    }
}

package contacorrente;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //Ininicando leitura dos dados
        Scanner entrada = new Scanner(System.in);

        System.out.println("+-------------------------+");
        System.out.println("| BEM-VINDE AO BANCO XPTO |");
        System.out.println("+-------------------------+\n");



        System.out.println("Digite o seu nome completo:");
        String nomeCorrentista = entrada.nextLine();

        System.out.println("Digite a sua conta-corrente:");
        int contaCorrente = entrada.nextInt();

        //Instanciando objeto
        ContaCorrente bancoUsuario = new ContaCorrente(contaCorrente, nomeCorrentista);

        //Exibindo dados da conta-corrente
        bancoUsuario.InfosCorrente();

        //Perguntando o que o usuário quer fazer
        System.out.println("\nDigite as opções a seguir:");
        System.out.println("1 - Depositar dinheiro");
        System.out.println("2 - Sacar dinheiro");
        System.out.println("3 - Ver saldo");
        System.out.println("4 - Sair\n");

        int opcoes = entrada.nextInt();

        if(opcoes != 4){
            while (opcoes != 4){
                if(opcoes == 1){
                    System.out.println("\n> DEPÓSITO");
                    System.out.println("Digite o valor do depósito");

                    double depositoDinheiro = entrada.nextDouble();
                    bancoUsuario.depositoConta(depositoDinheiro);
                }//Depósito de dinheiro
                else if(opcoes == 2){
                    System.out.println("\n> SAQUE");
                    System.out.println("Digite o valor do saque");

                    double saqueDinheiro = entrada.nextDouble();
                    bancoUsuario.saqueConta(saqueDinheiro);
                }//Saque de dinheiro
                else if(opcoes == 3){
                    //Exibindo o saldo atual
                    System.out.println("\n> CONSULTA SALDO");
                    bancoUsuario.MostraSaldo();
                }//Ver saldo

                //Perguntando o que o usuário quer fazer
                System.out.println("\nDigite as opções a seguir:");
                System.out.println("1 - Depositar dinheiro");
                System.out.println("2 - Sacar dinheiro");
                System.out.println("3 - Ver saldo");
                System.out.println("4 - Sair\n");

               opcoes = entrada.nextInt();
            }

        }
        System.out.println("Obrigade por utilizar o Banco XPTO! <3");





    }
}

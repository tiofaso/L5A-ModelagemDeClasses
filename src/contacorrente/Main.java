package contacorrente;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //Ininicando leitura dos dados
        Scanner entrada = new Scanner(System.in);

        System.out.println("+-------------------------+");
        System.out.println("| BEM-VINDE AO BANCO XPTO |");
        System.out.println("+-------------------------+\n");

        ContaCorrente bancoUsuario = new ContaCorrente();

        //Setando dados do usuário
        bancoUsuario.saldoCorrentista = 0.0;

        System.out.println("Digite o seu nome completo:");
        bancoUsuario.nomeCorrentista = entrada.nextLine();

        System.out.println("Digite a sua conta-corrente:");
        bancoUsuario.contaCorrente = entrada.nextInt();

        //Exibindo o saldo atual
        bancoUsuario.ContaCorrente(bancoUsuario.contaCorrente, bancoUsuario.nomeCorrentista);

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
                    System.out.println("\nDeseja fazer um depósito?");
                    System.out.println("Digite o valor do depósito");

                    double depositoDinheiro = entrada.nextDouble();
                    bancoUsuario.depositoConta(depositoDinheiro);
                    //Exibindo o saldo atual
                    bancoUsuario.ContaCorrente(bancoUsuario.contaCorrente, bancoUsuario.nomeCorrentista);

                }//Depósito de dinheiro
                else if(opcoes == 2){
                    System.out.println("\nDeseja fazer um saque?");
                    System.out.println("Digite o valor do saque");

                    double saqueDinheiro = entrada.nextDouble();
                    bancoUsuario.saqueConta(saqueDinheiro);

                    //Exibindo o saldo atual
                    bancoUsuario.ContaCorrente(bancoUsuario.contaCorrente, bancoUsuario.nomeCorrentista);
                }//Saque de dinheiro
                else if(opcoes == 3){
                    //Exibindo o saldo atual
                    bancoUsuario.ContaCorrente(bancoUsuario.contaCorrente, bancoUsuario.nomeCorrentista);
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

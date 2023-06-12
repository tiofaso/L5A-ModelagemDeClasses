package pessoa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        //Capturando dados do usuário
        Scanner entrada = new Scanner(System.in);

        System.out.println("Vamos descobrir algumas curiosidades sobre você?");


        //Instanciando classe
        Pessoa umaPessoa = new Pessoa();

        //Setando variáveis
        System.out.println("Digite o seu nome:");
        umaPessoa.nomePessoa = entrada.nextLine();

        System.out.println("Digite a sua altura");
        umaPessoa.alturaPessoa = entrada.nextDouble();

        System.out.println("Digite o seu peso:");
        umaPessoa.pesoPessoa = entrada.nextDouble();

        System.out.println("Digite asua idade:");
        umaPessoa.idadePessoa = entrada.nextInt();

        double imc = umaPessoa.calculoIMC(umaPessoa.pesoPessoa, umaPessoa.alturaPessoa);

        System.out.println("Olá " + umaPessoa.nomePessoa + "!");
        System.out.println("Vamos ver suas curiosidades!!!");

       //Fala a idade da pessoa
        umaPessoa.pessoaEnvelhecer(umaPessoa.idadePessoa);

        //Informa se a pessoa ainda irá crescer e quanto
        umaPessoa.pessoaCrescer(umaPessoa.idadePessoa);

        //Verifica se a pessoa precisa emagrecer ou não baseada no IMC
        if(imc >= 25){umaPessoa.pessoaEmagrecer();}
        else{umaPessoa.pessoaEngordar();}
    }
}

package pessoa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        //Capturando dados do usuário
        Scanner entrada = new Scanner(System.in);

        System.out.println("Vamos descobrir algumas curiosidades sobre você?");

        //Setando variáveis
        System.out.println("Digite o seu nome:");
        String nomePessoa = entrada.nextLine();

        System.out.println("Digite a sua altura");
        double alturaPessoa = entrada.nextDouble();

        System.out.println("Digite o seu peso:");
        double pesoPessoa = entrada.nextDouble();

        System.out.println("Digite a sua idade:");
        int idadePessoa = entrada.nextInt();

        //Instanciando classe
        Pessoa umaPessoa = new Pessoa(nomePessoa, idadePessoa,alturaPessoa);

        double imc = umaPessoa.calculoIMC(pesoPessoa);

        System.out.println("Olá " + umaPessoa.nomePessoa + "!");
        System.out.println("Vamos ver suas curiosidades!!!");

        //Fala a idade da pessoa
        umaPessoa.pessoaEnvelhecer();

        //Informa se a pessoa ainda irá crescer e quanto
        umaPessoa.pessoaCrescer();

        //Verifica se a pessoa precisa emagrecer ou não baseada no IMC
        if(imc >= 25){umaPessoa.pessoaEmagrecer(pesoPessoa);}
        else if(imc >= 18.5 && imc < 25){System.out.println("Seu peso está no ideal!!! Continue assim!");}
        else{umaPessoa.pessoaEngordar(pesoPessoa);}
    }
}

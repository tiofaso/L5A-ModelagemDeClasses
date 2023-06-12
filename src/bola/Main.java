package bola;
import java.util.Scanner;
//Programa que mostra curiosidades aleatórias sobre bolas
public class Main {
    public static void main(String[] args){

        System.out.println("Vou mostrar algumas informaçõers sobre bolas. Escolha uma opção:");
        System.out.println("1 - Basquete");
        System.out.println("2 - Basquete especial");

        //Lendo escolha do usuário
        Scanner entrada = new Scanner(System.in);
        Integer tipoJogo = entrada.nextInt();

        //Instanciando o objeto
        Bola showBola = new Bola();

        //Setando variáveis
        switch(tipoJogo){
            case 1: //Basquete comum
                showBola.bolaJogo = "basquete";
                showBola.bolaCircunferencia = 74.9;
                showBola.bolaCor = "laranja";
                showBola.bolaMarca = "Wilson";
                showBola.bolaVelocidade = 75.6;
                showBola.bolaComemorativa = 0;
                break;

            case 2: //Basquete especial
                showBola.bolaJogo = "basquete";
                showBola.bolaCircunferencia = 75;
                showBola.bolaCor = "laranja";
                showBola.bolaMarca = "Spalding";
                showBola.bolaVelocidade = 76;
                showBola.bolaComemorativa = 1;
                break;

        }// fim switch

        showBola.statusBola();
    }
}

package retangulo;

import quadrado.Quadrado;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Bóra calcular a área e o perímetro de um retângulo?");


        //Iniciando leitura de dados
        Scanner entrada = new Scanner(System.in);

        Retangulo retangulo = new Retangulo();

        System.out.println("\nDigite o tamanho do lado menor?");
        retangulo.ladoMenor = entrada.nextDouble();

        System.out.println("\nDigite o tamanho do lado maior?");
        retangulo.ladoMaior = entrada.nextDouble();

        System.out.println("A área do retangulo " + retangulo.ladoMenor + "X" + retangulo.ladoMaior + " é igual a " + retangulo.areaRetangulo(retangulo.ladoMenor, retangulo.ladoMaior));

        System.out.println("O perímetro desse mesmo retângulo é " + retangulo.perimetroRetangulo(retangulo.ladoMenor, retangulo.ladoMaior));


        System.out.println("\nDigite um novo tamanho do lado menor?");
        double ladoMenor = entrada.nextDouble();

        System.out.println("\nDigite um novo tamanho do lado maior?");
        double ladoMaior = entrada.nextDouble();


       retangulo.mudaLado(ladoMenor, ladoMaior);

    }
}

package quadrado;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Bóra calcular a área de um quadrado?");
        System.out.println("\nDigite o tamanho do lado dele?");

        //Iniciando leitura de dados
        Scanner entrada = new Scanner(System.in);

        Quadrado quadradim = new Quadrado();

        quadradim.tamLado = entrada.nextDouble();

        System.out.println("A área de do quadrado de lado " + quadradim.tamLado + " é igual a " + quadradim.areaQuadrado(quadradim.tamLado));

        System.out.println("\nAgora escolha um novo tamanho de lado:");
        double novoLado = entrada.nextDouble();

        quadradim.mudaLado(novoLado);

    }
}

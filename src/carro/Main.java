package carro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Vamos configurar o seu próximo carro?");
        System.out.println("Digite alguns dados abaixo que vou te mostrar opções");

        //Inseridos dados do usuário
        Scanner entrada = new Scanner(System.in);

        Carro meuCarro = new Carro(); //Instanciando o carro

        //Potência padrão
        meuCarro.carroPotencia = 2.0;

        System.out.println("Quantas portas você deseja?");
        meuCarro.carroPortas = entrada.nextInt();

        System.out.println("Escolha um tipo de uso:");
        System.out.println("1 - urbano");
        System.out.println("2 - familiar");
        System.out.println("3 - carga");

        meuCarro.carroCarroceria = entrada.nextInt();

        //Definindo características do carro
        if(meuCarro.carroPortas == 2 && meuCarro.carroCarroceria == 1){//Hatch
            meuCarro.carroMarca = "Volkswagen";
            meuCarro.carroPotencia = 1.0;
            meuCarro.carroModelo = "Gol";
        }else if(meuCarro.carroPortas == 2 && meuCarro.carroCarroceria == 3){//Picape
            meuCarro.carroMarca = "Ford";
            meuCarro.carroModelo = "Ranger";
        }else if(meuCarro.carroPortas > 2 && meuCarro.carroCarroceria == 1){//Hatch médio
            meuCarro.carroMarca = "Ford";
            meuCarro.carroModelo = "Focus";
        }else if(meuCarro.carroPortas > 2 && meuCarro.carroCarroceria == 2){//Minivan
            meuCarro.carroMarca = "Fiat";
            meuCarro.carroModelo = "Doblò";
            meuCarro.carroPotencia = 1.8;
        }else if(meuCarro.carroPortas > 2 && meuCarro.carroCarroceria == 3) {//Picape média
            meuCarro.carroMarca = "Toyota";
            meuCarro.carroModelo = "Hilux";
            meuCarro.carroPotencia = 3.0;
        }else{
            meuCarro.carroMarca = "qualquer marca";
            meuCarro.carroModelo = "e qualquer modelo";
        } //fim if
        meuCarro.Carro(meuCarro.carroMarca, meuCarro.carroModelo);

    }
}

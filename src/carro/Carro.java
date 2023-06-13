package carro;

public class Carro {
    int carroPortas;
    int carroCarroceria;
    int carroMarca;
    double carroPotencia;

    String carroModelo;

    public void ligaCarro(){System.out.println("Vrum! VRUUUUUM!");}

    public void CarroEscolhido(){
        if(carroPortas == 1 && carroCarroceria == 1 && carroMarca == 1){this.carroModelo = "Ka"; this.carroPotencia = 1.0 ;}
        else if(carroPortas == 1 && carroCarroceria == 1 && carroMarca == 2){this.carroModelo = "Palio"; this.carroPotencia = 1.0 ;}
        else if(carroPortas == 1 && carroCarroceria == 1 && carroMarca == 3){this.carroModelo = "Gol"; this.carroPotencia = 1.0 ;}

        else if(carroPortas == 2 && carroCarroceria == 2 && carroMarca == 1){this.carroModelo = "Ka+"; this.carroPotencia = 1.0;}
        else if(carroPortas == 2 && carroCarroceria == 2 && carroMarca == 2){this.carroModelo = "Siena"; this.carroPotencia = 1.0;}
        else if(carroPortas == 2 && carroCarroceria == 2 && carroMarca == 3){this.carroModelo = "Voyage"; this.carroPotencia = 1.0 ;}

        else if(carroPortas == 2 && carroCarroceria == 3 && carroMarca == 1){this.carroModelo = "Ecosport";}
        else if(carroPortas == 2 && carroCarroceria == 3 && carroMarca == 2){this.carroModelo = "Pulse"; this.carroPotencia = 1.6 ;}
        else if(carroPortas == 2 && carroCarroceria == 3 && carroMarca == 3){this.carroModelo = "T-cross";}

        else if(carroPortas == 2 && carroCarroceria == 1 && carroMarca == 1){this.carroModelo = "Fiesta"; }
        else if(carroPortas == 2 && carroCarroceria == 1 && carroMarca == 2){this.carroModelo = "Argo"; this.carroPotencia = 1.3 ;}
        else if(carroPortas == 2 && carroCarroceria == 1 && carroMarca == 3){this.carroModelo = "Golf"; }

        else {this.carroModelo = "666";}

        if(this.carroModelo != "666") {
            System.out.println("O carro ideal para você é: " + this.carroMarca + " " + this.carroModelo + " com motor " + this.carroPotencia);
            ligaCarro();
        }else{System.out.println("Não achamos um carro ideal para você... :(");}

    }

    public Carro(int carroPortas, int carroCarroceria, int carroMarca) {
        this.carroPortas = carroPortas;
        this.carroCarroceria = carroCarroceria;
        this.carroMarca = carroMarca;
        this.carroPotencia = 2.0;
    }
}

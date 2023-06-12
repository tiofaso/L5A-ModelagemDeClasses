package carro;

public class Carro {
    Integer carroPortas;
    String carroModelo;
    String carroMarca;
    double carroPotencia;
    Integer carroCarroceria;

    public void ligaCarro(){System.out.println("Vrum! VRUUUUUM!");}

    public void Carro(String carroMarca, String carroModelo){
        System.out.println("O carro ideal para você é: " + carroMarca + " " + carroModelo + " com motor " + carroPotencia);
        ligaCarro();
    }
}

package retangulo;

public class Retangulo {
    double ladoMaior;
    double ladoMenor;


    public void mudaLado(double ladoMenorNovo, double ladoMaiorNovo){
        System.out.println("O retângulo atual " + ladoMenor + " X " + ladoMaior + "tem área de " + areaRetangulo(ladoMenor,ladoMaior) + "e perímetro de " + perimetroRetangulo(ladoMenor,ladoMaior));
        System.out.println("O novo retângulo " + ladoMenorNovo + " X " + ladoMaiorNovo + "tem área de " + areaRetangulo(ladoMenorNovo,ladoMaiorNovo) + "e perímetro de " + perimetroRetangulo(ladoMenorNovo,ladoMaiorNovo));
    }

    public double areaRetangulo(double ladoMenor, double ladoMaior){
        return (ladoMenor * ladoMaior);
    }

    public double perimetroRetangulo(double ladoMenor, double ladoMaior){
        double perimetro = ladoMenor + ladoMenor + ladoMaior + ladoMaior;
        return perimetro;
    }
}

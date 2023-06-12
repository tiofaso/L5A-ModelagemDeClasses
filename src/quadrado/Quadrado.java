package quadrado;

public class Quadrado {
    double tamLado;

    public void mudaLado(double tamLadoNovo){
        System.out.println("O quadrado atual tem lado de tamanho " + tamLado + "e área de " + areaQuadrado(tamLado));
        System.out.println("A nova área do quadrado, quando ele tem lado " + tamLadoNovo + ", é de " + areaQuadrado(tamLadoNovo));
    }

    public double areaQuadrado(double tamLadoQuadrado){
        return (tamLadoQuadrado * tamLadoQuadrado);
    }
}

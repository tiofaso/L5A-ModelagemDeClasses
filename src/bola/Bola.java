package bola;

public class Bola {
    String bolaJogo;
    double bolaCircunferencia;
    String bolaCor;
    String bolaMarca;
    double bolaVelocidade;
    Integer bolaComemorativa;

    public void statusBola(){
        System.out.println("Uma bola de " + bolaJogo + " possui circunferênciua aproximada de " + bolaCircunferencia + "cm,");
        System.out.println("podendo alcançar velocidades terminais de " + bolaVelocidade + "km/h.\n");
        System.out.println("Um dos maiores fabricantes de bola de " + bolaJogo + " é a " + bolaMarca);


        if(bolaComemorativa == 1){
            bolaCor = trocaCor(1);
            mostraCor();
        }else{
            bolaCor = trocaCor(0);
            mostraCor();
        }

    }

    public String trocaCor(int cor){
        if(cor == 1){
            String cores = "listradas com azul, branco e vermelho";
            return cores;
        }
        else{
            String cores = "laranjas";
            return cores;
        }

    }

    public void mostraCor(){
        System.out.println("que produz milhões de bolas " + bolaCor + " anualmente.");
    }
}

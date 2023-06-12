package pessoa;

public class Pessoa {
    String nomePessoa;
    Integer idadePessoa;
    double pesoPessoa;
    double alturaPessoa;

    public void pessoaEnvelhecer(int idadePessoa){
        System.out.println("Você tem " + idadePessoa + " anos.");
    }

    public void pessoaEngordar(){
        double imc = calculoIMC(pesoPessoa,alturaPessoa);

        if(imc < 18.5){System.out.println("Você está abaixo do peso! Precisa engordar!");}
    }

    public void pessoaEmagrecer(){
        double imc = calculoIMC(pesoPessoa,alturaPessoa);

        if(imc >= 25){System.out.println("Você está acima do peso! Precisa emagrecer!");}

    }


    public void pessoaCrescer(int idadePessoa){
        int idadeAtual = idadePessoa;
        Double faltaCrescer = 0.5;

        if(idadeAtual <= 21) {
            for (int i = idadeAtual; i <= 21; i++) {//Calculando se a pessoa ainda vai crescer
                faltaCrescer = faltaCrescer + 0.5;
            }
            System.out.println("Você tem " + idadePessoa + ", então teoricamente você vai crescer mais " + faltaCrescer + "cm até os 21 anos." );
        }else{
            System.out.println("Você já cresceu foi é tudo, seu grandinho! :)");
        }
    }

    public double calculoIMC(double pesoPessoa, double alturaPessoa){
        double altura = alturaPessoa * alturaPessoa;
        double peso = pesoPessoa;
        double imc = peso/altura;

        return imc;
    }
}

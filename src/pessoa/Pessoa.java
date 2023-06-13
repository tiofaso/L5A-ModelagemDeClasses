package pessoa;

public class Pessoa {
    String nomePessoa;
    Integer idadePessoa;
    double pesoPessoa;
    double alturaPessoa;

    public void pessoaEnvelhecer(){
        System.out.println("Você tem " + this.idadePessoa + " anos.");
    }

    public void pessoaEngordar(double pesoPessoa){
        double imc = calculoIMC(pesoPessoa);

        if(imc < 18.5){System.out.println("Você está abaixo do peso! Precisa engordar!");}
    }

    public void pessoaEmagrecer(double pesoPessoaAS){
        double imc = calculoIMC(pesoPessoa);

        if(imc >= 25){System.out.println("Você está acima do peso! Precisa emagrecer!");}

    }


    public void pessoaCrescer(){
        int idadeAtual = this.idadePessoa;
        Double faltaCrescer = 0.5;

        if(idadeAtual <= 21) {
            for (int i = idadeAtual; i <= 21; i++) {//Calculando se a pessoa ainda vai crescer
                faltaCrescer = faltaCrescer + 0.5;
            }
            System.out.println("Você tem " + this.idadePessoa + ", então teoricamente você vai crescer mais " + faltaCrescer + "cm até os 21 anos." );
        }else{
            System.out.println("Você já cresceu foi é tudo, seu grandinho! :)");
        }
    }

    public double calculoIMC(double pesoPessoa){ //Calcula IMC
       double imc = pesoPessoa/(this.alturaPessoa * this.alturaPessoa);
       return imc;
    }

    public Pessoa(String nomePessoa, Integer idadePessoa, double alturaPessoa) { //Construtor
        this.nomePessoa = nomePessoa;
        this.idadePessoa = idadePessoa;
        this.alturaPessoa = alturaPessoa;
        this.pesoPessoa = 0;
    }
}

package contacorrente;

public class ContaCorrente {
    Integer contaCorrente;
    String nomeCorrentista;
    Double saldoCorrentista;

    public void depositoConta(double entraDinheiro){
        saldoCorrentista = saldoCorrentista + entraDinheiro;
        System.out.println("Seu saldo atual é de R$" + saldoCorrentista);
    }

    public void saqueConta(double tiraDinheiro){
        saldoCorrentista = saldoCorrentista - tiraDinheiro;
        System.out.println("Seu saldo atual é de R$" + saldoCorrentista);
    }

    public void ContaCorrente(int contaCorrente, String nomeCorrentista){

        System.out.println("Olá " + nomeCorrentista);
        System.out.println("Sua C/C é: " + contaCorrente);
        System.out.println("Seu saldo atual é: R$" + saldoCorrentista);
    }
}

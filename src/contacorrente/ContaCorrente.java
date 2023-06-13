package contacorrente;

public class ContaCorrente {
    Integer contaCorrente;
    String nomeCorrentista;
    Double saldoCorrentista;

    public void depositoConta(double entraDinheiro){
        this.saldoCorrentista = this.saldoCorrentista + entraDinheiro;
        System.out.println("Seu saldo atual é de R$" + this.saldoCorrentista);
    }

    public void saqueConta(double tiraDinheiro){
        this.saldoCorrentista = this.saldoCorrentista - tiraDinheiro;
        System.out.println("Seu saldo atual é de R$" + this.saldoCorrentista);
    }

    public void InfosCorrente(){
        System.out.println("+-----------------------+");
        System.out.println("Olá " + nomeCorrentista);
        System.out.println("Sua conta-corrente é: " + contaCorrente);
        System.out.println("Seu saldo atual é: R$" + saldoCorrentista);
        System.out.println("+-----------------------+");
    }

    public ContaCorrente(Integer contaCorrente, String nomeCorrentista) {
        this.contaCorrente = contaCorrente;
        this.nomeCorrentista = nomeCorrentista;
        this.saldoCorrentista = 0.0;
    }

    public void MostraSaldo(){
        System.out.println("Seu saldo atual é de R$" + this.saldoCorrentista);
    }
}

package conta.modelos;

public class Conta {
    Pessoa pessoa;
    double saldo;

    public Conta(Pessoa pessoa, double saldo) {
        this.pessoa = pessoa;
        this.saldo = saldo;
    };

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void imprimeSaldo() {
        System.out.println("Seu saldo é: R$" + saldo);
    }

    public void deposita(double valor) {
        this.saldo += valor;
        System.out.println("Depósito realizado com sucesso!");
    }

    public  void saca(double valor) {
        if (valor > saldo) {
            System.out.println("Você não possui saldo suficiente.");
            return;
        }

        this.saldo -= valor;
        System.out.println("Saque realizado com sucesso!");
    }
}

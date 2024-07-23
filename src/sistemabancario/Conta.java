package sistemabancario;

public class Conta {

    public Cliente titular;
    public int numero;
    private double saldo;

    public Conta(Cliente titular, int numero, double saldo) {
        this.titular = titular;
        this.numero = numero;
        if (saldo >= 0) {
            this.saldo = saldo;
        }
    }

    public void modificarSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("Saldo não foi alterado. Valor negativo.");
        }
    }

    public double obterSaldo() {
        return this.saldo;
    }

    public void imprimirSaldo() {
        System.out.println("Saldo atual para a conta: " +
                this.numero + ": " + this.saldo);
    }
}


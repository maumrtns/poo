package sistemabancario;

public class Conta {
    Cliente titular;
    int numero;
    double saldo;

    void imprimirSaldo() {
        System.out.println(this.saldo);
    }
}

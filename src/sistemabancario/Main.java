package sistemabancario;

public class Main {
    public static void main(String[] args) {
        
        Cliente fulano = new Cliente("01234567890","Fulano");

        Conta contaFulano = new Conta();
        contaFulano.titular = fulano;
        contaFulano.numero = 1000;
        contaFulano.saldo = 50;

        Banco sistemaBancario = new Banco();

        System.out.println("Saldo antes do depósito:");
        contaFulano.imprimirSaldo();

        System.out.println("Depositando 100 reais");
        sistemaBancario.depositar(contaFulano, 100d);

        System.out.println("Saldo depois do depósito:");
        contaFulano.imprimirSaldo();

        System.out.println("Sacando o valor de 30 reais");
        sistemaBancario.sacar(contaFulano, 30d);

        contaFulano.imprimirSaldo();

        System.out.println("Sacando o valor de 200 reais");
        sistemaBancario.sacar(contaFulano, 200d);

        contaFulano.imprimirSaldo();

        Cliente cicrano = new Cliente();
        cicrano.nome = "Cicrano";
        cicrano.cpf = "9874563210";

        Conta contaCicrano = new Conta();
        contaCicrano.titular = cicrano;
        contaCicrano.numero = 2000;
        contaCicrano.saldo = 0;

        System.out.println("Transferindo 120 reais para o Cicrano");
        sistemaBancario.transferir(contaFulano, contaCicrano, 120d);

        contaFulano.imprimirSaldo();
        contaCicrano.imprimirSaldo();
    }
}

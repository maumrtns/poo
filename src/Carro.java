public class Carro {

    int cavalos;
    String cor;
    String transmissao;
    String montadora;
    int capacidadeTanque;
    int combustivel;
    int kmPorLitros;

    void abastercer(int litros){
        combustivel = combustivel + litros;
    }

    int autonomiaCombustivel(){
        int autonomia = kmPorLitros * combustivel;
        return autonomia;
    }
}

package sistemabancario;

public class Cliente {
    String cpf;
    String nome;


    //Construtor padrão
    Cliente(){}

    //Construtor
    Cliente(String cpf, String nome){
        this.cpf = cpf;
        this.nome = nome;
    }
}

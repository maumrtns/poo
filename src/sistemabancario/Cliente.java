package sistemabancario;

public class Cliente {

    private String cpf;
    private String nome;


    //Construtor padrão
    Cliente(){}

    //Construtor
    Cliente(String cpf, String nome){
        this.cpf = cpf;
        this.nome = nome;
    }
    //padrão get e set
    public void setCpf(String cpf ){
        this.cpf = cpf;
    }

    public String getCpf(){
        return this.cpf;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

}

package br.com.xpto;

import br.com.xpto.concessionaria.Pessoa;
import sistemabancario.Banco;

public class Main {
    public static void main(String[] args) {
        br.com.xpto.concessionaria.Pessoa pessoaConcessionaria
                = new br.com.xpto.concessionaria.Pessoa();
        String rg = pessoaConcessionaria.getRg();

        br.com.xpto.sistemabancario.Pessoa pessoaSisBanco
                = new br.com.xpto.sistemabancario.Pessoa();
        String cpf = pessoaSisBanco.getCpf();
    }
}

package br.newtonpaiva.ui;

import br.newtonpaiva.dominio.*;


public class Main {

    public static void main (String[] args) {

        Pessoa pessoas [] =new Pessoa[4];
        pessoas[0] = new PessoaFisica();
        pessoas[1] = new PessoaJuridica();
        pessoas[2] = new PessoaJuridica();
        pessoas[3] = new PessoaFisica();

        for (Pessoa p : pessoas)
            p.validarDocumento();
    }
}

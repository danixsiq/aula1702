public class Main {
}

        pessoas[] = new Pessoa [4];
        pessoas [0] = new pessoaFisica();
        pessoas [1] = new pessoaJuridica();
        pessoas [2] = new pessoaJuridica();
        pessoas [3] = new pessoaFisica();

        for (Pessoa p : pessoas)
            p.validarDocumento();
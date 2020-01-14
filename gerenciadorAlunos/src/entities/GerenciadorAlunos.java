package entities;

import java.util.ArrayList;

public class GerenciadorAlunos {
    private ArrayList<Aluno> listaAlunos = new ArrayList<Aluno>();

    public String validaNome(String nome) {
        // TODO - Pesquisar a diferença de isEmpity e isBlanck
        if(nome == null  || nome.trim().equals("") || nome.isEmpty() || nome.isBlank()) {
            return "O nome não pode ser nulo!";
        }

        return null;
    }

    public String validaDocumento(String documento) {
        // TODO - Pesquisar a diferença de isEmpity e isBlanck
        if(documento == null || documento.trim().equals("") || documento.isEmpty() || documento.isBlank()) {
            return "O documento não pode ser nulo!";
        } else if (documento.length() < 10) {
            return "O documento deve conter no mínimo 10 caracteres";
        }

        return null;
    }

    public String validaIdade(int idade) {
        if (idade <= 10 || idade > 18) {
            return "A idade deve ser maior que 10 e menor ou igual a 18!";
        }

        return null;
    }

    public void adcionarNovosAlunos(Aluno novo){
        this.listaAlunos.add(novo);
    }

    public ArrayList<Aluno> listarAlunos() {
        return this.listaAlunos;
    }
}

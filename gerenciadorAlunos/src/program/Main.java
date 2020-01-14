package program;

import entities.Aluno;
import entities.GerenciadorAlunos;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        fluxoExecucao();
    }

    public static void fluxoExecucao() {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        while(opcao != 9){
            System.out.println("Gerenciador de Alunos\n\tDigite [1] para adcionar novos alunos\n\tDigite [2] para alistar os alunos adcionados.\n\tDigite [9] para sair da execução");
            opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao){
                case 1:
                    System.out.println("Digite o nome do aluno: ");
                    String nome = scanner.nextLine();
                    String resultadoValidacao = gerenciadorAlunos.validaNome(nome);
                    if (resultadoValidacao != null) {
                        System.out.println(resultadoValidacao);
                        break;
                    }

                    System.out.println("Digite a idade do aluno: ");
                    int idade = scanner.nextInt();
                    scanner.nextLine();
                    resultadoValidacao = gerenciadorAlunos.validaIdade(idade);
                    if (resultadoValidacao != null) {
                        System.out.println(resultadoValidacao);
                        break;
                    }

                    System.out.println("Digite o documento do aluno: ");
                    String documento = scanner.nextLine();
                    resultadoValidacao = gerenciadorAlunos.validaDocumento(documento);
                    if (resultadoValidacao != null) {
                        System.out.println(resultadoValidacao);
                        break;
                    }

                    gerenciadorAlunos.adcionarNovosAlunos(new Aluno(nome, idade, documento));

                    break;
                case 2:
                    for (Aluno aluno : gerenciadorAlunos.listarAlunos()) {
                        System.out.println(aluno);
                    }
                    break;
                default:
            }
        }

        scanner.close();
    }

}

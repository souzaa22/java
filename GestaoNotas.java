package primeroprojeto;

import java.util.Scanner;

public class GestaoNotas {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String resposta;

	        do {
	            System.out.println(" Sistema de Gestão de Notas de Alunos ");

	            // Nome do aluno
	            System.out.print("Digite o nome do aluno: ");
	            String nome = sc.nextLine();

	            // Ano do aluno
	            System.out.print("Digite o ano do aluno: ");
	            String ano = sc.nextLine();

	            // Notas
	            double[] notas = new double[3];
	            for (int i = 0; i < 3; i++) {
	                while (true) {
	                    System.out.print("Digite a nota " + (i + 1) + " (0 a 10): ");
	                    notas[i] = sc.nextDouble();

	                    if (notas[i] >= 0 && notas[i] <= 10) {
	                        break;
	                    } else {
	                        System.out.println("Valor inválido! Insira um valor dentro do intervalo de 0 a 10.");
	                    }
	                }
	            }

	            // Cálculo da média
	            double media = (notas[0] + notas[1] + notas[2]) / 3.0;

	            // Classificação
	            String classificacao;
	            if (media < 5.0) {
	                classificacao = "Reprovado";
	            } else if (media <= 7.0) {
	                classificacao = "Recuperação";
	            } else {
	                classificacao = "Aprovado";
	            }

	            // Resultado final
	            System.out.println("\n--- Resultado ---");
	            System.out.println("Aluno: " + nome);
	            System.out.println("Ano: " + ano);
	            System.out.println("Notas: " + notas[0] + ", " + notas[1] + ", " + notas[2]);
	            System.out.printf("Média: %.2f%n", media);
	            System.out.println("Classificação: " + classificacao);
	      

	  
	            // Perguntar se deseja continuar
	            System.out.print("Deseja verificar outro aluno? (sim/não): ");
	            resposta = sc.nextLine().trim().toLowerCase();

	        } while (resposta.equals("sim"));

	        System.out.println("\nSistema encerrado. Até a próxima!");
	      
	    }
	

		
		
		

	}


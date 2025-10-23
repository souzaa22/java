package primeroprojeto;
import java.util.Scanner;

public class Lista16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

	        // 1 - Criando um vetor de cores
	        String[] cores = new String[6];
	        System.out.println("Digite 6 cores:");
	        for (int i = 0; i < cores.length; i++) {
	            cores[i] = sc.nextLine();
	        }
	        System.out.println("Cores digitadas:");
	        for (String cor : cores) {
	            System.out.println(cor);
	        }

	        // 2 - Vetor de números decimais
	        double[] numeros = new double[8];
	        System.out.println("Digite 8 números decimais:");
	        for (int i = 0; i < numeros.length; i++) {
	            numeros[i] = sc.nextDouble();
	        }
	        System.out.println("Números digitados:");
	        for (double num : numeros) {
	            System.out.println(num);
	        }

	        // 3 - Mostrando apenas os pares
	        int[] inteiros = new int[10];
	        System.out.println("Digite 10 números inteiros:");
	        for (int i = 0; i < inteiros.length; i++) {
	            inteiros[i] = sc.nextInt();
	        }
	        System.out.println("Números pares digitados:");
	        for (int num : inteiros) {
	            if (num % 2 == 0) {
	                System.out.println(num);
	            }
	        }

	        // 4 - Menores que 50
	        int[] numeros50 = new int[12];
	        System.out.println("Digite 12 números:");
	        for (int i = 0; i < numeros50.length; i++) {
	            numeros50[i] = sc.nextInt();
	            if (numeros50[i] < 50) {
	                System.out.println("menor que 50");
	            }
	        }

	        sc.nextLine(); // Consumir o \n pendente do nextInt

	        // 5 - Procurando um nome no vetor
	        String[] nomes = new String[5];
	        System.out.println("Digite 5 nomes:");
	        for (int i = 0; i < nomes.length; i++) {
	            nomes[i] = sc.nextLine();
	        }
	        System.out.println("Digite um nome para procurar:");
	        String procurar = sc.nextLine();
	        boolean encontrado = false;
	        for (String nome : nomes) {
	            if (nome.equalsIgnoreCase(procurar)) {
	                encontrado = true;
	                break;
	            }
	        }
	        if (encontrado) {
	            System.out.println("Nome encontrado!");
	        } else {
	            System.out.println("Nome não encontrado.");
	        }

	        // 6 - Produto e preço
	        String[] produtos = new String[4];
	        double[] precos = new double[4];
	        System.out.println("Digite 4 produtos e seus preços:");
	        for (int i = 0; i < produtos.length; i++) {
	            System.out.print("Produto: ");
	            produtos[i] = sc.nextLine();
	            System.out.print("Preço: ");
	            precos[i] = sc.nextDouble();
	            sc.nextLine(); // Consumir \n
	        }
	        for (int i = 0; i < produtos.length; i++) {
	            System.out.println("O produto " + produtos[i] + " custa R$" + precos[i]);
	        }

	        // 7 - Verificação de notas
	        double[] notas = new double[6];
	        System.out.println("Digite 6 notas:");
	        for (int i = 0; i < notas.length; i++) {
	            notas[i] = sc.nextDouble();
	        }
	        for (double nota : notas) {
	            if (nota < 6) {
	                System.out.println("aluno reprovado");
	            } else if (nota <= 7) {
	                System.out.println("aluno em recuperação");
	            } else {
	                System.out.println("aluno aprovado");
	            }
	        }

	        // 8 - Promoção de ingressos
	        double[] ingressos = new double[5];
	        System.out.println("Digite 5 preços de ingressos:");
	        for (int i = 0; i < ingressos.length; i++) {
	            ingressos[i] = sc.nextDouble();
	            if (ingressos[i] > 100) {
	                System.out.println("Ingresso com promoção disponível!");
	            }
	        }
	}

}

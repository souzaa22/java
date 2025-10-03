package primeroprojeto;

import java.util.Scanner;

public class Lista16Array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1 - Cores
        String[] nomes = new String[6];
        for (int i = 0; i < 6; i++) {
            System.out.print("Nome da cor[" + i + "]: ");
            nomes[i] = sc.next();
        }

        System.out.println("Mostrando valores armazenados");
        for (int i = 0; i < 6; i++) {
            System.out.println(nomes[i]);
        }

        // 2 - Decimais
        Double[] db = new Double[8];
        for (int i = 0; i < 8; i++) {
            System.out.print("Valor decimal[" + i + "]: ");
            db[i] = sc.nextDouble();
        }

        System.out.println("Mostrando valores armazenados");
        for (int i = 0; i < 8; i++) {
            System.out.println(db[i]);
        }

        // 3 - Pares
        int[] numeros = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = sc.nextInt();
        }

        System.out.println("\nNúmeros pares digitados:");
        for (int i = 0; i < 10; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.println(numeros[i]);
            }
        }

        // 4 - Menores que 50
        int[] numeros2 = new int[12];
        System.out.println("Digite 12 números:");
        for (int i = 0; i < 12; i++) {
            numeros2[i] = sc.nextInt();
            if (numeros2[i] < 50) {
                System.out.println(numeros2[i] + " é menor que 50");
            }
        }

        sc.nextLine(); // limpa buffer antes de ler nomes

        // 5 - Procurar nome
        String[] nomes3 = new String[5];
        System.out.println("Digite 5 nomes:");
        for (int i = 0; i < 5; i++) {
            nomes3[i] = sc.nextLine();
        }
        System.out.print("Digite um nome para procurar: ");
        String nomeBusca = sc.nextLine();
        boolean encontrado = false;
        for (int i = 0; i < 5; i++) {
            if (nomes3[i].equalsIgnoreCase(nomeBusca)) {
                encontrado = true;
                break;
            }
        }
        if (encontrado) {
            System.out.println("O nome existe no vetor.");
        } else {
            System.out.println("O nome não existe no vetor.");
        }

        // 6 - Produtos
        String[] produtos = new String[4];
        double[] precos = new double[4];
        System.out.println("\nDigite o nome e preço de 4 produtos:");
        for (int i = 0; i < 4; i++) {
            System.out.print("Produto " + (i + 1) + ": ");
            produtos[i] = sc.nextLine();
            System.out.print("Preço: R$");
            precos[i] = sc.nextDouble();
            sc.nextLine(); // limpa buffer
        }
        for (int i = 0; i < 4; i++) {
            System.out.println("O produto " + produtos[i] + " custa R$" + precos[i]);
        }

        // 7 - Notas
        double[] notas = new double[6];
        System.out.println("\nDigite 6 notas:");
        for (int i = 0; i < 6; i++) {
            notas[i] = sc.nextDouble();
        }
        for (int i = 0; i < 6; i++) {
            if (notas[i] < 6) {
                System.out.println("Nota " + notas[i] + ": aluno reprovado");
            } else if (notas[i] < 7) {
                System.out.println("Nota " + notas[i] + ": aluno em recuperação");
            } else {
                System.out.println("Nota " + notas[i] + ": aluno aprovado");
            }
        }

        // 8 - Ingressos
        double[] ingressos = new double[5];
        System.out.println("\nDigite os preços de 5 ingressos:");
        for (int i = 0; i < 5; i++) {
            ingressos[i] = sc.nextDouble();
        }
        for (int i = 0; i < 5; i++) {
            if (ingressos[i] > 100) {
                System.out.println("Ingresso de R$" + ingressos[i] + ": Promoção disponível!");
            } else {
                System.out.println("Ingresso de R$" + ingressos[i] + ": Sem promoção.");
            }
        }

    }
}

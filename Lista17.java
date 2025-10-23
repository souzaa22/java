package primeroprojeto;
import java.util.Scanner;

public class Lista17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        // 1 – Criando uma matriz simples 2x3
        int[][] matriz1 = new int[2][3];
        System.out.println("Preencha a matriz 2x3:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matriz completa:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz1[i][j] + " ");
            }
            System.out.println();
        }

        sc.nextLine(); // Consumir o \n pendente

        // 2 – Nomes em uma tabela 3x2
        String[][] nomes = new String[3][2];
        System.out.println("Preencha a matriz 3x2 com nomes:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Nome [" + i + "][" + j + "]: ");
                nomes[i][j] = sc.nextLine();
            }
        }
        System.out.println("Tabela de nomes:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(nomes[i][j] + "\t");
            }
            System.out.println();
        }

        // 3 – Mostrando a diagonal principal 3x3
        int[][] matriz3x3 = new int[3][3];
        System.out.println("Preencha a matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz3x3[i][j] = sc.nextInt();
            }
        }
        System.out.println("Diagonal principal:");
        for (int i = 0; i < 3; i++) {
            System.out.print(matriz3x3[i][i] + " ");
        }
        System.out.println();

        // 4 – Procurando um número em 3x3
        int[][] matrizProcurar = new int[3][3];
        System.out.println("Preencha outra matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matrizProcurar[i][j] = sc.nextInt();
            }
        }
        System.out.print("Digite um número para procurar: ");
        int numero = sc.nextInt();
        boolean encontrado = false;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrizProcurar[i][j] == numero) {
                    System.out.println("Número encontrado na posição [" + i + "][" + j + "]");
                    encontrado = true;
                }
            }
        }
        if (!encontrado) {
            System.out.println("Número não encontrado na matriz.");
        }

        // 5 – Elementos maiores que 10 em 4x3
        int[][] matriz4x3 = new int[4][3];
        System.out.println("Preencha a matriz 4x3:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz4x3[i][j] = sc.nextInt();
            }
        }
        System.out.println("Elementos maiores que 10:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz4x3[i][j] > 10) {
                    System.out.print(matriz4x3[i][j] + " ");
                }
            }
        }
	}

}

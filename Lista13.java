package primeroprojeto;

public class Lista13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		import java.util.Scanner;

		public class Exercicios {
		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		        System.out.println("===== 1 - Contador de 10 a 30 =====");
		        for(int i = 10; i <= 30; i++){
		            System.out.println(i);
		        }

		        System.out.println("\n===== 2 - Classificação de Idades =====");
		        for(int i = 0; i < 10; i++){
		            System.out.print("Digite uma idade: ");
		            int idade = sc.nextInt();
		            if(idade >= 18)
		                System.out.println("Maior de idade");
		            else
		                System.out.println("Menor de idade");
		        }

		        System.out.println("\n===== 3 - Eleição =====");
		        for(int i = 1; i <= 5; i++){
		            System.out.print("Digite o voto (1 a 6): ");
		            int voto = sc.nextInt();

		            switch(voto){
		                case 1,2,3,4 -> System.out.println("Voto no candidato " + voto);
		                case 5 -> System.out.println("Voto nulo");
		                case 6 -> System.out.println("Voto em branco");
		                default -> System.out.println("Código inválido");
		            }
		        }

		        sc.nextLine(); // limpar buffer

		        System.out.println("\n===== 4 - Repetição de Frase =====");
		        System.out.print("Digite uma frase: ");
		        String frase = sc.nextLine();

		        System.out.print("Quantas vezes repetir? ");
		        int vezes = sc.nextInt();

		        for(int i = 0; i < vezes; i++){
		            System.out.println(frase);
		        }

		        System.out.println("\n===== 5 - Sequência 50 até 30 =====");
		        for(int i = 50; i >= 30; i--){
		            System.out.println(i);
		        }

		        System.out.println("\n===== 6 - Números Alternados =====");
		        for(int i = 1; i <= 50; i += 2){
		            System.out.println(i);
		        }

		        System.out.println("\n===== 7 - Aprovado ou Reprovado =====");
		        for(int i = 0; i < 5; i++){
		            System.out.print("Digite a nota: ");
		            double nota = sc.nextDouble();
		            if(nota >= 6)
		                System.out.println("Aprovado");
		            else
		                System.out.println("Reprovado");
		        }

		        System.out.println("\n===== 8 - Categoria de Idade =====");
		        for(int i = 0; i < 5; i++){
		            System.out.print("Digite a idade: ");
		            int idade2 = sc.nextInt();

		            if(idade2 <= 12)
		                System.out.println("Criança");
		            else if(idade2 <= 17)
		                System.out.println("Adolescente");
		            else if(idade2 <= 59)
		                System.out.println("Adulto");
		            else
		                System.out.println("Idoso");
		        }

		        System.out.println("\n===== 9 - Número Positivo ou Negativo =====");
		        for(int i = 0; i < 7; i++){
		            System.out.print("Digite um número: ");
		            int num = sc.nextInt();

		            if(num > 0)
		                System.out.println("Positivo");
		            else if(num < 0)
		                System.out.println("Negativo");
		            else
		                System.out.println("Zero");
		        }

		        sc.close();
		        System.out.println("\n--- Fim dos exercícios! ---");
		    }
		}

	}

}

import java.util.Scanner;
public class Lista04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner scanner = new Scanner (System.in);
		//1 Verifica se é maior de idade
		System.out.print("Digite sua idade: ");
		int idade = scanner.nextInt();

		if (idade >= 18) {
		    System.out.println("Você tem "+ idade + " anos e é maior de idade.");
		} else {
		    System.out.println("Você tem " + idade + " anos e é menor de idade.");
		}
		//2 Comparar dois números

		double num1, num2;
		System.out.println("Informe o primeiro números");
		num1 = scanner.nextDouble();
		System.out.println("Informe o segundo número");
		num2 = scanner.nextDouble();

		if(num1>num2) {
			System.out.println("O primeiro número é maior que o segundo");
		} else { System.out.println("O segundo número é maior ou eles são iguais");
			}

		// 3  Aprovação por nota

		System.out.print("Digite a nota do aluno: ");
		double nota = scanner.nextDouble();
		if (nota > 7) {
		    System.out.println("Aprovado: sua nota foi " + nota);
		} else {
		    System.out.println("Reprovado: sua nota foi " + nota);
		}
		 
		//4 Verificar número positivo

		System.out.print("Digite um número: ");
		double numero = scanner.nextDouble();
		if (numero > 0) {
		    System.out.println("O número é positivo");
		} else {
		    System.out.println("O número é negativo ou zero");
		}

		//5 Cálculo de frete
		System.out.print("Informe a distância de entrega (km): ");
		double distancia = scanner.nextDouble();

		double valorFrete;
		if (distancia <= 50) {
		    valorFrete = 10.00;
		} else {
		    valorFrete = distancia * 0.5;
		}

		System.out.printf("Valor do frete: R$ %.2f%n", valorFrete);

		//6

		System.out.print("Digite um número: ");
		int numero4 = scanner.nextInt();

		if (numero4 == 10) {
		    System.out.println("O número é 10");
		} else {
		    System.out.println("O número não é 10");
		}

		//7
		System.out.print("Você é associado da loja? (sim/não): ");
		String resposta = scanner.next().toLowerCase();

		if (resposta.equals("sim")) {
		    System.out.println("Você tem desconto");
		} else {
		    System.out.println("Você não tem desconto");
		}
		//8
		System.out.print("Digite o número de horas extras trabalhadas: ");
		int horasExtras = scanner.nextInt();

		double bonus;

		if (horasExtras < 10) {
		    bonus = horasExtras * 20.00;
		} else {
		    bonus = horasExtras * 15.00;
		}

		System.out.printf("Bônus por hora extra R$%.2f%n", bonus);

}
}

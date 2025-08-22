	
	package primeroprojeto;

import java.util.Scanner;

public class lista06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		//1
		System.out.println("Digite um número: ");
		int nmr1 = scanner.nextInt();
		if(nmr1 >=10 && nmr1 <=20) {
			System.out.println("Número está dentro do intervalo");
		} else {
			System.out.println("Fora do intervalo");
		}
		
		//2

System.out.println("Qual sua idade? ");
int idade = scanner.nextInt();
System.out.println("Você tem ingresso? (true/false): ");
boolean ingresso = scanner.nextBoolean();

	if (idade>= 18 && ingresso) {
		System.out.println("Entrada permitida");
	}else {
		System.out.println("Entrada negada");
	}
		//3
			System.out.println("Digite um número: ");
			int nmr = scanner.nextInt();
			if(nmr >=60 && nmr1 <=12) {
				System.out.println("Categoria Especial");
			} else {
				System.out.println("Categoria normal");
			}
			
		//4
			System.out.println("Qual o valor do produto? ");
			double desconto = scanner.nextDouble();
			System.out.println("Qual o método de pagamento? ");
			String pagamento = scanner.next();
 double desc = (desconto * 0.10);
				if (desconto>= 100 && pagamento.equalsIgnoreCase("avista")) {
					System.out.printf("Valor do desconto R$%f",desc );
				}else {
					System.out.println(desconto);
				}
			//5
				System.out.println("Qual sua temperatura? ");
				int temperatura = scanner.nextInt();
				System.out.println("Você tem sintomas? (true/false): ");
				boolean sintoma = scanner.nextBoolean();

					if (temperatura>= 38 || sintoma) {
						System.out.println("ecomenda-se procurar um médico.");
					}else {
						System.out.println("Sem sinais preocupantes.");
					}
			//6
		
	}

}

package primeroprojeto;

import java.util.Scanner;

public class Lista14ForJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 //1
		 for(int cont = 0; cont <=100; cont++) {
			   System.out.println(cont);
		   }
		 //2
		   for(int cont = 0; cont <=20; cont+=2) {
			   System.out.println(cont);
		   }
		 //3
		   for(int cont = 0; cont <=20; cont+=2) {
			   System.out.println(cont);
		   }
		 //4
		   System.out.println("Qual numero vc quer a tabuada?");
		 int tabu = sc.nextInt();
		 for(int i = 1; i<=10; i++) {
			 System.out.println(tabu*i);
		 }
			// 5
			System.out.println("Esses números são divididos por 3");
			for(int cont = 0; cont <= 50; cont+=3) {
						System.out.println(cont);
					}
		
		
			
			// 6
			for(int i = 0; i <= 5; i++) {
				System.out.println("Escolha um numero: ");
				int numero2 = sc.nextInt();
				int div = numero2 % 2;
				if(div == 0) {
					System.out.println("O numero é par");
				} else {
					System.out.println("O numero é impar");
				}
			}
			

			
			// 7
			int soma = 1;
			for(int i = 1; i <= 5; i++) {
				System.out.println("Informe um valor");
				int valor = sc.nextInt();
				soma = soma * valor;
				System.out.println("A soma é " + soma);
			}
			   for (int i = 1; i <= 10; i++) {
		            System.out.print("Funcionário " + i + ": Quantos anos você trabalha na empresa? ");
		            int anos = sc.nextInt();

		            if (anos >= 10) {
		                System.out.println("Parabéns! Você irá receber um prêmio");
		            } else {
		                System.out.println("Quase lá");
		            }

		            System.out.println(); 
			   }}
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}



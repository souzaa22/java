
package primeroprojeto;

import java.util.Scanner;

public class Lista12while {
	  
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		 //1
        int numero =0;
        while (numero<= 30) {
        	System.out.println(numero);
        	numero++;
        }
	   //2
        int numero1 = 0;

        while (numero1 != 5) {
            System.out.print("Tente adivinhar o número: ");
            numero1 = sc.nextInt();
        }

        System.out.println("Parabéns! Você digitou 5 e o programa acabou");
        //3
        int peso;
        do {
            System.out.print("Digite o peso da mala em kg: ");
            peso = sc.nextInt();

            if (peso > 23) {
                System.out.println("Peso excedido! O limite é 23 kg. Tente novamente.");
            }
        } while (peso > 23);

        System.out.println("Mala dentro do limite permitido!");
        //4
        int soma = 0;
        int valor;
        int contador = 1;
        System.out.println("Digite 7 números: ");
        while(contador<=7) {
        	valor = sc.nextInt();
        soma +=valor;
        contador +=1;

        }
        System.out.println("A soma dos números é "+ soma);
        //5	
        int num2;
        do {
            System.out.print("Digite o código de 3 digios ");
            num2 = sc.nextInt();

            if (num2 !=797) {
                System.out.println("Código incorreto");
            }
        } while (num2 !=797);

        System.out.println("Código correto!");
        //6
        
        int litro;
        do {
        	System.out.println("Quanto tem restante no tanque?");
        	litro = sc.nextInt();
        	if(litro <= 10) {
        		System.out.println("Gasolina acabando");
        	}
        }while(litro<=10);
    	System.out.println("Está suficiente");
    	
    	//7

        int distancia;
        int total = 0;

        do {
            System.out.print("Digite a distância percorrida no trecho (0 ou negativo para encerrar): ");
            distancia = sc.nextInt();

            if (distancia > 0) {
                total += distancia;
            }

        } while (distancia > 0);

        System.out.println("Total de quilômetros percorridos: " + total);
	}
	}




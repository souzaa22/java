package primeroprojeto;

import java.util.Scanner;

public class While2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//1
        int numero =1;
        while (numero<= 10) {
        	System.out.println(numero);
        	numero++;
        }
//2
        int numero2 = 10;
        while(numero >=1) {
        	System.out.println(numero);
        	numero--;
//3
        }
        int numero3 =0;
        while (numero3<= 100) {
        	System.out.println(numero3);
        	numero3+= 5;
        }
//4
        int numero5 =1;
        while (numero5<= 5) {
        	System.out.println("Eu gosto de Java");
        	numero5++;
        }
//5
        int contador = 0;
        int soma = 0;
        while (contador < 5) {
            System.out.print("Digite um número inteiro: ");
            int numero8 = scanner.nextInt();
            soma += numero8;             
            contador++;               
        }

        System.out.println("A soma dos números digitados é: " + soma);

//6
        int senha = 0;

        while (senha != 1234) {
            System.out.print("Digite a senha: ");
            senha = scanner.nextInt();

            if (senha != 1234) {
                System.out.println("Senha incorreta, tente novamente.");
            }
        }

        System.out.println("Acesso permitido!");

//7
        System.out.print("Digite um número inteiro positivo: ");
        int numero10 = scanner.nextInt();

        while (numero > 0) {
            System.out.println(numero);
            numero--;  

        System.out.println("Fim da contagem!");
    
}
}
}
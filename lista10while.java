package primeroprojeto;

import java.util.Scanner;

public class lista10while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner sc = new Scanner(System.in);
	  //1 
		int numero =10;
	        while (numero<= 30) {
	        	System.out.println(numero);
	        	numero++;
	        }
	//2    
	        int contador = 0;
	        int soma = 0;

	        while (contador < 3) { 
	            System.out.print("Digite um número inteiro: ");
	            int numero2 = sc.nextInt();
	            soma += numero2; 
	            contador++;     
	        }
//3
	        System.out.println("A soma dos números é: " + soma);

	        int contador2 = 0;
	        int soma2 = 0;

	        while (contador2 < 5) { 
	            System.out.print("Digite um número inteiro: ");
	            int numero3 = sc.nextInt();
	            soma2 += numero3; 
	            contador2++;     
	        }

	        System.out.println("A soma dos números é: " + soma2);
	        
	        //4
	    	int numero5 =1;
	    	
	    	System.out.println("Digite um número");
	    	 int num2 = sc.nextInt();
	        while (numero5<= num2) {
	        	System.out.println(numero5);
	        	numero5++;
	        }
	        //5
	   
	            int i = 1;      
	            int soma33 = 0;      
	            while (i <= 5) {  
	              soma33 = soma33 + i;  
	                i++;             
	            }

	            System.out.println("A soma de 1 a 5 é: " + soma33);
	        
	        
	        //6
	            System.out.print("Digite um número: ");
	            int numero12 = sc.nextInt();

	          
	            System.out.println("\nTabuada do " + numero12 + ":");
	            int ii = 1;
	            while (ii <= 10) {
	                System.out.println(numero12 + " x " + ii + " = " + (numero12 * ii));
	                ii++;
	            }
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	}

}

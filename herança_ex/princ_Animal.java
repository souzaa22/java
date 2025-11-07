package herança_ex;

import java.util.Scanner;



public class princ_Animal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cachorro c1 = new Cachorro();
		Gato g1 = new Gato();
		Scanner sc = new Scanner (System.in);

		System.out.println("Qual o nome do pet?");
		String nome = sc.next();
		System.out.println("Qual a idade do pet");
		int idade = sc.nextInt();
c1.setNome(nome);
c1.setIdade(idade);

		System.out.println("Dados: ");
		c1.mostrarInfo();
		System.out.println("Qual a raça do cachorro?");
		String raca = sc.next();
		 c1.setRaca(raca);
		 c1.abanarRabo();
		 
		
		System.out.println("Qual a cor do Gato?");
		String cor = sc.next();
		g1.setCor(cor);
		g1.subirnoMuro();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

package herança_ex;

import java.util.Scanner;

public class main_Produto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Livro l1 = new Livro();
		  Filme f1 = new Filme();
		  Scanner sc = new Scanner(System.in);
		  
		  System.out.println("Digite o nome do autor: ");
		  String autor = sc.next();
		  System.out.println("Digite o nome do livro: ");
		  String nome2 = sc.next();
		  l1.setNome(nome2);
		  l1.setAutor(autor);
		  l1.lerTrecho();
		  
		  System.out.println("Digite o nome do diretor do filme: ");
		 
		  String diretor = sc.next();
		  System.out.println("Digite o nome do filme: ");
		  String nome = sc.next();
		  System.out.println("Digite o preço do filme: ");
		  double preco = sc.nextDouble();
		  f1.setDiretor(diretor);
		  f1.setNome(nome);
		  f1.setPreco(preco);
		  f1.assistir();
		  f1.mostrarInfo();
	}

}

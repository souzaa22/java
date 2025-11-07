package herança_ex;

import java.util.Scanner;

public class InfCarros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Veiculo v = new Veiculo();
Carro c = new Carro();
Scanner sc = new Scanner(System.in);

System.out.println("Qual o nome da marca do carro? ");
String marca = sc.next();
System.out.println("Qual o ano do carro? ");
int ano = sc.nextInt();
v.setAno(ano);
v.setMarca(marca);
v.mostrarInfo();

System.out.println("Quantas portas tem o carro? ");
int portas = sc.nextInt();
c.setPortas(portas);
c.abrirPortaMalas();

	}

}

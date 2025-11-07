package herança_ex;

import java.util.Scanner;

public class main_Funcionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Vendedor ve = new Vendedor();
Gerente g = new Gerente();
Scanner sc = new Scanner(System.in);

System.out.println("Digite o nome do vendedor ");
String nome = sc.next();
System.out.println("Digite o salário base do vendedor ");
double salarioBase = sc.nextDouble();
ve.setNome(nome);
ve.setSalarioBase(salarioBase);

g.setNome(nome);
g.setSalarioBase(salarioBase);

System.out.println("O salário do Gerente é "+g.calcularSalario());
System.out.println("O salário do vendedor é "+ve.vender());
	}

}

import java.util.Scanner;

public class lista03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		//1 - Resultado de dois números
		int numero1;
		int numero2; 
		System.out.println("Informe um número");
		numero1 = scanner.nextInt();
		System.out.println("Informe outro número: ");
		numero2 = scanner.nextInt();
		int soma1 = numero1 + numero2;
		System.out.println("O resultado é: "+soma1);
		
		//2 - Divisão e Resto
		int numero3, numero4;
	
		System.out.println("Informe um número");
		numero3 = scanner.nextInt();
		System.out.println("Informe outro número: ");
		numero4 = scanner.nextInt();
	    int soma3 = numero3 / numero2;
		int soma4 = numero4 % numero2;
		System.out.println("Número / "+soma3);
		System.out.println("Número % "+soma4);
		
		//3 - Perímetro de um triângulo
int lado1, lado2, lado3;
System.out.println("Informe o primeiro lado do triângulo");
lado1 = scanner.nextInt();
System.out.println("Informe o segundo lado do triângulo");
lado2 = scanner.nextInt();
System.out.println("Informe o terceiro lado do triângulo");
lado3 = scanner.nextInt();
int tdlados = lado1 + lado2 + lado3;
System.out.println("Perímetro ="+tdlados);

//4 - Calculadora de Gorjeta
double conta1, gorjeta;
System.out.println("Qual o valor total da conta?");
conta1 = scanner.nextDouble();
System.out.println("Qual a porcentagem da gorjeta?");
gorjeta = scanner.nextDouble();
double gorjeta1 = conta1 * (gorjeta / 100);
double total = gorjeta + conta1;
System.out.println("O total da conta com gorjeta deu R$"+total);

//5 - Calculadora de área de círculo
double raio;
System.out.println("Qual o tamanho do raio do circulo");
raio = scanner.nextDouble();
double pi =  3.14159 * raio * raio;
System.out.println("Área ="+pi);

//6 - Conversor de idade em dias
int idd;
System.out.println("Informe sua idade");
idd = scanner.nextInt();
int meses = idd *12;
int dias = idd * 365;
int ttdias =  (idd * 365) + (meses * 30) + dias;
System.out.println("Você viveu "+dias+" dias");

//7 - Calculadora de pagamento por hora
double horas, salario;
System.out.println("Quantas horas você trabalhou");
horas = scanner.nextDouble();
System.out.println("Qual o valor pago por hora?");
salario = scanner.nextDouble();
double salariobruto = horas * salario;
double imposto = salariobruto * 0.10;
double salarioliquido = salariobruto - imposto;
System.out.println("Seu salário é "+salariobruto);

	}

}

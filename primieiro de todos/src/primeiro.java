import java.util.Scanner;

public class primeiro {

	public static void main(String[] args) {
		System.out.println("Olá mundo");
int idade = 24;
double salario = 2000.50;
char letra = 'M';
String nome = "Matheus";
boolean chuva = false; 
System.out.println(idade);
System.out.println("O salário é: "+ salario + "reais");
System.out.println("Letra: "+letra);
System.out.println("O nome é: " + nome);
System.out.println(chuva);

//Operadores

int num1 = 10;
int num2 = 3;
double soma = num1 + num2;
double sub= num1 - num2;
double div= num1 / num2;
double mult= num1 * num2;
double resto = num1 & num2;
System.out.println(soma);
System.out.println(sub);
System.out.println(div);
System.out.println(mult);
System.out.println(resto);

//entrada de dados
Scanner scanner = new Scanner(System.in);
	System.out.println("Qual seu nome? ");
String nome1 = scanner.nextLine();
System.out.println("Olá " + nome1);

//Soma de dois numeros
int numero1;
int numero2; 
System.out.println("Informe um número");
numero1 = scanner.nextInt();
System.out.println("Informe outro número: ");
numero2 = scanner.nextInt();
int soma1 = numero1 + numero2;
System.out.println("O resultado é: "+soma1);

//Peça a data de ano de nascimento do usuário e mostre quantos anos ele tem*/
int idd;
System.out.println("Qual ano você nasceu? ");
idd = scanner.nextInt();
int divi = 2025 - idd;
System.out.println("Você tem "+ divi +" anos?");


//calcular desconto
double preco;
double desconto;
System.out.println("Qual o valor da compra?");
preco = scanner.nextDouble();
System.out.println("Qual o valor do desconto?");
desconto = scanner.nextDouble();
double pagar = preco - desconto;
System.out.println("Pague: "+ pagar);

//*Peca duas notas decimais para o usuário, cacule média e mostre*/
double nota1;
double nota2;
System.out.println("Diga a primeira nota decimal: ");
nota1 = scanner.nextDouble();
System.out.println("Diga a segunda nota: ");
nota2 = scanner.nextDouble();
double media = (nota1 + nota2) /2 ;
System.out.println("Sua média é: "+media);
if (media >= 7) {
    System.out.println("Aprovado!");
} else if (media <= 7) {
    System.out.println("Reprovado!");
}




}
	}


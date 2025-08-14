import java.util.Scanner;

public class lista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		//Soma de dois numeros
		
		int numero1;
		int numero2; 
		System.out.println("Informe um número");
		numero1 = scanner.nextInt();
		System.out.println("Informe outro número: ");
		numero2 = scanner.nextInt();
		int soma1 = numero1 + numero2;
		int sub1 = numero1- numero2;
		int mult1 = numero1 * numero2;
		int div1 = numero1 / numero2;
		System.out.println("O resultado da soma é: "+soma1);
		System.out.println("O resultado da subtração é: "+sub1);
		System.out.println("O resultado da multiplicação é: "+mult1);
		System.out.println("O resultado da divisão é: "+div1);
		
		//Cálculo de temperatura
double temp;
System.out.println("Diga a temperatura de sua cidade em Celsius que eu direi em fahrenheit");
temp = scanner.nextDouble();
double fah =(temp * 1.8) + 32;

System.out.println("A temperatura da sua cidade em fahrenheit é: "+fah );


//Conversão de valor
double dindin;
double dolar;
System.out.println("Diga um valor em reais que te direi em dolar");
dindin = scanner.nextDouble();
dolar = dindin / 5.70 ;
System.out.println("A conversão em dolar é: "+dolar);

//Área do retângulo
double base;
double altura;
double area;
System.out.println("Diga base, e depois altura de um retângulo, que te direi a área do retângulo.");
base = scanner.nextDouble();
System.out.println("Agora diga a altura do retângulo");
altura = scanner.nextDouble();
area = base * altura;
System.out.println("A área do retângulo é "+area);

// Conversor de idade
int idade;
int meses;
System.out.println("Diga sua idade e te mostrarei quantos meses você ja viveu");
idade = scanner.nextInt();
meses = idade * 12;
System.out.println("Você viveu "+meses +"meses");

// Conversor de minutos para segundos
int minuto;
int seg;
System.out.println("Diga um tempo em minutos que te direi quantos segundos tem");
minuto = scanner.nextInt();
seg = minuto * 60;
System.out.println(minuto+" minutos tem "+seg+" segundos");
	
//Custo da compra
double prc;
double qntdd;
double total;
System.out.println("Qual o valor do produto?");
prc = scanner.nextDouble();
System.out.println("Qual a quantidade do produto");
qntdd = scanner.nextDouble();
total = prc * qntdd;
System.out.println("O valor total deu "+total);

//Divisão de uma conta de restaurante
double valor;
int pessoas;
double dividir;
System.out.println("Qual o valor da conta?");
valor = scanner.nextDouble();
System.out.println("Quantas pessoas vão pagar?");
pessoas = scanner.nextInt();
dividir = valor / pessoas;
System.out.println("Cada pessoa vai pagar R$"+dividir);

// Cálculo de troco
double cmp;
double troco;
double devolvido;
System.out.println("Quanto deu a compra?");
cmp = scanner.nextDouble();
System.out.println("Valor pago =");
troco = scanner.nextDouble();
devolvido = cmp - troco;
System.out.println("Valor do troco "+devolvido);


	}
}

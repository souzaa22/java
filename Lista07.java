package primeroprojeto;

import java.util.Scanner;

public class Lista07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
//1
		System.out.println("Digite sua idade: ");
		int idd = scanner.nextInt();
		if(idd >=70 || idd <=16) {
			System.out.println("Categoria Especial");
		} else {
			System.out.println("Categoria normal");
		}
		
	//2
		System.out.println("Digite o valor do produto: ");
		double vlr = scanner.nextDouble();
		System.out.println("Digite a quantidade de itens comprados: ");
		double qntdd = scanner.nextDouble();
        double vlr2 = vlr * qntdd;
        double desc = vlr2 * 0.15;
        double valortt = vlr2 - desc;
if(vlr2 >= 200  && qntdd >5){
	System.out.printf("Valor com desconto %.2f",valortt);
}  else {
	System.out.println("Valor total "+vlr);
}
//3
System.out.println("Digite sua frequência cardíaca(em bpm)");
int freq = scanner.nextInt();
System.out.println("Você sente tontura? ");
String tont = scanner.next();
if(freq>=100|| tont.equalsIgnoreCase("sim")) {
	System.out.println("Procurar atendimento médico");
}else {
	System.out.println("Sem sinais de alerta!");
}
//4
System.out.println("Digite sua idade:");
int idade2 = scanner.nextInt() ;
System.out.println("Você é residente do estado? ");
String resident = scanner.next();
if(idade2 >=18 || idade2<=30 && resident.equalsIgnoreCase("sim")) {
	System.out.println("Elegível para o concurso");
} else {
	System.out.println("Não elegível para concurso");
}
//5
System.out.println("Números de projetos concluidos? ");
int projeto = scanner.nextInt();
System.out.println("Quantidade de erros? ");
int erros = scanner.nextInt();
if(erros <=3 && projeto >=10) {
	System.out.println("Recompensa concedida");
}else {
	System.out.println("Sem recompensa");
}








	}
}

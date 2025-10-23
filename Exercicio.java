package primeroprojeto;

public class Exercicio {

    public static void classificarNumero(int numero) {
        if (numero > 0) System.out.println("Positivo");
        else if (numero < 0) System.out.println("Negativo");
        else System.out.println("Zero");
    }

    public static void verificarMaioridade(int idade) {
        if (idade >= 18) System.out.println("Maior de idade");
        else System.out.println("Menor de idade");
    }

    public static void boasVindas(String nome) {
        System.out.println("Bem-vindo(a), " + nome + "!");
    }

    public static void tabuada(int numero) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }

    public static void concatenarPalavras(String p1, String p2) {
        System.out.println(p1 + p2);
    }

    public static void parOuImpar(int numero) {
        System.out.println(numero % 2 == 0 ? "Par" : "Impar");
    }

    public static void classificarTemperatura(double temp) {
        if (temp < 15) System.out.println("Frio");
        else if (temp <= 25) System.out.println("Agradavel");
        else System.out.println("Quente");
    }

    public static void saudacaoPorTurno(String turno) {
        switch(turno.toLowerCase()) {
            case "manha": System.out.println("Bom dia!"); break;
            case "tarde": System.out.println("Boa tarde!"); break;
            case "noite": System.out.println("Boa noite!"); break;
            default: System.out.println("Turno invalido!");
        }
    }

    public static void calcularMedia(double n1, double n2, double n3) {
        System.out.println("Media: " + (n1 + n2 + n3)/3);
    }

    public static void verificarAprovacao(double nota) {
        if (nota >= 7) System.out.println("Aprovado");
        else if (nota >= 5) System.out.println("Em recuperacao");
        else System.out.println("Reprovado");
    }

    public static void main(String[] args) {
        classificarNumero(5);
        verificarMaioridade(20);
        boasVindas("Mateus");
        tabuada(7);
        concatenarPalavras("Olá", " Mundo");
        parOuImpar(9);
        classificarTemperatura(18);
        saudacaoPorTurno("tarde");
        calcularMedia(7.5, 8.0, 6.0);
        verificarAprovacao(6.5);
    }
}


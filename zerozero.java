package primeroprojeto;

public class zerozero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   // 1 - Cálculo para empresa TERMAL
        double instalacao = 300.00;
        double limpeza = 150.00;
        double manutencao = 499.99;
        double totalServico = instalacao + limpeza + manutencao;
        System.out.println("1 - Total a pagar pelos serviços: R$" + totalServico);

        // 2 - Cálculo de salário do Joaquim
        double salarioHora = 35.00;
        int horasTrabalhadasPorDia = 8;
        double salarioDia = salarioHora * horasTrabalhadasPorDia;
        System.out.println("2 - Salário por dia do Joaquim: R$" + salarioDia);

        // 3 - Caixas de bombons
        int bombonsPorCaixa = 27;
        int caixasCompradas = 16;
        int totalBombons = bombonsPorCaixa * caixasCompradas;
        System.out.println("3 - Total de bombons comprados: " + totalBombons + " unidades");

        // 4 - Garrafas de água
        int garrafasVendidas = 300;
        int garrafasPorCaixa = 20;
        int caixasUsadas = garrafasVendidas / garrafasPorCaixa;
        System.out.println("4 - Caixas de garrafas utilizadas: " + caixasUsadas + " caixas");

        // 5 - Cálculo para camisetas
        int camisetasCompradasInicial = 120;
        int camisetasVendidas = 80;
        int camisetasCompradasNovamente = 50;
        int camisetasEmEstoque = (camisetasCompradasInicial - camisetasVendidas) + camisetasCompradasNovamente;
        double precoCamiseta = 30.00;
        double faturamento = camisetasVendidas * precoCamiseta;
        System.out.println("5 - Camisetas em estoque: " + camisetasEmEstoque);
        System.out.println("5 - Faturamento: R$" + faturamento);

        // 6 - Dobro e Metade
        int numero = 40; // Você pode trocar esse valor por qualquer número desejado
        int dobro = numero * 2;
        double metade = numero / 2.0;
        System.out.println("6 - Número escolhido: " + numero);
        System.out.println("6 - Dobro do número: " + dobro);
        System.out.println("6 - Metade do número: " + metade);
    }

	}



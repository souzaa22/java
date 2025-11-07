package herança_ex;

public class Vendedor extends Funcionario{
private int comissao = 500;

public double vender() {
	return getSalarioBase() + comissao;
}




}

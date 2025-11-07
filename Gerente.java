package herança_ex;

public class Gerente extends Funcionario{
private String departamento;

	

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public void gerenciar() {
	
	System.out.println(" O gerente " + getNome() +  "está gerenciando o "+ departamento);
	}
	public double calcularSalario() {
		return getSalarioBase() * 1.2;
	}
}

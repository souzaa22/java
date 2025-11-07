package herança_ex;

public class Veiculo {
private String marca;
private int ano;
public String getMarca() {
	return marca;
}
public void setMarca(String marca) {
	this.marca = marca;
}
public int getAno() {
	return ano;
}
public void setAno(int ano) {
	this.ano = ano;
}

public void mostrarInfo() {
	System.out.println("A marca do carro é: " +marca);
System.out.println("O ano do carro é "+ano);
}




}

package herança_ex;

public class Cachorro extends Animal{
	private String raca;

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}
	public void abanarRabo() {
		System.out.println("o cachorro é da raça: " + raca +" e esta abanando o rabo");
	}
	}


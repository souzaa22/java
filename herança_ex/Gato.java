package herança_ex;

public class Gato extends Animal {
	private String cor;

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	public void subirnoMuro() {
		System.out.println("O gato " + cor +" está em cima do muro");
	}
	}


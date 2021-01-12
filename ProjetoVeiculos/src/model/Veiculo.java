package model;

public abstract class Veiculo {
	protected String marca;
	
	

	public Veiculo(String marca) {
		super();
		this.marca = marca;
	}

	
	// qual o grande aspecto de uma classe abstrata? A possibilidade de ter métodos abstratos
	// o que é um método abstrato? é um "compromisso de implementação", no qual a classe pai (abstrata)
	// define o "o que" e as classe filhas (não abstratas) definem o "como"
	public abstract void acelerar();
	public abstract void frear();
	
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	

}

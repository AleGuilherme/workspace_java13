package model;

public class Carro extends Veiculo {
	
	private String modelo;
	
	public Carro(String marca, String modelo) {
		super(marca);
		this.modelo = modelo;
	}
	
	/* aqui eu estou cumprindo as cláusulas contratuais */
	public void acelerar() {
		System.out.println("Carro "+marca+"/"+modelo+" acelerando no pé! VRUMMMMM");
		
	}
	public void frear() {
		System.out.println("Carro "+marca+"/"+modelo+" freiando na mão! IIIICHHHH");
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	
	
	

}

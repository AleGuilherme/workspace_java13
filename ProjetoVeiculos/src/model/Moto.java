package model;

public class Moto extends Veiculo {
	
	private String tipo;

	public Moto(String marca, String tipo) {
		super(marca);
		this.tipo = tipo;
	}

	/* Moto também deve cumprir o "contrato" */
	public void acelerar() {
		System.out.println("Moto "+marca+" acelerando na mao! PROPROPROPROPRO");
	}
	
	public void frear() {
		System.out.println("Moto "+marca+" freando no pé! UHSIUHSDFOIUH#OIURkdslvaldf m/a.b");
	}
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	

}

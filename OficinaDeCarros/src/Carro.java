
public class Carro {
	private String  marca;
	private boolean quebrado;
	
	public Carro(String marca, boolean quebrado) {
		super();
		this.marca = marca;
		this.quebrado = quebrado;
	}
	
	
	public void andar() {
		if (!quebrado) {
			System.out.println("Carro "+marca+" vruuummmm!!!!");
		}
		else {
			System.out.println("Carro "+marca+" esta quebrado e nao anda...");
		}
	}
	
	public void consertarOCarro() {
		quebrado = false;
		System.out.println("Carro "+marca+" esta consertado. Pode andar!");
	}
	
	
	

}

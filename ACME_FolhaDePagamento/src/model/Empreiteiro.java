package model;

public class Empreiteiro extends Funcionario {
	private float valorEmpreita;

	public Empreiteiro(int numeroRegistro, String nome, float valorEmpreita) {
		super(numeroRegistro, nome);
		this.valorEmpreita = valorEmpreita;
	}

	// cumprindo o "compromisso de implementação"
	public float calcularSalario() {
		return valorEmpreita;
	}
	
	public float getValorEmpreita() {
		return valorEmpreita;
	}

	public void setValorEmpreita(float valorEmpreita) {
		this.valorEmpreita = valorEmpreita;
	}
	
	
	

}

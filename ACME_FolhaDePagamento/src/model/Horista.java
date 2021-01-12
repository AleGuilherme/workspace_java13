package model;

public class Horista extends Funcionario {
	
	private int numHoras;
	private float valorHora;
	
	public Horista(int numeroRegistro, String nome, int numHoras, float valorHora) {
		super(numeroRegistro, nome);
		this.numHoras = numHoras;
		this.valorHora = valorHora;
	}

	public float calcularSalario() {
		return valorHora * numHoras;
	}
	public int getNumHoras() {
		return numHoras;
	}

	public void setNumHoras(int numHoras) {
		this.numHoras = numHoras;
	}

	public float getValorHora() {
		return valorHora;
	}

	public void setValorHora(float valorHora) {
		this.valorHora = valorHora;
	}
	
	
	

}

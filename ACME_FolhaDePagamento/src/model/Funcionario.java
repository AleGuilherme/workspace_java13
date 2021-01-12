package model;

public abstract class Funcionario {
	protected int    numeroRegistro;
	protected String nome;
	
	public Funcionario(int numeroRegistro, String nome) {
		super();
		this.numeroRegistro = numeroRegistro;
		this.nome = nome;
	}
	
	// aqui vem o famoso "compromisso de implementação"
	public abstract float calcularSalario();

	public int getNumeroRegistro() {
		return numeroRegistro;
	}

	public void setNumeroRegistro(int numeroRegistro) {
		this.numeroRegistro = numeroRegistro;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

	
}


/*
 * Quando dizemos que Estudante EXTENDS Pessoa, na verdade estamos definindo que
 * o tipo de dado Estudante AMPLIA o tipo de dado Pessoa, incluindo nele novas
 * informações, ou seja: Estudante tem tudo que Pessoa tem, mais as suas informações específicas
 */
public class Estudante extends Pessoa{
	private int numeroMatricula;
	private String curso;
	
	public String exibirInfo() {
		return nome + " | "+ email + " | "+  telefone + " | "+ numeroMatricula + " | "+ curso;
	}
	
	public int getNumeroMatricula() {
		return numeroMatricula;
	}
	public void setNumeroMatricula(int numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	
	
	
}

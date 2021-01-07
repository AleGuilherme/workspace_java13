
public class Empregado {
	
	// atributos
	private String nome;
	private String cargo;
	private double salario;
	
	
	// já que os atributos estão "blindados" (encapsulados), me resta agora, fazer funcionalidades (botõezinhos)
	// para modificar e consultar os valores
	
	
	
	// método que imprime 1 única linha com os dados do funcionario
	void imprimir() {
		System.out.println("Funcionario: "+nome+" ("+cargo+")  R$ "+String.format("%.2f", salario));
	}
	
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCargo() {
		return cargo;
	}


	public void setCargo(String cargo) {
		this.cargo = cargo;
	}


	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}


	// método que modifica o valor do atributo salário, inserindo um aumento
	void aumentarSalario(double percentual) {
		salario = salario + salario * percentual / 100;
	}

}

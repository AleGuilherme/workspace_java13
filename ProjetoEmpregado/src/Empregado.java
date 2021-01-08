
public class Empregado {
	
	// atributos
	private String nome;
	private String cargo;
	private double salario;
	
	
	// quero definir meu  método CONSTRUTOR (que é o método que é chamado 1 única vez - no momento do NEW)
	// por ser um construtor, seu cabeçalho (assinatura) é diferente... apenas sendo PUBLIC <NOME DA CLASSE>() {...}
	public Empregado(String nome, String cargo, double salario) {
		this.nome = nome;  // o atributo NOME recebe aquilo que eu passar no parâmetro NOME
		this.cargo = cargo;
		this.salario = salario;
		
		// setNome(nome);
		// setCargo(cargo);
		// setSalario(salario);
	}
	
	
	
	
	// já que os atributos estão "blindados" (encapsulados), me resta agora, fazer funcionalidades (botõezinhos)
	// para modificar e consultar os valores
	
	
	
	// método que imprime 1 única linha com os dados do funcionario
	public void imprimir() {
		System.out.println("Funcionario: "+nome+" ("+cargo+")  R$ "+String.format("%.2f", salario));
	}
	
	public void setNome(String nome) {
		if (nome == null || nome.length() == 0)
			System.out.println("ERRO!!!");
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
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
	public void aumentarSalario(double percentual) {
		salario = salario + salario * percentual / 100;
	}

}

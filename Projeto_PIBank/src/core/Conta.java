package core;

public class Conta {
	protected String nomeTitular;
	protected String cpf;
	protected int    numeroConta;
	protected double saldo;
	
	// metodo de exibicao
	public String exibirInfo() {
		return "CONTA: "+numeroConta+" - "+nomeTitular+"("+cpf+")  R$ "+ String.format("%.2f",saldo);
	}
	public void creditar(double valor) {
		this.saldo += valor;
	}
	
	public boolean debitar(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		else {
			return false;
		}
	}
	
	public String getNomeTitular() {
		return nomeTitular;
	}
	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	public double getSaldo() {
		return saldo;
	}
	
	

}

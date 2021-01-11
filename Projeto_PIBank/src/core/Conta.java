package core;

public class Conta extends Object {
	protected String nomeTitular;
	protected String cpf;
	protected int    numeroConta;
	protected double saldo;
    
	public Conta(String nomeTitular, String cpf, int numeroConta) {
		super();
		this.nomeTitular = nomeTitular;
		this.cpf = cpf;
		this.numeroConta = numeroConta;
		this.saldo = 0;
	}
	
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

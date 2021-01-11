package core;

public class ContaEspecial extends Conta {
	
	private double limite;

	public ContaEspecial(String nomeTitular, String cpf, int numeroConta, double limite) {
		super(nomeTitular, cpf, numeroConta);
		this.limite = limite;
	}
	
	public String exibirInfo() {
		return "CONTA ESPECIAL: "+ super.numeroConta + " - " + super.nomeTitular +
			   "("+super.cpf+") R$ "+String.format("%.2f",super.saldo)+" Limite R$ "+String.format("%.2f", this.limite);
	}
	
	public boolean debitar(double valor) {
		if (saldo + limite >= valor) {
			saldo = saldo - valor;
			return true;
		}
		else {
			return false;
		}
	}
	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	

}

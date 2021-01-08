
public class ContaBancaria {
	private String cpf;
	private int    numero;
	private int    dv;
	private double saldo;
	
	public ContaBancaria(String cpf, int numero, int dv, double saldo) {
		this.cpf = cpf;
		this.numero = numero;
		this.dv = dv;
		this.saldo = saldo;
	}
	
	public boolean debitar(double valor) {
		if (saldo >= valor) { // tem saldo disponível
			saldo -= valor;
			return true;
		}
		else {
			return false;
		}
	}
	
	public void creditar(double valor) {
		this.saldo += valor;
	}
	
	public String exibirInfo() {
		return "Conta: "+numero+"-"+dv+" ("+cpf+") "+String.format("%.2f",saldo);
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getDv() {
		return dv;
	}

	public void setDv(int dv) {
		this.dv = dv;
	}

	public double getSaldo() {
		return saldo;
	}

}

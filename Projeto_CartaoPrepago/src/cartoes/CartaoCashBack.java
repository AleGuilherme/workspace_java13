package cartoes;

public class CartaoCashBack extends CartaoPrePago {
 
	// 0 - Gold / 1 - Silver / 2 - Bronze
	private int tipo;

	public CartaoCashBack(String numeroCartao, String nomeTitular, int anoValidade, int mesValidade, double saldo,
			int tipo) {
		super(numeroCartao, nomeTitular, anoValidade, mesValidade, saldo);
		this.tipo = tipo;
	}

	
	@Override
	public String toString() {
		return "CartaoCashBack [numeroCartao=" + numeroCartao + ", nomeTitular=" + nomeTitular + ", anoValidade="
				+ anoValidade + ", mesValidade=" + mesValidade + ", saldo=" + saldo + ", tipo=" + tipo + "]";
	}


	public boolean comprar(double valor) {
		if (super.saldo >= valor) {
			super.saldo -= valor;
			// agora vem a logica do cashback
			
			if (tipo == 0) {  // gold
				super.saldo += valor * 0.08;
			}
			else if (tipo == 1) {  // silver
				super.saldo += valor * 0.05;
			}
			else if (tipo == 2) { // bronze
				super.saldo += valor * 0.02;
			}
			// finalmente a sinalizacao que deu certo
			return true;
		}
		return false; // compra nao rolou
	}
	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	
	

}

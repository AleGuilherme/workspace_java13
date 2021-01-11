
public class BombaDeCombustivel {
	private String nomeCombustivel;
	private double precoLitro;
	private double qtdeLitros;
	private double valorTotal;
	
	public BombaDeCombustivel(String nomeCombustivel, double precoLitro) {
		super();
		this.nomeCombustivel = nomeCombustivel;
		this.precoLitro = precoLitro;
		this.qtdeLitros = 0.0;
		this.valorTotal = 0.0;
	}
	
	public BombaDeCombustivel(String nomeCombustivel) {
		this.nomeCombustivel = nomeCombustivel;
		this.precoLitro = 0.0;
		this.qtdeLitros = 0.0;
		this.valorTotal = 0.0;
	}
	
	public void abastecerPorLitros(double litros) {
		this.qtdeLitros = litros;
		this.valorTotal = this.qtdeLitros * this.precoLitro;
	}
	
	public void abastecerPorValor(double valor) {
		this.valorTotal = valor;
		this.qtdeLitros = this.valorTotal / this.precoLitro;
	}
	
	public String exibirRecibo() {
		String recibo = "========================================\n"+
	                    "    IsidroCorp (r) Gas & Energy         \n"+
				        "----------------------------------------\n"+
	                    "  RECIBO    DE    ABASTECIMENTO         \n"+
				        "  Combustivel: "+this.nomeCombustivel +"\n"+
	                    "  Preço Litro: R$ "+String.format("%.3f", this.precoLitro)+"\n"+
				        "  Litros     : " + String.format("%.3f", this.qtdeLitros)+"\n"+
	                    "  Valor Total: R$ "+String.format("%.2f", this.valorTotal)+"\n"+
				        "----------------------------------------";
	    return recibo;
	                    
	}

	public String getNomeCombustivel() {
		return nomeCombustivel;
	}

	public void setNomeCombustivel(String nomeCombustivel) {
		this.nomeCombustivel = nomeCombustivel;
	}

	public double getPrecoLitro() {
		return precoLitro;
	}

	public void setPrecoLitro(double precoLitro) {
		this.precoLitro = precoLitro;
	}

	public double getQtdeLitros() {
		return qtdeLitros;
	}

	public void setQtdeLitros(double qtdeLitros) {
		this.qtdeLitros = qtdeLitros;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	
	public boolean equals(BombaDeCombustivel outra) {
		if (this.nomeCombustivel.equals(outra.getNomeCombustivel()) &&
			this.precoLitro == outra.getPrecoLitro() && 
			this.qtdeLitros == outra.getQtdeLitros() &&
			this.valorTotal == outra.getValorTotal()) {
			return true;
		}
		else { 
			return false;
		}
			
	
	}
	
	
	

}

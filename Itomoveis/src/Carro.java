/* vou criar um novo tipo de dado, chamado Carro
 * o que pode ter em um carro?
 * 	- marca/modelo
 * 	- ano
 *  - cor
 *  - preco
 *  - km
 *  - finalPlaca
 *  
 *  a definição do tipo de dado nada mais é do que uma lista de declarações de variáveis
 *  que aqui vamos chamar estas "variáveis" de ATRIBUTOS (ou propriedades)
 * 
 */
public class Carro {
	// estrutura definida
	String marcaModelo;
	int    ano;
	String cor;
	double preco;
	int    km;
	int    finalPlaca;
	
	// funcionalidades
	
	// aqui vou definir trechos de códigos (subrotinas) ou MÉTODOS
	void exibirAnuncio(){
		System.out.println("===========================================================");
		System.out.println(" Itomóveis - Seu Tomóvi na palma da mão - ihuuuuuu ");
		System.out.println("-----------------------------------------------------------");
		System.out.println(" Veiculo: "+marcaModelo+"/"+ano);
		System.out.println(" Cor    : "+cor);
		System.out.println(" Placa  : "+finalPlaca+"       KM : "+km);
		System.out.println(" Preço  : R$ "+preco);
		System.out.println("----------------------------------------------------------");
		
	}
	
	// vamos fazer outro método de calcular o IPVA
	/*
	 *  Carros abaixo de 2000 não pagam IPVA
	 *  Carros a partir de 2000 pagam 4.5% de IPVA
	 */
	
	double calcularIPVA(){
		double valorIPVA;
		if (ano < 2000) {
			valorIPVA = 0.0;
		}
		else {
			valorIPVA = preco * 0.045;
		}
		return valorIPVA;
	}
	
	
	/* aqui temos um exemplo de um método que recebe uma entrada, ou seja, a aplicação principal, ao chamar
	 * este método obrigatoriamente tem que passar um valor na chamada para ser atribuído a PARÂMETRO de nome
	 * DESCONTO. Esse parâmetro será usado nas nossas continhas....
	 * 
	 */
	void aplicarDesconto(double desconto) {
		preco = preco - preco * desconto/100;
	}
	
	
}

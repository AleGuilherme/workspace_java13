/* agora meu sistema tem 2 classes
 *  A classe CARRO que define meu novo tipo de dado
 *  A classe LojaDeCarros que é efetivamente meu "programa" que usa a classe Carro como tipo de variável
 */

public class LojaDeCarros {
	public static void main(String[] args) {

		Carro c1; // posso declarar uma variável do tipo Carro? SIM
		
		// porém quando falamos de Classes/objetos, precisamos de um operador pra efetivamente
		// criar a memória
		
		c1 = new Carro();
		
		// ou fazer assim: Carro c1 = new Carro();
		
		c1.marcaModelo = "Porxe Kayeny";
		c1.ano         = 2020;
		c1.cor         = "Chumbo imperial";
		c1.km          = 0;
		c1.finalPlaca  = 3;
		c1.preco       = 1500000.00;
		
		Carro c2 = new Carro();
		
		c2.marcaModelo = "Fiote 147";
		c2.ano         = 1985;
		c2.cor         = "Azul geladeira da vo";
		c2.km          = 967123;
		c2.finalPlaca  = 8;
		c2.preco       = 35000.00;
		
//		System.out.println(" Itomóveis - Seu carro na palma da mão");
//		System.out.println(" Veiculo: "+ c1.marcaModelo+ " / "+c1.ano);
//		System.out.println("     Cor: "+ c1.cor);
//		System.out.println("   Placa: "+ c1.finalPlaca+"  KM: "+c1.km);
//		System.out.println("   Preço: R$ " + c1.preco);
//		
//		System.out.println(" Itomóveis - Seu carro na palma da mão");
//		System.out.println(" Veiculo: "+ c2.marcaModelo+ " / "+c2.ano);
//		System.out.println("     Cor: "+ c2.cor);
//		System.out.println("   Placa: "+ c2.finalPlaca+"  KM: "+c2.km);
//		System.out.println("   Preço: R$ " + c2.preco);
		
		
		System.out.println(" ----- ANTES DO DESCONTOOOO ------");
		c1.exibirAnuncio();
		double ipvaC1 =  c1.calcularIPVA(); // este é um exemplo do método que retorna um valor e este valor é armazenado na variável da classe principal
		System.out.println("SE vc tem curiosidade, o IPVA deste carro custa R$ "+ipvaC1);
		
		c1.aplicarDesconto(35.0);
		
		System.out.println(" ----- O PATRAO FICOU LOUCO!!!! DESCONTO DE 35% NA PÓRXI!!!!");
		c1.exibirAnuncio();
		
		
		c2.exibirAnuncio();
		
		
		
		
		
	}

}

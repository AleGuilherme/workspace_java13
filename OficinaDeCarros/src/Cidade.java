
public class Cidade {
	public static void main(String[] args) {
		
		Carro c1, c2;
		Oficina o1;
		
		o1 = new Oficina("*** OFICINA DO ZÉ ***");
		
		c1 = new Carro("Vokis",true);
		c2 = new Carro("Vorvo",false);
		
		c1.andar();
		c2.andar();
		
		
		o1.fazerManutencaoDeCarros(c1);  // na chamada do método, c = c1 internamente
		
		c1.andar();
		c2.andar();
	}

}


public class Oficina {
	private String nome;
	
	public Oficina(String nome) {
		this.nome = nome;
	}
	
	public void fazerManutencaoDeCarros(Carro c) {
		System.out.println(nome);
		System.out.println("Consertando um carro que chegou...");
		c.consertarOCarro();
		System.out.println("----------------------------------");
		
	}

}

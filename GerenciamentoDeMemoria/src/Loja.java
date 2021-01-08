
public class Loja {
	public static void main(String[] args) {
		
		
		Produto p1;
		Produto p2;
		
		p1 = new Produto(1, "Computador", 1000.00);
		
		p2 = p1;
		
		//p2 = new Produto(p1.getId(), p1.getDescricao(), p1.getPreco());
		
		System.out.println("Exibindo P1 e P2");
		p1.exibirInfo();
		p2.exibirInfo();
		
		p2.setPreco(2000.00);
		
		System.out.println("Exibindo P1 e P2");
		p1.exibirInfo();
		p2.exibirInfo();
		
		Produto p;
		
		for (int i=1; i<100; i++) {
			p = new Produto(i, "Produto "+i, i*100);
		}
		
		System.gc();
		//p.exibirInfo();
	}
}

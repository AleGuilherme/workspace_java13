import java.util.HashMap;

public class MainClass {
	public static void main(String[] args) {
		
		/* versao 1.0 - usando ArrayLists */
		/*
		ArrayList<Produto> lista = new ArrayList<Produto>();
		
		// preenchendo a lista
		for (int id=1;id<1000000; id++) {
			lista.add(new Produto(id,"Produto "+id, id));
		}
		
		int idBusca = -1;
		// vou fazer várias buscas e medir tempo
		long ini = System.currentTimeMillis(); // tempo em milissegundos
		
		for (int cont=1; cont<=1000;cont++) {
			for (int pos=0; pos<lista.size(); pos++) {
				if (lista.get(pos).getId() == idBusca) {
					System.out.println("Achei!");
				}
			}
		}
		
		long fim = System.currentTimeMillis(); // peguei o tempo do fim
		
		System.out.println("Demorou "+(fim-ini)+" milissegundos");
		*/
		//--------------------------------------------------------------
		
		/* versao 2.0 - usando HashMap */
		
		HashMap<Integer, Produto> mapa;
		mapa = new HashMap<Integer, Produto>();
		
		// preenchendo o mapa
		for (int id=1; id<=1000000; id++) {
			mapa.put(id, new Produto(id, "Produto "+id, id));
		}
		
		int idBusca = -1;
		// quero fazer 1000 buscas
		long ini = System.currentTimeMillis();
		
		for (int cont=1; cont < 1000; cont++) {
			Produto p = mapa.get(idBusca);
			if (p != null) {
				System.out.println("Achei");
			}
		}
		
		
		long fim = System.currentTimeMillis();
		
		System.out.println("Demorou "+(fim-ini)+" milissegundos");
		
	}

}

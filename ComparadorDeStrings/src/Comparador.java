
public class Comparador {
	public static void main(String[] args) {
		
		String s1,s2;
		
		//s1 = "Oi tudo bem?";
		//s2 = "Oi tudo bem?";
		
		s1 = new String("Oi, tudo bem?");
		s2 = new String("Oi, tudo bem?");
		
		if (s1 == s2) {
			System.out.println("S1 e S2 apontam para o mesmo local da memória");
		}
		else {
			System.out.println("S1 e S2 apontam para locais distintos na memória");
		}
		
		
		if (s1.equals(s2)) {
			System.out.println("S1 e S2 possuem o mesmo conteudo");
		}
		else {
			System.out.println("S1 e S2 possuem conteudos diferentes");
		}
	}

}

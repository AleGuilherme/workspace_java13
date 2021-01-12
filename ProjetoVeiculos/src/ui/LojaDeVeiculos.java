package ui;

import model.Carro;
import model.Moto;
import model.Veiculo;

public class LojaDeVeiculos {
	public static void main(String[] args) {
		
		
		Veiculo v1,v2;
		
		v1 = new Carro("Vokis","Poizé");
		v2 = new Moto("Cavazaqui","speed");
		
		v1.acelerar();
		v1.frear();
		
		v2.acelerar();
		v2.frear();
	}

}

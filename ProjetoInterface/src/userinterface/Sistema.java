package userinterface;

import core.BancoORACLE;
import core.InterfaceBD;

public class Sistema {

	public static void main(String[] args) {
		
		InterfaceBD ibd = new BancoORACLE();
		
		// conexao com BD
		ibd.conectar("admin", "bd_sistema");
		// execucao de uma instrucao no banco
		ibd.executar("Select * from tb_cliente");
		// desconectar do banco
		ibd.desconectar("bd_sistema");
	}
}

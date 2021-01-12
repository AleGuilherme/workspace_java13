package core;

public class BancoORACLE implements InterfaceBD{

	@Override
	public void conectar(String usuario, String bancoDeDados) {
		System.out.println("Connecting on ORACLE database "+bancoDeDados+" with user "+usuario);
		
	}

	@Override
	public void executar(String comando) {
		System.out.println("oracle> "+comando);
		
	}

	@Override
	public void desconectar(String bancoDeDados) {
		System.out.println("Disconnecting from Oracle database "+bancoDeDados);
		
	}

}

package core;

// ao "comprometer-se" a implementar a Interface, a classe agora precisa ter os métodos da interface
// com código em seu conteúdo
public class BDMySQL implements InterfaceBD{

	@Override
	public void conectar(String usuario, String bancoDeDados) {
		System.out.println("Conectando no banco MYSQL "+ bancoDeDados+ " com Usuario "+usuario);
		
	}

	@Override
	public void executar(String comando) {
		System.out.println("Mysql> "+comando);
		
	}

	@Override
	public void desconectar(String bancoDeDados) {
		System.out.println("Desconectando no banco MySQL "+bancoDeDados);
		
	}

}

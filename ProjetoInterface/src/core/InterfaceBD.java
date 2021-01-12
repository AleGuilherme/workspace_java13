package core;

/* Uma interface é uma definição muito próxima à classe Abstrata, com 2 diferenças técnicas
 * - interfaces não possuem atributos
 * - interfaces não posseum corpo de método
 * 
 * ou seja, na interface eu só defino a lista de métodos a serem implementados
 * 
 */

public interface InterfaceBD {
	public void conectar(String usuario, String bancoDeDados);
	public void executar(String comando);
	public void desconectar(String bancoDeDados);
}

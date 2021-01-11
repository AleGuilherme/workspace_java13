
public class Universidade {
	public static void main(String[] args) {
		
		
		Pessoa p = new Pessoa();
		Estudante e = new Estudante();
		
		p.setNome("Pessoa Comum");
		p.setEmail("email@pessoa.com");
		p.setTelefone("98765-4321");
		
		e.setNome("Estudante");
		e.setEmail("email@estudante.com");
		e.setTelefone("91234-5678");
		e.setNumeroMatricula(9876);
		e.setCurso("Computacao");
		
		
		System.out.println(p.exibirInfo());
		System.out.println(e.exibirInfo());
	}

}

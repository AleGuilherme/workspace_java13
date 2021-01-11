package core;

public class QuestaoSimples {
	protected String enunciado;
	protected String resposta;
	
	public QuestaoSimples(String enunciado, String resposta) {
		super();
		this.enunciado = enunciado;
		this.resposta = resposta;
	}
	
	public String aplicarQuestao() {
		return "Q: "+this.enunciado;
	}
	
	public boolean corrigir(String respAluno) {
//		if (this.resposta.equals(respAluno)) {
//			return true;
//		}
//		return false;
		return this.resposta.equals(respAluno);
	}

	public String getResposta() {
		return resposta;
	}
	
	
	

}

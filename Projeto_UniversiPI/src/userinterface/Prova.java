package userinterface;

import java.util.Scanner;

import core.QuestaoComDica;
import core.QuestaoMultiplaEscolha;
import core.QuestaoSimples;

public class Prova {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int pontos=0;
		
		String suaResposta;

		// a notação [] indica agora que a variável listaQuestoes é um VETOR (ARRAY) /
		// LISTA;
		// entretanto esta notação tem uma característica peculiar: a lista precisa ter
		// um tamanho que é FIXO e IMUTÁVEL
		QuestaoSimples listaQuestoes[];

		// definindo o tamanho da lista
		listaQuestoes = new QuestaoSimples[5]; // 5 questões é o tamanho

		// aqui é a pegadinha: quando eu dou new referindo-me a um tamanho de vetor, eu
		// NAO TENHO OS OBJETOS AINDA
		// é como se eu tivesse 5 variáveis do tipo QuestaoSimples

		// outra característica: a lista sempre começa na posição 0 e vai até a posição
		// TAMANHO-1 (aqui de 0 a 4)

		listaQuestoes[0] = new QuestaoSimples("Quem descobriu o Brasa?", "Pedrao Cabral");
		listaQuestoes[1] = new QuestaoMultiplaEscolha("Quanto vale 2 + 2?", "4", "1", "2", "4", "8");
		listaQuestoes[2] = new QuestaoSimples("Qual o time do coração do professor?", "XV de Jau");
		listaQuestoes[3] = new QuestaoComDica("Qual a cor do cavalo Branco de Napoleão?", "Marrom",
				"Cuidado com o nome");
		listaQuestoes[4] = new QuestaoMultiplaEscolha("Qual a formula da água?", "H2O", "H2O", "H2O2", "NaCl", "H2SO4");
		
		
		// percurso "tradicional" de uma lista usando FOR (poderia ser do/while ou while)
//		for (int pos=0; pos<listaQuestoes.length; pos++) {
//			QuestaoSimples q = listaQuestoes[pos];
//			System.out.println(q.aplicarQuestao());
//		}
		
		
		// existe uma variação do FOR (que chamamos gentilmente de FOREACH) que serve apenas para listas
		
		/*   for (Tipo var : lista){
		 *     ...
		 *   }
		 * 
		 *   este for sempre inicia da 1a posição e "incrementa automaticamente" até chegar na última
		 */
		for (QuestaoSimples q : listaQuestoes) {
			System.out.println(q.aplicarQuestao());
			System.out.print("R: ");
			suaResposta = teclado.nextLine();
			
			if (q.corrigir(suaResposta)) {
				pontos++;
			}
			else {
				System.out.println("Errrrroooooouuuu (imagine Fausto Silva dizendo isso!)");
			}
		}
		System.out.println("Voce acertou um total de "+pontos+"/"+listaQuestoes.length+" perguntas");
		
		

	}

}

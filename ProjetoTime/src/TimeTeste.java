import java.util.Scanner;


public class TimeTeste {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		Time t = new Time();

		
		System.out.println("Por favor, digite a hora (00-23)");
		t.setHora(teclado.nextInt());
		System.out.println("Por favor, digite o minuto (00-59)");
		t.setMinu(teclado.nextInt());
		System.out.println("Por favor, digite o segundo (00-59)");
		t.setSegu(teclado.nextInt());
		
		System.out.println(t.exibirHoraUniversal());
		System.out.println(t.exibirHoraPadrao());
	}

}

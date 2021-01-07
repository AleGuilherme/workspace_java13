import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int a;
		System.out.println("Hello World!!!");
		//System.out.println("Digite o valor de a:");
		//a = teclado.nextInt();
		//System.out.println("Valor digitado = " + a);
		
		double valor = 3.657;
		
		BigDecimal big = new BigDecimal(valor, MathContext.DECIMAL32).setScale(2, RoundingMode.DOWN);
		System.out.println(big);
		
		DecimalFormat formato = new DecimalFormat("#.##");
		System.out.println(formato.format(valor));
		System.out.printf("%.2f\n",valor);

		teclado.close();
	}
}

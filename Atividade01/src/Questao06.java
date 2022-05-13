import java.util.Locale;
import java.util.Scanner;

public class Questao06 {

	public static void main(String[] args) {
		// Ler o valor de uma conta e quantas pessoas vão pagar a conta. O sistema vai apresentar quanto cada um vai pagar.
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor da conta:");
		float conta = scan.nextFloat();
		
		System.out.println("Quantas pessoas vão pagar?");
		int pagantes = scan.nextInt();
		
		float valorUnitario = conta / pagantes;
		System.out.println(String.format("O valor por pessoa será de R$:%.2f", valorUnitario));
		
		scan.close();
	}

}

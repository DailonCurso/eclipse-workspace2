import java.util.Locale;
import java.util.Scanner;

public class Questao05 {

	public static void main(String[] args) {
		// Ler o valor de um jantar, apresentar a taxa do gar�om 10% e tamb�m o valor
		
		Scanner scan = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Digite o \"valor do jantar:\" ");
		float value = scan.nextFloat();
		
		float total = (value * 11)/10;
		
		System.out.println(String.format("Valor da refei��o R$:%.2f + 10%% = R$:%.2f. ", value, total));
		
		scan.close();
	}

}

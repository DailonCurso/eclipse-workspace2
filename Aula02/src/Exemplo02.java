import java.util.Locale;
import java.util.Scanner;

public class Exemplo02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);
		
		float n1, n2;
		System.out.println("Digite o 1? numero: ");
		n1 = scan.nextInt();
		
		System.out.println("Digite 2? numero: ");
		n2 = scan.nextInt();
		
		
		//Opera??es Matem?ticas
		float soma = n1 + n2;		//soma
		float sub = n1 - n2;		//subtra??o
		float mult = n1 * n2;		//multiplica??o
		
		float div;
		if(n2 != 0) {
			div = n1 / n2;		// divis?o
			System.out.println("A divis?o de n1 por n2 = " + div);
		}
		
		double potencia = Math.pow(n1, n2);
		double raizN1 = Math.sqrt(n1);
		double raizN2 = Math.sqrt(n2);
		
		System.out.println("A soma dos valores = " + String.format("%.2f", soma)); // Mensagem + Formata??o do conte?do da vari?vel
		System.out.println(String.format("A subtra??o de n1 por n2 = %.2f", sub)); // Mensagem com a indica??o, vari?vel
		System.out.println(String.format("%s = %.2f", "A multiplica??o dos valores ", mult)); // Utiliza-se os caract?res coringas para substituir as strings
		System.out.println("N1 elevado a N2 = " + potencia); // Se tiver 2 strings ou floats no mesmo format, o Java seleciona pela ordem.
		
		System.out.println("A raiz de N1 = " + String.format("%.2f", raizN1));
		System.out.println(String.format("A raiz de N2 = %.2f", raizN2));
		
		

		
		
		scan.close();
	}

}

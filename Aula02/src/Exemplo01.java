import java.util.Locale;
import java.util.Scanner;

public class Exemplo01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);
		
		//Variaveis
		int n1, n2;
		int div, resto;
		
		//Entrada e dados
		System.out.println("Digite 1 numero:");
		n1 = scan.nextInt();
		
		System.out.println("Digite 1 numero");
		n2 = scan.nextInt();
		
		//Opera��es Matem�ticas	
		int soma = n1 + n2;		//soma
		System.out.println("A soma dos valores = " + soma);
		
		int sub = n1 - n2;		//subtra��o
		System.out.println("A subtra��o de n1 por n2 = " + sub);
		
		int mult = n1 * n2;		//multiplica��o
		System.out.println("A multiplica��o dos valores = " + mult);
		
		//Codi��es da divis�o por zero
		if(n2 != 0) {
					
			div = n1 / n2;		// divis�o
			System.out.println("A divis�o de n1 por n2 = " + div);
			
			resto = n1 % n2;	//resto da divis�o
			System.out.println("O resto da divis�o de n1 por n2 = " + resto);
		
		} else {
			System.out.println("Um n�mero n�o pode ser dividido por zero, por�m zero dividido por algo continua sendo zero.");
		}
		
		scan.close();
	}

}

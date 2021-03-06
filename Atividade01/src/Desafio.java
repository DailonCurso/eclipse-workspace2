import java.util.Locale;
import java.util.Scanner;

public class Desafio {

	public static void main(String[] args) {
		// Ler o valor de uma conta, adcionar a quantidade de pagantes, o valor que alguem ir? pagar a mais e deixar o resto para dividir
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor da conta:");
		float valor = sc.nextFloat();
		
		System.out.println("Quantas pessoas ir?o pagar?");
		int pagantes = sc.nextInt();
		
		float valorUnitario = valor / pagantes;
		System.out.println(String.format("O valor por pessoa ser? de R$:%.2f", valorUnitario));
		
		System.out.println("Alguem ir? pagar a mais? y/n ");
		String controle = sc.next();
		
		if(controle.equals("yes") || controle.equals("sim") || controle.equals("y") || controle.equals("s") ) {
			System.out.println("Quantos ir?o pagar a mais?");
			
			float qtosAmais = sc.nextFloat();
			
			for(int i = 0; i < qtosAmais; i++) {
				System.out.println("Digite o valor que o " + (i +1) +"? ira pagar a mais:");
				float valorDiferente = sc.nextFloat();
				valor -= valorDiferente;
				System.out.println("Total restante: R$:" + valor);
				pagantes --;
				valorUnitario = valor / pagantes;
				System.out.println("Agora fica R$:" + valorUnitario +" para cada um.");
			}
			
			
			
		} else{
			System.out.println(String.format("O valor total ? de %.2f, ficando R$:%.2f para cada", valor, valorUnitario));
		}
		
		
		
		sc.close();
	}

}

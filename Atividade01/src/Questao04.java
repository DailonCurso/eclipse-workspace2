import java.util.Scanner;

public class Questao04 {

	public static void main(String[] args) {
		// Ler nome, valor da hora, horas trabalhadas e apresentar o salário: <fulano> vai receber R$ <xx.xx> 
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o \"Nome do Funcionário:\" ");
		String nome = scan.nextLine();
		
		System.out.println("Digite o \"Valor da Hora\": ");
		float valorHora = scan.nextFloat();
		
		System.out.println("Digite o \"Quantidade de Horas Trabalhadas\": ");
		int horas = scan.nextInt();
		
		double salario = valorHora * horas;
		
		System.out.println(nome + " vai receber R$: " + salario );
		
		
		scan.close();
	}

}

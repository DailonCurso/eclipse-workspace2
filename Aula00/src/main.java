import java.util.Locale;
import java.util.Scanner;
import javax.print.attribute.standard.PrinterInfo;
import java.util.*;

public class main {

	public static void main(String[] args) {
		
		//Pegadinha do Hello World.
		
		System.out.println("Se N?o Digitar a Palavra M?gica, certamente a lingu?gem n?o aprender?. \n");
		System.out.println("Digite a palavra m?gica: \n");
		
		Scanner sc = new Scanner(System.in);
		String magic = "Hello World";
		String a = sc.nextLine();
		
		
		if(a.equals(magic)) {
			System.out.println("Legal jovem Padwan! \nVoc? digitou: " + a + "\n\nQue a for?a esteja com voc?!");
		}else {
			System.out.println("Acert? Mizeravi!");
		}
		
		/*
		 * Testes 
		 * 		de
		 * 		 C?digos 
		 * 				abaixo
		 */
		
		
	//	System.out.println("Hello World\nOl? Mundo");
		
	}

}

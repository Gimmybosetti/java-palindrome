package org.generation.italy.strings;
import java.util.Scanner;

public class VerificaPalindrome {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Inserisci la parola che vuoi verificare: ");
		String input = scan.nextLine();
		String inputReverse = "";
		
		for ( int i = input.length()-1; i >= 0; i--) {
			char c = input.charAt(i);
			inputReverse += c;
		}
		
		if (input.equals(inputReverse)) {
			System.out.println("La lunghezza della parole �: " + input.length() + "\n");
			System.out.println("Inoltre la parola � palindroma!");
		}else {
			System.out.println("La lunghezza della parole �: " + input.length() + "\n");
			System.out.println("Per� mi spiace, la parola non � palindroma!");
		}
		
		
		
		scan.close();

	}

}

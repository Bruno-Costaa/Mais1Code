package Exercicios;

//import java.util.Locale;
import java.util.Scanner;

public class dois {

	public static void main(String[] args) {
		
			//Locale.setDefault(Locale.US);
		Scanner ler = new Scanner (System.in);
		
		int dia , dias , meses , anos;
		
		dia = ler.nextInt();
		
		anos = dia / 365;
		dia = dia % 365;
		
		meses = dia / 30;
		dia = dia % 30;
		
		dias = dia;
		
		System.out.printf("%d ano(s)\n" , anos );
		System.out.printf("%d mes(es)\n" , meses);
		System.out.printf("%d dia(s)\n" , dias );


	}

}

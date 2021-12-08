import java.util.Random;
import java.util.Scanner;

public class Jogo {

	public static void main(String[] args) {
		
		String nome;
		int numero;
		int computador;
		
		Scanner enter = new Scanner(System.in);
		
		Random gerador = new Random();
			
			computador = gerador.nextInt(20);
			
		
	
		
		
		
		System.out.println("Olá, Qual o seu nome?\n");
			nome = enter.nextLine();
			
		System.out.println("Olá %s , vamos jogar um jogo, o computador irá escolher um número aleatório entre 0 e 20, e você deve acertar".formatted(nome));
		System.out.println("Agora tente acertar o numero escolhido pelo computador: ");
		
		do {
			
			numero = enter.nextInt();
			
			if (numero == computador) {
				System.out.println("Você acertou!!");
			}
			else if(numero != computador) {
				System.out.println("Você errou, Tente novamente!");
			}
		}while (numero != computador); 
		
		enter.close();
	}
	
}

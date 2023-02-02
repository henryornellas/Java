import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		int idade;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Qual sua idade?");
		idade = teclado.nextInt();
		
		if(idade >= 18) {
			System.out.println("Entrada autorizada");
		}else {
			System.out.println("Entrada não autorizada.");
		}

	}

}

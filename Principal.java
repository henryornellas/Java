import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		int valor;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um valor:");
		valor = teclado.nextInt();
		
		System.out.println(++valor + " É sua idade +1.");
		
	}

}

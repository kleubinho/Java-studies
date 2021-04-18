import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		
	//variavel abaixo começa com 0 pois tem que começar com alguma coisa
	// E o 0 é o elemento neutro da soma
		int soma = 0;
		while(x != 0) {
			soma = soma + x;
			x = sc.nextInt();
		}
		
		//Saida
		System.out.println(soma);
		
		
		sc.close();
	}

}

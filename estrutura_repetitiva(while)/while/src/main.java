import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		
	//variavel abaixo come�a com 0 pois tem que come�ar com alguma coisa
	// E o 0 � o elemento neutro da soma
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

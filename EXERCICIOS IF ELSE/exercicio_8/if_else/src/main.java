import java.util.Locale;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		 
		double salario = sc.nextDouble();
		
		double imposto;
		if(salario < 2000.01) {
			imposto = 0.0;
		}
		else if(salario < 3000.01){
			imposto = (salario - 2000.00) * 0.08;
		}
		else if(salario < 4500.01) {
			imposto = (salario - 3000.00) * 0.18 + 1000.0 * 0.08;
		}
		else {
			imposto = (salario - 4500.00) * 0.28 + 1500.0 * 0.18 + 1000 *0.08;
		}
		
		if(imposto == 0.0) {
			System.out.println("Insento");
		}
		else {
			System.out.printf("R$ %.2f%n", imposto);
		}

	}

}

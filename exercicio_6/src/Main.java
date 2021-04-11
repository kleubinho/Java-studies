import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double numero = sc.nextDouble();

        if (numero < 0 || numero > 100){
            System.out.println("Fora de intervalo");
        }
        else if (numero <= 25.0){
            System.out.println("intervalo de [0, 25]");
        }
        else if (numero <= 50.0) {
            System.out.println("intervalo de [25, 50]");
        }
        else if (numero <= 75.0) {
            System.out.println("intervalo de [50, 75]");
        }
        else{
            System.out.println("Intervalo de [75, 100]");
        }
        sc.close();
    }
}

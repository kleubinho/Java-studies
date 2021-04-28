import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //entrada de dados
	    int senha = sc.nextInt();
	    while(senha != 2002){
            System.out.println("senha invalida");
            senha = sc.nextInt();
        }

        System.out.println("Acesso permitido");
	    sc.close();

    }
}

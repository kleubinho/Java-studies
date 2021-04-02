import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int horarioInicial = sc.nextInt();
        int horarioFinal = sc.nextInt();

        int duracao;
        if (horarioInicial < horarioFinal){
            duracao = horarioFinal - horarioInicial;
        }
        else{
            duracao = 24 - horarioInicial + horarioFinal;
        }
        System.out.println("O jogo durou " + duracao + "Hora(s)");

        sc.close();
    }
}

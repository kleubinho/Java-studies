package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // && Utilizado quando desejamos que as duas expressões sejam verdadeiras.
    // || Utilizado quando precisamos que pelo meno um das expressões seja verdadeira.
    // !  Este operador retorna true se o operando tem o valor false, e retorna false se o operando o valor true.

    int A, B;

    A = sc.nextInt();
    B = sc.nextInt();

    if (A % B == 0 || B % A == 0){
        System.out.println("São multiplos");
    }
    else{
        System.out.println("Não multiplos");
    }
    sc.close();
    }
}

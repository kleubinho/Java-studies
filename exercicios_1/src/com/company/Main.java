package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número");

        int N = sc.nextInt();

        if (N < 0) {
            System.out.println("NEGATIVO");
        } else {
            System.out.println("NÃO NEGATIVO");
        }
        sc.close();
    }
}

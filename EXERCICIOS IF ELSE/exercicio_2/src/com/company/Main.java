package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N;
        N = sc.nextInt();

        if (N % 2 == 0){
            System.out.println("Par");
        }
        else{
            System.out.println("Impar");
        }
    sc.close();
    }
}

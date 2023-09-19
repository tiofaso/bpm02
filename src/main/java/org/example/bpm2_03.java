package org.example;

import java.util.Scanner;


/* ======================================================================================================================== */
// Desafio 3
// Sequência de Fibonacci (Recursividade)

/*
A Sequência de Fibonacci tem como primeiros termos os números 0 e 1 e, a seguir,
cada termo subsequente é obtido pela soma dos dois termos predecessores:
0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...

Fibonacci(0) = 0
Fibonacci(1) = 1
Fibonacci(n) = Fibonacci(n-1) + Fibonacci(n-2)

- Entrada

O arquivo de entrada contém um valor inteiro N.

- Saída

Imprima o valor relativo ao N número da sequência de Fibonacci, exemplo:

N = 0  => saída "Fib = 0"
N = 1  => saída "Fib = 1"
N = 3  => saída "Fib = 2"
M = 29 => saída "Fib = 514229"

 */


public class bpm2_03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número positivo para eu mostrar a sequência de Fibonacci!\n");

        int n = entrada.nextInt();

        if (n < 0) {
            System.out.println("Número inválido!");
            int erro = 1;

            while (erro == 1) {
                System.out.println("Digite um número positivo para eu mostrar a sequência de Fibonacci!");
                n = entrada.nextInt();

                if (n < 0) {
                    System.out.println("Número inválido!");
                } else {
                    erro = 0;
                }
            }

        }

        if (n == 0 || n == 1) {
            System.out.println("Fibonacci de " + n + " números é: " + n);
        } else {
            long[] fibonacci = new long[n];

            fibonacci[0] = 0;
            fibonacci[1] = 1;

            for (int i = 2; i < n; i++) {
                fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            }

            System.out.println("Fibonacci de " + n + " números é:");
            for (int i = 0; i < n; i++) {
                System.out.print(fibonacci[i] + " ");
            }
        }
    }
}
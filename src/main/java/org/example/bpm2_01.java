package org.example;

import java.io.IOException;
import java.util.*;

/* ======================================================================================================================== */
// Desafio 1
// Ordenando Números Pares e Ímpares

/* Crie um programa onde você receberá valores inteiros não negativos como
entrada.

Ordene estes valores de acordo com o seguinte critério:

- Primeiro os Pares
- Depois os Ímpares
- Você deve exibir os pares em ordem crescente e na sequência os ímpares em
ordem decrescente.

- Entrada

A primeira linha de entrada contém um único inteiro positivo N (1 < N < 10000)
Este é o número de linhas de entrada que vem logo a seguir. As próximas N
linhas terão, cada uma delas, um valor inteiro não negativo.

- Saída

Exiba todos os valores lidos na entrada segundo a ordem apresentada acima.
Cada número deve ser impresso em uma linha, conforme exemplo de saída abaixo.
*/

public class bpm2_01 {
    public static void main(String[] args) throws IOException {
        Random geradorAleatorio = new Random();

        List<Integer> listaNumerosPares = new ArrayList<>();
        List<Integer> listaNumerosImpares = new ArrayList<>();

        System.out.printf("Digite um número entre 1 e 10000\n");
        Scanner entrada = new Scanner(System.in);
        int numDigitado = entrada.nextInt();

        if (numDigitado < 1 || numDigitado > 10000) {
            System.out.println("Digite um número válido!");
            int erro = 1;

            while (erro == 1) {
                System.out.printf("Digite um número entre 1 e 10000\n");
                numDigitado = entrada.nextInt();

                if (numDigitado < 1 || numDigitado > 10000) {
                    System.out.println("Digite um número válido!");
                    erro = 1;
                } else {
                    erro = 0;
                }
            }
        }

        int cont = 1;

        while (cont <= numDigitado) {
           if (cont % 2 == 0) {
                listaNumerosPares.add(cont);
            } else {
                listaNumerosImpares.add(cont);
            }
            cont++;
        }

        //Números pares em ordem crescente
        Collections.sort(listaNumerosPares);

        System.out.println("Números pares: ");
        for (Integer numerosPares : listaNumerosPares) {
            System.out.println(numerosPares);
        }

        //Números ímpares em ordem decrecente
        Collections.sort(listaNumerosImpares, Collections.reverseOrder());
        System.out.println("Números ímpares: ");
        for (Integer numerosImpares : listaNumerosImpares) {
            System.out.println(numerosImpares);
        }
    }
}

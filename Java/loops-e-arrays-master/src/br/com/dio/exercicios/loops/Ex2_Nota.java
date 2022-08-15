package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido
e continue pedindo
até que o usuário informe um valor válido.
*/
public class Ex2_Nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
      // scan é utilizado para ler os dados inseridos
        int nota;

        System.out.println("Nota: "); // Pedindo a nota
        nota = scan.nextInt(); // Se a nota estiver 'ok' acaba o programa

        // caso a nota seja invalida entra no laço abaixo

        while(nota < 0 | nota > 10) {
            System.out.println("Nota Inválida! Digite novamente: ");
            nota = scan.nextInt();
        }

    }

}

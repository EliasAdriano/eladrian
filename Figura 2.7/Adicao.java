// Objectivo: Receber dois números inteirosm, calcular a soma deles e imprimir na tela.
// Autor: Elias de Castro Adriano; Data: 25/06/2025, 00H:21M
// Estudando também Git e GitHub, hoje 26/08/2025, 01H:17M. 

import java.util.Scanner;

public class Adicao {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in); 

        int numero1;
        int numero2;
        int soma;
        
        System.out.print("Inserir o primeiro número: ");
        numero1  = input.nextInt();
        System.out.print("Inserir o segundo número: ");
        numero2 = input.nextInt();
        soma = numero1 + numero2;

        System.out.printf("A soma dos dois números é: %d%n", soma);
        
    }
}


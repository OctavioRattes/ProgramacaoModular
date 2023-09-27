/*Escreva códigos Java para preencher um vetor de 6 números inteiros a partir da entrada do usuário e, depois,
inverter as posições dos números do vetor. Por exemplo, se o vetor original era 4-8-15-16-23-42, deve ficar 43-23-16-
15-8-4 após a execução. Escreva um programa que verifique a correção do seu código. */

import java.util.Scanner;

public class basico01 {

    public static int lerTamanhoVetor(){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o tamanho do vetor: ");
        int tamanho = input.nextInt();
        input.nextLine();
        return tamanho;
    }

    public static int[] numerosVetor(int tamanho){

        Scanner input = new Scanner(System.in);
        int vetor[] = new int[tamanho];
        System.out.println("Digite os números do vetor: ");

        for (int i = 0; i < tamanho; i++){
            vetor[i] = input.nextInt();
        }
        return vetor;
    }

    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int tamanho = lerTamanhoVetor(); 
        int vetor[] = numerosVetor(tamanho);
               
        int temp;

        for (int i = 0; i < tamanho / 2; i++){
            temp = vetor[i];
            vetor[i] = vetor[tamanho - 1 - i];
            vetor[tamanho - 1 - i] = temp;
        }
        
        System.out.println("\nVetor invertido\n");

        for (int i = 0; i < tamanho; i++){
            System.out.println("O vetor " + i + " é o número " + vetor[i] + ".");
        } 
           input.close();
    }
}

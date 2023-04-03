/*
    5.  Encontrando o inteiro que falta: Um vetor A contém todos os
        inteiros de 1 a N, exceto 1. Você pode usar a função get(k) que
        retorna o valor do k-ésimo elemento de A e também você pode
        chamar a função swap(i, j) que troca os i-ésimo e j-ésimo
        elementos de A. Projete um algoritmo O(N) para encontrar o
        inteiro que falta.

 */

public class Exercicio5 {
    public static void main(String[] args) {

        int[] v = { 5, 2, 4, 1, 3, 7 , 6, 9, 10};

        int r = encontrarValorFaltante(v, v.length);

        System.out.println("r = " + r);

    }
    
    public static int encontrarValorFaltante(int[] vetor, int tamanho) {
        int somaTotal = 0;
        int somaParcial = 0;
        int i = 0;

        while (i < tamanho) {
            somaParcial += vetor[i];
            somaTotal += (i + 1);
            i++;
        }

        return (somaTotal + i + 1) - somaParcial;
    }
}



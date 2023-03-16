/*
    1. Vetor Bitônico (1): Um vetor bitônico é uma vetor de números que consiste em uma primeira parte crescente seguida por uma segunda parte decrescente. Mais precisamente, um vetor, A[1.. n], é bitônico se e somente se houver um índice i, 1 ≤ i ≤ n, tal que A[1.. i] seja estritamente crescente e A[i.. n] é estritamente decrescente. Por exemplo, o vetor [ 2, 5, 8, 7] é bitônico, com i = 3. Forneça um algoritmo de divisão e conquista que encontre o elemento máximo em um vetor bitônico (você pode assumir que todos os elementos são distintos).
 */

public class Exercicio1 {
    public static void main(String[] args) {

        int[] n = { 2, 5, 8, 7};
        
        int r = encontrarValorMaximo(n, 0, 3);

        System.out.println("Resultado = " + r);
        
    }
    
    public static int encontrarValorMaximo(int[] vetor, int inicio, int fim) {

        int meio = (inicio + fim) / 2;

        if (vetor[meio] > vetor[meio - 1] && vetor[meio] > vetor[meio + 1]) {
            return vetor[meio];
        }

        else {

            if (!(vetor[meio] > vetor[meio - 1])) {
                return encontrarValorMaximo(vetor, inicio, meio);
            }

            return encontrarValorMaximo(vetor, meio, fim);

        }
    }
}



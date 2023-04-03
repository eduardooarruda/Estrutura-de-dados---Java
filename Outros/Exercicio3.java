/*
    3.  Vetor Bonito: Um vetor A de comprimento n é bonito se:
        O vetor A é uma permutação dos inteiros no intervalo [1, n]. 
        Para cada 0 ≤ i < j < n, não há índice k com i < k < j onde 2 * A[k] == A[i] + A[j]. 
        Dado o inteiro n, retorne qualquer vetor bonito de comprimento n. 
        Haverá pelo menos uma resposta válida para o n dado.

        Exemplo 1:
            Entrada: n = 4
            Saída: [2,1,4,3]

        Exemplo 2:
            Entrada: n = 5
            Saída: [3,1,2,5,4]

 */

public class Exercicio3 {
    public static void main(String[] args) {
        int v[] = vetorBonito(20);

        imprimir(v);
    }

    public static int[] vetorBonito(int n) {

        int vetor[] = new int[n];

        int par = 2;
        int impa = 1;
        int flag = 0;

        for (int i = 0; i < n; i++) {
            if (flag == 0) {

                vetor[i] = par;
                par += 2;
                flag = 1;

            } else {

                vetor[i] = impa;
                impa += 2;
                flag = 0;

            }

        }
        
        return vetor;
    }
    
    public static void imprimir(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
           System.out.print(vetor[i] + " "); 
        }
        System.out.println();
    }
}

/*
    4.  Mínimo local em uma matriz: Escreva um programa que, dado um vetor A 
        de n inteiros distintos, encontre um mínimo local: um índice i tal
        que ambos A[i] < A[i-1] e A[i] < A[i+1] (assumindo que a entrada 
        vizinha está dentro dos limites). Seu programa deve fazer 
        aproximadamente 2*lgn comparações no pior caso.
 */

public class Exercicio4 {

    public static void main(String[] args) {
        int[] v = { 3, 5, 1 , 8, 7};
        int r =  encontrarMinimoLocal(v, v.length);
        System.out.println(r);
    }
    
    public static int encontrarMinimoLocal(int[] vetor, int tamanho) {
        int inicio = 0;
        int fim = tamanho - 1;

        while (inicio <= fim) {

            int meio = (inicio + fim) / 2;

            if ((meio == 0 || vetor[meio] < vetor[meio - 1]) && (meio == fim || vetor[meio] < vetor[meio + 1])) {
                return meio;
            }

            else if (meio > 0 && vetor[meio - 1] > vetor[meio]) {
                fim = meio - 1;
            }

            else {
                inicio = meio + 1;
            }
        }
        
        return -1;
    }
}

/*
    2.  Vetor Bitônico (2): Dada uma sequência bitônica de n elementos 
        distintos, escreva um programa para encontrar um determinado elemento
        x na sequência bitônica em tempo O(log n). Uma Sequência Bitônica é 
        uma sequência de números que primeiro é estritamente crescente e 
        depois de um ponto decrescente.
 */

public class Exercicio2 {
    public static void main(String[] args) {

        int[] v = { 2, 5, 8, 7} ;
        
        int r = encontrarValorMaximo(v, 0, 3);

        System.out.println("Resultado = " + r);
        
    }
    
    public static int encontrarValorMaximo(int[] vetor, int inicio, int fim) {

        int meio = (inicio + fim) / 2;

        if (vetor[meio] > vetor[meio - 1] && vetor[meio] > vetor[meio + 1]) {
            return vetor[meio];
        }

        else if (vetor[meio] < vetor[meio - 1]) {
            return encontrarValorMaximo(vetor, inicio, meio);
        }

        else if (vetor[meio] < vetor[meio + 1]) {
            return encontrarValorMaximo(vetor, meio, fim);
        }

        return -1;
    
    }
}



public class SelectionSort {

    public static void ordernar(int[] vetor) {

        for (int i = 0; i < vetor.length; i++) {

            for (int j = i + 1; j < vetor.length; j++) {

                if (vetor[i] > vetor[j]) {
                    int aux = vetor[j];
                    vetor[j] = vetor[i];
                    vetor[i] = aux;
                }

            }

        }

    }

}
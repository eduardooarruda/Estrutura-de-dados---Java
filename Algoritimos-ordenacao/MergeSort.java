public class MergeSort {

    public static void ordernar(int[] vetor, int inicio, int fim) {

        if (inicio < fim) {

            int meio = (inicio + fim) / 2;
            
            ordernar(vetor, inicio, meio);
            ordernar(vetor, meio + 1, fim);

            //Para fazer o Merge
            int[] vetorAux = new int[vetor.length];
            int i = inicio;
            int j = meio + 1;
            int k = inicio;

            while (i <= meio && j <= fim) {

                if (vetor[i] < vetor[j]) {

                    vetorAux[k] = vetor[i];
                    i++;

                } else {

                    vetorAux[k] = vetor[j];
                    j++;

                }

                k++;
            }

            while (i <= meio) {

                vetorAux[k] = vetor[i];
                i++;
                k++;

            }

            while (j <= fim) {

                vetorAux[k] = vetor[j];
                j++;
                k++;

            }

            for (i = inicio; i <= fim; i++) {
                vetor[i] = vetorAux[i];
            }

        }
        
    }

}


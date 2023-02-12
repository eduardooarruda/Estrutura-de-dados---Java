public class InsertionSort {

    public static void ordernar(int[] vetor) {

        for (int i = 1; i < vetor.length; i++) {
            
            int copia = vetor[i];
            int indice = i;
            
            while (indice > 0 && vetor[indice - 1] > copia) {
                vetor[indice] = vetor[indice - 1];
                indice--;
            }
            
            vetor[indice] = copia;
                   
        }
    }
}

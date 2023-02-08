public class Main {
    public static void main(String[] args) {

        int v[] = { 5, 2, 1, 3, 4 };

        MergeSort.ordernar(v, 0, v.length - 1);

        imprimir(v);

    }
    
    public static void imprimir(int[] vetor) {
        for (int valor : vetor) {
            System.out.print(valor + " ");
        }
        System.out.println();
    }

}
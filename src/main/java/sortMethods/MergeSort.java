package sortMethods;

public class MergeSort {

    // Quantidade de trocas
    private int swaps;
    // Quantidade de comparações
    private int comparisons;

    public int getSwaps() {
        return swaps;
    }

    public int getComparisons() {
        return comparisons;
    }

    public void mergeSort(int[] arr) {
        int lenght = arr.length;
        // Caso base
        if (lenght <= 1){
            return;
        }

        // Estabelece o tamanho das listas esquerda e direita
        int middle = lenght / 2;
        int[] left = new int[middle];
        int[] right = new int[lenght - middle];

        // Índice para a lista da esquerda
        int i = 0;
        // Índice para a lista da direita
        int j = 0;

        // Separa os elementos entre a lista esquerda e direita
        for (; i < lenght; i++) {
            if (i < middle) {
                left[i] = arr[i];
            } else {
                right[j] = arr[i];
                j++;
            }
        }
        // Onde ocorre a divisão da lista inicial em duas listas: esquerda e direita
        mergeSort(left);
        mergeSort(right);
        // A função merge combina os dois lados em uma única lista
        merge(left, right, arr);
    }

    private void merge(int[] left, int[] right, int[] arr){

        // Tamanho do lado esquerdo e direito
        int leftSize = arr.length / 2;
        int rightSize = arr.length - leftSize;

        int i = 0; // Índice da lista inicial
        int l = 0; // Índice da lista esquerda
        int r = 0; // Índice da lista direita

        // Comparação entre os lados para fazer as combinações
        while (l < leftSize && r < rightSize){
            comparisons++;
            if (left[l] < right[r]){
                arr[i] = left[l];
                i++;
                l++;
                swaps++;
            } else {
                arr[i] = right[r];
                i++;
                r++;
                swaps++;
            }
        }

        // Combina os lados na lista inicial, caso um lado tenha elementos sobrando
        while (l < leftSize){
            arr[i] = left[l];
            i++;
            l++;
            swaps++;
        }
        while (r < rightSize){
            arr[i] = right[r];
            i++;
            r++;
            swaps++;
        }

    }

}

package sortMethods;

public class MergeSort {

    //Quantidade de trocas
    private int swaps;
    //Quantidade de comparacoes
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

        //Estabelece o tamanho das lista esquerda e direita
        int middle = lenght / 2;
        int[] left = new int[middle];
        int[] right = new int[lenght - middle];

        //Indice para a lista da esquerda
        int i = 0;
        //Indice para a lista da direita
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
        //Onde ocorre a divisao da lista inical em duas listas, esquerda e direita
        mergeSort(left);
        mergeSort(right);
        // Funcao merge combina os dois lado em uma unica lista
        merge(left, right, arr);
    }

    private void merge(int[] left, int[] right, int[] arr){

        // Tamanho do lado esquerdo e direito
        int leftSize = arr.length / 2;
        int rightSize = arr.length - leftSize;

        int i = 0; // Indice lista inical
        int l = 0; // Indice lista esquerda
        int r = 0; // Indice lista direita

        //Comparacao entre o lados para fazer as combinacoes
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

        //Combina os lados na lista inical, caso um lado tenha elementos sobrando
        while (l < leftSize){
            comparisons++;
            arr[i] = left[l];
            i++;
            l++;
            swaps++;
        }
        while (r < rightSize){
            comparisons++;
            arr[i] = right[r];
            i++;
            r++;
            swaps++;
        }

    }

}

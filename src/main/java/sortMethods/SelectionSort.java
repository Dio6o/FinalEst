package sortMethods;

public class SelectionSort {

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

    public void selectionSort(int[] arr) {
        // Verificação se a lista não está vazia
        if (arr.length == 0) {
            return;
        }

        int min;
        int temp;

        for (int i = 0; i < arr.length - 1; i++) {
            min = i;
            // Percorre a lista até encontrar o menor elemento dos itens não ordenados restantes
            for (int j = i + 1; j < arr.length; j++) {
                comparisons++;
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            // Posiciona o menor elemento no começo da lista e passa para o próximo índice
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
            swaps++;

        }
    }



}

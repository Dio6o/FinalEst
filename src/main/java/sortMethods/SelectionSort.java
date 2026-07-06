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
        if (empty(arr)){
            return;
        }
        int min;
        int temp;

        for (int i = 0; i < arr.length - 2; i++) {
            min = i;
            //Percorre a lista ate encontrar o menor elemento dos itens restantes
            for (int j = i + 1; j < arr.length - 1; j++) {
                comparisons++;
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            //Posiciona o menor elemento no comeco da lista
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
            swaps++;

        }
    }

    public boolean empty(int[] arr) {
        return arr.length == 0;
    }

}

package sortMethods;

public class SelectionSort {

    //Quantidade de trocas
    private long swaps;
    //Quantidade de comparacoes
    private long comparisons;

    public long getSwaps() {
        return swaps;
    }

    public void setSwaps(long swaps) {
        this.swaps = swaps;
    }

    public long getComparisons() {
        return comparisons;
    }

    public void setComparisons(long comparisons) {
        this.comparisons = comparisons;
    }

    public void selectionSort(int[] arr) {
        setComparisons(0);
        setSwaps(0);
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
                setComparisons(getComparisons() + 1);
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            // Posiciona o menor elemento no começo da lista e passa para o próximo índice
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
            setSwaps(getSwaps() + 1);

        }
    }



}

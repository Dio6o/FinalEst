package sortMethods;

import java.util.Arrays;

public class BubbleSort {

    //Quantidade de trocas
    private long swaps;
    //Quantidade de comparações
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

    public void bubbleSort(int[] arr){
        setComparisons(0);
        setSwaps(0);
        // Verificação para ver se a lista não está vazia
        if (arr.length == 0){
            return;
        }
        for (int i = 0; i < arr.length - 1; i++){
            // Percorre toda a lista comparando se o item é maior ou menor
            for (int j = 0; j < arr.length - 1 - i; j++){
                // Comparação para descobrir se o próximo item é menor que o item na posição atual
                setComparisons(getComparisons() + 1);
                if (arr[j +1] < arr[j]){
                    // Troca de posição dos itens: o maior passa para frente e o menor volta uma posição
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    setSwaps(getSwaps() + 1);
                }
            }
        }

    }



}

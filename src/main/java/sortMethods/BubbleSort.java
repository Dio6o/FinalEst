package sortMethods;

import java.util.Arrays;

public class BubbleSort {

    //Quantidade de trocas
    private int swaps;
    //Quantidade de comparações
    private int comparisons;

    public int getSwaps() {
        return swaps;
    }

    public int getComparisons() {
        return comparisons;
    }

    public void bubbleSort(int[] arr){
        // Verificação para ver se a lista não está vazia
        if (arr.length == 0){
            return;
        }

        for (int i = 0; i < arr.length - 1; i++){
            // Percorre toda a lista comparando se o item é maior ou menor
            for (int j = 0; j < arr.length - 1 - i; j++){
                // Comparação para descobrir se o próximo item é menor que o item na posição atual
                comparisons++;
                if (arr[j +1] < arr[j]){
                    // Troca de posição dos itens: o maior passa para frente e o menor volta uma posição
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swaps++;
                }
            }
        }

    }



}

package sortMethods;

import java.util.Arrays;

public class BubbleSort {

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

    public void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++){
            //Percorre toda a lista comparando se o item e maior ou menor
            for (int j = 0; j < arr.length - 1 - i; j++){
                //Comparacao para descobrir se o proximo item e menor que o item na posicao atual
                comparisons++;
                if (arr[j +1] < arr[j]){
                    //Troca de posicao dos itens, maior passa para frente e o menor volta uma posicao
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swaps++;
                }
            }
        }

    }


}

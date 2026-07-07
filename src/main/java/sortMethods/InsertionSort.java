package sortMethods;

import java.util.List;

public class InsertionSort {

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

    public void insertionSort(int[] arr){
        // Verifica se a lista não está vazia
        if (empty(arr)){
            return;
        }

        int temp;
        int j;
        for (int i = 1; i < arr.length; i++){
            // Percorre a lista da esquerda para a direita
            temp = arr[i];
            j = i - 1;

            // Compara o item na posição arr[i] com os anteriores,
            // até encontrar um item com um valor maior ou percorrer todos os itens anteriores
            while (j >= 0){
                comparisons++;
                // Verifica se o elemento atual é maior que o elemento temporário
                if (arr[j] <= temp){
                    break;
                }
                arr[j+1] = arr[j];
                j = j - 1;
                swaps++;
            }

            // Posiciona o item na lista já ordenada
            arr[j+1] = temp;
        }

    }

    public boolean empty(int[] arr) {
        return arr.length == 0;
    }

}

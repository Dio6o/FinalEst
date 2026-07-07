package sortMethods;

public class QuickSort {

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

    public void quickSort(int[] arr, int start, int end){
        // Caso base
        if (end <= start){
            return;
        }
        // Definição do pivô
        int pivot = partition(arr, start, end);
        // Partição do lado esquerdo, usando recursão para ambos os lados
        quickSort(arr, start, pivot - 1);
        // Partição do lado direito
        quickSort(arr, pivot + 1, end);

    }

    // Função que retorna a posição final do pivô
    public int partition(int[] arr, int start, int end){

        int pivot = arr[end]; // O pivô sempre começa no final
        int i = start - 1;

        int temp;
        // Separa todos os itens menores que o pivô à esquerda e os maiores que o pivô à direita
        for (int j = start; j <= end - 1; j++){
            // Troca o item na posição j se ele for menor que o pivô
            comparisons++;
            if (arr[j] < pivot){
                i++;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                swaps++;
            }
        }
        i++;
        // Posiciona o pivô na sua posição final
        temp = arr[i];
        arr[i] = arr[end];
        arr[end] = temp;
        swaps++;

        return i;
    }

}

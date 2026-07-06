package sortMethods;

public class QuickSort {

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

    public void quickSort(int[] arr, int start, int end){
        //Caso Base
        if (end <= start){
            return;
        }
        //Definicao do pivo
        int pivot = partition(arr, start, end);
        //Particao do lado esquerdo, usando recursao para ambos os lados
        quickSort(arr, start, pivot - 1);
        //Particao do lado direito
        quickSort(arr, pivot + 1, end);

    }

    // Funcao retorna a posicao do pivo
    public int partition(int[] arr, int start, int end){

        int pivot = arr[end]; //Pivo sempre comeca do final
        int i = start - 1;

        int temp;
        // Separa todos os itens menores que o pivo a esquerda e os maiores que o pivo a direita
        for (int j = start; j <= end - 1; j++){
            //Troca o item na posicao j se ele for menor ou igual que o pivo
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
        // Posiciona o pivo na sua posicao final
        temp = arr[i];
        arr[i] = arr[end];
        arr[end] = temp;
        swaps++;

        return i;
    }

}

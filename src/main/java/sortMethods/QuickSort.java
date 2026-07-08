package sortMethods;

public class QuickSort {

    // Quantidade de trocas
    private long swaps;
    // Quantidade de comparações
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
        // Escolhe um pivo aleatorio e troca com a ultima posicao
        int randomIndex = start + (int)(Math.random() * (end - start + 1));
        int temp = arr[randomIndex];
        arr[randomIndex] = arr[end];
        arr[end] = temp;
        int pivot = arr[end]; // O pivô sempre começa no final
        int i = start - 1;
        // Separa todos os itens menores que o pivô à esquerda e os maiores que o pivô à direita
        for (int j = start; j <= end - 1; j++){
            // Troca o item na posição j se ele for menor que o pivô
            setComparisons(getComparisons() + 1);
            if (arr[j] < pivot){
                i++;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                setSwaps(getSwaps() + 1);
            }
        }
        i++;
        // Posiciona o pivô na sua posição final
        temp = arr[i];
        arr[i] = arr[end];
        arr[end] = temp;
        setSwaps(getSwaps() + 1);

        return i;
    }

}

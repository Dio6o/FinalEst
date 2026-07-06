package sortMethods;

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
        int temp;
        int j;
        for (int i = 1; i < arr.length - 1; i++){
            //Percorre a lista da esquerda para a direita
            temp = arr[i];
            j = i - 1;

            //Compara o item na posicao arr[i] com os anteriores,
            //ate encontrar um item com um valor maior ou percorrer todos os itens antereiores
            while (j >= 0 && arr[j] > temp){
                comparisons++;
                arr[j+1] = arr[j];
                j = j - 1;
            }

            //Posicioana o item na lista ja ordenada
            arr[j+1] = temp;
            swaps++;
        }

    }

}

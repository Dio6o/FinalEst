package sortMethods;

public class HeapSort {

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

    public void heapSort(int[] arr){
        int length = arr.length;
        int temp;

        // Loop para a construção do heap/monte
        for (int i = length / 2 - 1; i >= 0; i--) {
            sink(arr, i, length);
        }
        // Loop para colocar os valores em ordem
        // Posiciona o item arr[0] na última posição da lista, arr[length - 1],
        // reduzindo n em 1, e assim por diante
        while (length > 1) {
            swaps++;
            temp = arr[0];
            arr[0] = arr[length - 1];
            arr[length - 1] = temp;
            length =  length - 1;
            sink(arr, 0, length);
        }

    }

    // Função para "afundar" o item na sua posição correta
    private void sink(int[] arr, int i, int n){
        int k = i; // Índice do item para posicionar
        boolean heap = false; // Condição para saber se ele já foi posicionado corretamente
        int j = (2 * k) + 1; // Índice da posição dos filhos do item
        int temp; // Variável temporária para a troca de posições

        // Loop para organizar o nó do heap
        while (!heap && j < n){

            // Encontrar o filho com maior valor
            if (j + 1 < n){
                comparisons++;
                if(arr[j] < arr[j + 1]){
                    j =  j + 1;
                }
            }

            // Verifica se o nó que estamos afundando é maior que o valor do maior filho;
            // se sim, finaliza o loop
            comparisons++;
            if(arr[k] >= arr[j]){
                heap = true;
            }
            // Se o nó não for maior do que o maior filho, o nó desce e o maior filho sobe
            else {
                temp = arr[k];
                arr[k] = arr[j];
                arr[j] = temp;
                // O loop começa um nível abaixo, buscando os filhos desse item e assim por diante
                k = j;
                j = (2 * k) + 1;
            }

        }

    }

}

package sortMethods;

public class HeapSort {

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

    public void heapSort(int[] arr){
        setComparisons(0);
        setSwaps(0);

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
            setSwaps(getSwaps() + 1);
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
                setComparisons(getComparisons() + 1);
                if(arr[j] < arr[j + 1]){
                    j =  j + 1;
                }
            }
            // Verifica se o nó que estamos afundando é maior que o valor do maior filho;
            // se sim, finaliza o loop
            setComparisons(getComparisons() + 1);
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

package sortMethods;

public class HeapSort {

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

    public void heapSort(int[] arr){
        int length = arr.length;
        int temp;

        //Loop para a construcao do heap/monte
        for (int i = length / 2 - 1; i >= 0; i--) {
            sink(arr, i, length);
        }
        //Loop para colocar os valores em ordem
        //Posiciona o item, arr[0], na ultima posicao da lista, arr[length - 1], reduzindo n por 1 e assim por diante
        while (length > 0) {
            swaps++;
            temp = arr[0];
            arr[0] = arr[length - 1];
            arr[length - 1] = temp;
            length =  length - 1;
            sink(arr, 0, length);
        }

    }

    //Funcao para 'afundar' o item na sua posicao certa
    private void sink(int[] arr, int i, int n){
        int k = i; //Indice do item para posicionar
        boolean heap = false; //Condicao se ele ja foi posicionado corretamente
        int j = (2 * k) + 1; // Indice da posicao dos filhos do item
        int temp; // Variavel temporaria para a troca de posicoes

        //Loop para organizar o nodo do heap
        while (!heap && j < n){
            comparisons++;
            //Encontar o filho com maior valor
            if (j + 1 < n && arr[j] < arr[j + 1]){
                j =  j + 1;
            }
            //Verifica se o nodo que estamos afundando e maior que o valor do maior filho, se sim, finaliza o loop
            if(arr[k] >= arr[j]){
                heap = true;
            }
            // Se o nodo nao for maior do que o maior filho, o nodo desce e o maior filho sobe
            else {
                temp = arr[k];
                arr[k] = arr[j];
                arr[j] = temp;
                //Loop comeca um nivel abaixo, buscando os filhos desse item e assim por diante
                k = j;
                j = (2 * k) + 1;
            }

        }

    }

}

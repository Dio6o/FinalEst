package sortMethods;

import java.util.LinkedList;
import java.util.List;

public class BucketSort {

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

    public void bucketSort(int[] arr, int numberOfBuckets){
        // Verifica se a lista não está vazia e se a quantidade de baldes é maior que zero
        if (arr == null || arr.length == 0 || numberOfBuckets <= 0){
            return;
        }
        // Encontrar o maior e o menor valor da lista
        int max = arr[0];
        int min = arr[0];
        for (int value : arr) {
            if (value > max){
                max = value;
            } else if (value < min){
                min = value;
            }
        }
        // Se todos os valores forem iguais, a lista já está ordenada
        if (max == min) {
            return;
        }
        // Calcula a dispersão dos baldes, ou seja, a faixa de valores de cada balde
        double range = Math.ceil((double) (max - min) / numberOfBuckets);
        // Cria os baldes para armazenar os valores
        List<Integer>[] buckets = new LinkedList[numberOfBuckets];
        for (int i = 0; i < numberOfBuckets; i++){
            buckets[i] = new LinkedList<>();
        }
        // Distribui os valores da lista original entre os baldes, conforme a faixa de valores calculada acima
        for (int value : arr) {
            int index = (int) ((value - min) / range);
            // Garante que o maior valor (value == max) não ultrapasse o último balde
            if (index >= numberOfBuckets) {
                index = numberOfBuckets - 1;
            }
            buckets[index].add(value);
        }
        // Ordena os itens de cada balde; neste caso, foi utilizado o insertion sort
        for (List<Integer> list : buckets){
            for (int i = 1; i < list.size(); i++) {
                int key = list.get(i);
                int j = i - 1;
                boolean moved = false;
                while (j >= 0) {
                    setComparisons(getComparisons() + 1);
                    if (list.get(j) <= key) {
                        break;
                    }
                    list.set(j + 1, list.get(j));
                    j--;
                    setSwaps(getSwaps() + 1);
                    moved = true;
                }
                if (moved) {
                    list.set(j + 1, key);
                }
            }
        }
        //Combina os baldes na ordem correta, do menor para o maior
        int index = 0;
        for (List<Integer> bucket : buckets){
            for (int value : bucket) {
                arr[index++] = value;
            }
        }
    }
}



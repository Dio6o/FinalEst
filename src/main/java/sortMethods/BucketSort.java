package sortMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class BucketSort {

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

    public void bucketSort(int[] arr, int numberOfBuckets){
        InsertionSort insertionSort = new InsertionSort();

        //Verificar se a lista nao e vaiza e se a quantidade de balse e maior que zero
        if (arr == null || arr.length == 0 || numberOfBuckets <= 0){
            return;
        }

        //Encontrar o maior e maior valor da lista
        int max = arr[0];
        int min = arr[0];

        for (int value : arr) {
            if (value > max){
                max = value;
            } else if(value < min){
                min = value;
            }
        }

        // Calcular a dispersao dos baldes, os valor que podem ir em determinado balde
        double range = Math.ceil((double) (max - min) / numberOfBuckets);

        //Criar os baldes para armazenar os valores
        List<Integer>[] buckets = new LinkedList[numberOfBuckets];

        for (int i = 0; i < numberOfBuckets; i++){
            buckets[i] = new LinkedList<>();
        }

        //Divide a lista origianl em baldes distintos e adiciona os valores em seus respectivos baldes
        for (int value : arr) {
            int index = (int)((value - min) / range);
            buckets[index].add(value);
        }

        //Ordenar os itens de cada balde, nesse caso foi utilizado o insertion sort
        for (List<Integer> list : buckets){
            for (int i = 1; i < list.size(); i++) {
                int key = list.get(i);
                int j = i - 1;
                while (j >= 0 && list.get(j) > key) {
                    comparisons++;
                    list.set(j + 1, list.get(j));
                    j--;
                    swaps++;
                }
                swaps++;
                list.set(j + 1, key);
            }
        }

        //Adicionar os valores dos baldes na lista original
        int index = 0;
        for (List<Integer> bucket : buckets){
            for (int value : bucket) {
                arr[index++] = value;
            }
        }

    }

}

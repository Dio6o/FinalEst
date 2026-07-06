package main;

import sortMethods.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        BubbleSort bubble = new BubbleSort();
        InsertionSort insertion = new InsertionSort();
        SelectionSort selection = new SelectionSort();
        MergeSort merge = new MergeSort();
        QuickSort quick = new QuickSort();
        HeapSort heap = new HeapSort();

        int[] arr = {3, 4, 5, 9, 12, 1, 2, 19, 1, 13, 11, 2, 13, 10, 12, 10, 25, 0, 1, 26};

        //Bubble sort
        int[] arr_bubble = arr.clone();
        System.out.println("Bubble Sort: ");
        bubble.bubbleSort(arr_bubble);
        System.out.println(Arrays.toString(arr_bubble));
        System.out.println("Trocas: " + bubble.getSwaps() + ", comparacoes: " + bubble.getComparisons());
        System.out.println();

        //Insertion sort
        int[] arr_insertion = arr.clone();
        System.out.println("Insertion Sort: ");
        insertion.insertionSort(arr_insertion);
        System.out.println(Arrays.toString(arr_insertion));
        System.out.println("Trocas: " + insertion.getSwaps() + ", comparacoes: " + insertion.getComparisons());
        System.out.println();

        //Selection sort
        int[] arr_selection = arr.clone();
        System.out.println("Selection Sort: ");
        selection.selectionSort(arr_selection);
        System.out.println(Arrays.toString(arr_selection));
        System.out.println("Trocas: " + selection.getSwaps() + ", comparacoes: " + selection.getComparisons());
        System.out.println();

        //Merge sort
        int[] arr_merge = arr.clone();
        System.out.println("Merge Sort: ");
        merge.mergeSort(arr_merge);
        System.out.println(Arrays.toString(arr_merge));
        System.out.println("Trocas: " + merge.getSwaps() + ", comparacoes: " + merge.getComparisons());
        System.out.println();

        //Quick sort
        int[] arr_quick = arr.clone();
        System.out.println("Quick Sort: ");
        quick.quickSort(arr_quick, 0, arr_quick.length - 1);
        System.out.println(Arrays.toString(arr_quick));
        System.out.println("Trocas: " + quick.getSwaps() + ", comparacoes: " + quick.getComparisons());
        System.out.println();

        //Heap sort
        int[] arr_heap = arr.clone();
        System.out.println("Heap Sort: ");
        heap.heapSort(arr_heap);
        System.out.println(Arrays.toString(arr_heap));
        System.out.println("Trocas: " + heap.getSwaps() + ", comparacoes: " + heap.getComparisons());
        System.out.println();

    }
}

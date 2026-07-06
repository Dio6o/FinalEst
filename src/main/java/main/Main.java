package main;

import sortMethods.BubbleSort;
import sortMethods.InsertionSort;
import sortMethods.SelectionSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        BubbleSort bubble = new BubbleSort();
        InsertionSort insertion = new InsertionSort();
        SelectionSort selection = new SelectionSort();

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





    }
}

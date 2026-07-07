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
        BucketSort bucket = new BucketSort();


        //Listas para testes envolvendo 100 mil elementos
        int[] arrayOrdered = new int[100000];
        int[] arrayUnordered = new int[100000];

        for (int i = 0; i < 100000; i++) {
            arrayOrdered[i] = i;
            arrayUnordered[i] = (int) (Math.random() * 10000) + 1;
        }

        int[] arrayReverse = new int[100000];

        for (int i = 0; i < arrayReverse.length; i++) {
            arrayReverse[i] = arrayOrdered[arrayOrdered.length - 1 - i];
        }

        //Testes para 100 mil elementos

        long startTime;
        long endTime;

        //Bubble sort
//        System.out.println("Bubble Sort: ");
//
//        long startTime = System.nanoTime();
//        bubble.bubbleSort(arrayOrdered);
//        long endTime = System.nanoTime();
//        System.out.println("Lista ordenada: " + ((endTime - startTime) / 1_000_000.0) + "ms");
//
//        startTime = System.nanoTime();
//        bubble.bubbleSort(arrayUnordered);
//        endTime = System.nanoTime();
//        System.out.println("Lista não ordenada: " + ((endTime - startTime) / 1_000_000.0) + "ms");
//
//        startTime = System.nanoTime();
//        bubble.bubbleSort(arrayReverse);
//        endTime = System.nanoTime();
//        System.out.println("Lista reversa: " + ((endTime - startTime) / 1_000_000.0) + "ms");

        //Insertion sort
        System.out.println("\nInsertion Sort:");

        startTime = System.nanoTime();
        insertion.insertionSort(arrayOrdered);
        endTime = System.nanoTime();
        System.out.println("Lista ordenada: " + ((endTime - startTime) / 1_000_000.0) + " ms");

        startTime = System.nanoTime();
        insertion.insertionSort(arrayUnordered);
        endTime = System.nanoTime();
        System.out.println("Lista não ordenada: " + ((endTime - startTime) / 1_000_000.0) + " ms");

        startTime = System.nanoTime();
        insertion.insertionSort(arrayReverse);
        endTime = System.nanoTime();
        System.out.println("Lista reversa: " + ((endTime - startTime) / 1_000_000.0) + " ms");

        //Selection sort
//        System.out.println("\nSelection Sort:");
//
//        startTime = System.nanoTime();
//        selection.selectionSort(arrayOrdered);
//        endTime = System.nanoTime();
//        System.out.println("Lista ordenada: " + ((endTime - startTime) / 1_000_000.0) + " ms");
//
//        startTime = System.nanoTime();
//        selection.selectionSort(arrayUnordered);
//        endTime = System.nanoTime();
//        System.out.println("Lista não ordenada: " + ((endTime - startTime) / 1_000_000.0) + " ms");
//
//        startTime = System.nanoTime();
//        selection.selectionSort(arrayReverse);
//        endTime = System.nanoTime();
//        System.out.println("Lista reversa: " + ((endTime - startTime) / 1_000_000.0) + " ms");


        //Merge sort
//        System.out.println("\nMerge Sort:");
//
//        startTime = System.nanoTime();
//        merge.mergeSort(arrayOrdered);
//        endTime = System.nanoTime();
//        System.out.println("Lista ordenada: " + ((endTime - startTime) / 1_000_000.0) + " ms");
//
//        startTime = System.nanoTime();
//        merge.mergeSort(arrayUnordered);
//        endTime = System.nanoTime();
//        System.out.println("Lista não ordenada: " + ((endTime - startTime) / 1_000_000.0) + " ms");
//
//        startTime = System.nanoTime();
//        merge.mergeSort(arrayReverse);
//        endTime = System.nanoTime();
//        System.out.println("Lista reversa: " + ((endTime - startTime) / 1_000_000.0) + " ms");


        //Quick sort
//        System.out.println("\nQuick Sort:");
//
//        startTime = System.nanoTime();
//        quick.quickSort(arrayOrdered, 0, arrayOrdered.length - 1);
//        endTime = System.nanoTime();
//        System.out.println("Lista ordenada: " + ((endTime - startTime) / 1_000_000.0) + " ms");
//
//        startTime = System.nanoTime();
//        quick.quickSort(arrayUnordered, 0, arrayUnordered.length - 1);
//        endTime = System.nanoTime();
//        System.out.println("Lista não ordenada: " + ((endTime - startTime) / 1_000_000.0) + " ms");
//
//        startTime = System.nanoTime();
//        quick.quickSort(arrayReverse, 0, arrayReverse.length - 1);
//        endTime = System.nanoTime();
//        System.out.println("Lista reversa: " + ((endTime - startTime) / 1_000_000.0) + " ms");


        //Heap sort
//        System.out.println("\nHeap Sort:");
//
//        startTime = System.nanoTime();
//        heap.heapSort(arrayOrdered);
//        endTime = System.nanoTime();
//        System.out.println("Lista ordenada: " + ((endTime - startTime) / 1_000_000.0) + " ms");
//
//        startTime = System.nanoTime();
//        heap.heapSort(arrayUnordered);
//        endTime = System.nanoTime();
//        System.out.println("Lista não ordenada: " + ((endTime - startTime) / 1_000_000.0) + " ms");
//
//        startTime = System.nanoTime();
//        heap.heapSort(arrayReverse);
//        endTime = System.nanoTime();
//        System.out.println("Lista reversa: " + ((endTime - startTime) / 1_000_000.0) + " ms");


        //Bucket sort
//        System.out.println("\nBucket Sort:");
//
//        startTime = System.nanoTime();
//        bucket.bucketSort(arrayOrdered, 1000);
//        endTime = System.nanoTime();
//        System.out.println("Lista ordenada: " + ((endTime - startTime) / 1_000_000.0) + " ms");
//
//        startTime = System.nanoTime();
//        bucket.bucketSort(arrayUnordered, 1000);
//        endTime = System.nanoTime();
//        System.out.println("Lista não ordenada: " + ((endTime - startTime) / 1_000_000.0) + " ms");
//
//        startTime = System.nanoTime();
//        bucket.bucketSort(arrayReverse, 1000);
//        endTime = System.nanoTime();
//        System.out.println("Lista reversa: " + ((endTime - startTime) / 1_000_000.0) + " ms");


    }
}

package main;

import sortMethods.*;

public class MainMil {
    public static void main(String[] args) {

        BubbleSort bubble = new BubbleSort();
        InsertionSort insertion = new InsertionSort();
        SelectionSort selection = new SelectionSort();
        MergeSort merge = new MergeSort();
        QuickSort quick = new QuickSort();
        HeapSort heap = new HeapSort();
        BucketSort bucket = new BucketSort();


        //Listas para testes envolvendo 1 milhão de elementos
        int[] arrayOrdered = new int[1000000];
        int[] arrayUnordered = new int[1000000];

        for (int i = 0; i < 1000000; i++) {
            arrayOrdered[i] = i;
            arrayUnordered[i] = (int) (Math.random() * 10000) + 1;
        }

        int[] arrayReverse = new int[1000000];

        for (int i = 0; i < arrayReverse.length; i++) {
            arrayReverse[i] = arrayOrdered[arrayOrdered.length - 1 - i];
        }

        //Testes para 1 milhão de elementos
        System.out.println("Testes para 1.000.000 de elementos: ");

        long startTime;
        long endTime;

        //Bubble sort OK
        System.out.println("Bubble Sort: ");

        int[] orderedCopy = arrayOrdered.clone();

        startTime = System.nanoTime();
        bubble.bubbleSort(orderedCopy);
        endTime = System.nanoTime();

        System.out.println("Lista ordenada: " + ((endTime - startTime) / 1_000_000.0) + " ms");
        System.out.println("Comparações: " + bubble.getComparisons() + ", Trocas: " + bubble.getSwaps());
        int[] unorderedCopy = arrayUnordered.clone();

        startTime = System.nanoTime();
        bubble.bubbleSort(unorderedCopy);
        endTime = System.nanoTime();
        System.out.println("Lista não ordenada: " + ((endTime - startTime) / 1_000_000.0) + " ms");
        System.out.println("Comparações: " + bubble.getComparisons() + ", Trocas: " + bubble.getSwaps());

        int[] reverseCopy = arrayReverse.clone();

        startTime = System.nanoTime();
        bubble.bubbleSort(reverseCopy);
        endTime = System.nanoTime();
        System.out.println("Lista reversa: " + ((endTime - startTime) / 1_000_000.0) + " ms");
        System.out.println("Comparações: " + bubble.getComparisons() + ", Trocas: " + bubble.getSwaps());

        //Insertion sort OK
        System.out.println("\nInsertion Sort:");

        int[] orderedCopyInsertion = arrayOrdered.clone();

        startTime = System.nanoTime();
        insertion.insertionSort(orderedCopyInsertion);
        endTime = System.nanoTime();

        System.out.println("Lista ordenada: " + ((endTime - startTime) / 1_000_000.0) + " ms");
        System.out.println("Comparações: " + insertion.getComparisons() + ", Trocas: " + insertion.getSwaps());

        int[] unorderedCopyInsertion = arrayUnordered.clone();

        startTime = System.nanoTime();
        insertion.insertionSort(unorderedCopyInsertion);
        endTime = System.nanoTime();

        System.out.println("Lista não ordenada: " + ((endTime - startTime) / 1_000_000.0) + " ms");
        System.out.println("Comparações: " + insertion.getComparisons() + ", Trocas: " + insertion.getSwaps());

        int[] reverseCopyInsertion = arrayReverse.clone();

        startTime = System.nanoTime();
        insertion.insertionSort(reverseCopyInsertion);
        endTime = System.nanoTime();

        System.out.println("Lista reversa: " + ((endTime - startTime) / 1_000_000.0) + " ms");
        System.out.println("Comparações: " + insertion.getComparisons() + ", Trocas: " + insertion.getSwaps());

        //Selection sort OK
        System.out.println("\nSelection Sort:");

        int[] orderedCopySelection = arrayOrdered.clone();

        startTime = System.nanoTime();
        selection.selectionSort(orderedCopySelection);
        endTime = System.nanoTime();

        System.out.println("Lista ordenada: " + ((endTime - startTime) / 1_000_000.0) + " ms");
        System.out.println("Comparações: " + selection.getComparisons() + ", Trocas: " + selection.getSwaps());

        int[] unorderedCopySelection = arrayUnordered.clone();

        startTime = System.nanoTime();
        selection.selectionSort(unorderedCopySelection);
        endTime = System.nanoTime();

        System.out.println("Lista não ordenada: " + ((endTime - startTime) / 1_000_000.0) + " ms");
        System.out.println("Comparações: " + selection.getComparisons() + ", Trocas: " + selection.getSwaps());

        int[] reverseCopySelection = arrayReverse.clone();

        startTime = System.nanoTime();
        selection.selectionSort(reverseCopySelection);
        endTime = System.nanoTime();

        System.out.println("Lista reversa: " + ((endTime - startTime) / 1_000_000.0) + " ms");
        System.out.println("Comparações: " + selection.getComparisons() + ", Trocas: " + selection.getSwaps());

        //Merge sort OK
        System.out.println("\nMerge Sort:");

        int[] orderedCopyMerge = arrayOrdered.clone();

        startTime = System.nanoTime();
        merge.mergeSort(orderedCopyMerge);
        endTime = System.nanoTime();

        System.out.println("Lista ordenada: " + ((endTime - startTime) / 1_000_000.0) + " ms");
        System.out.println("Comparações: " + merge.getComparisons() + ", Trocas: " + merge.getSwaps());

        int[] unorderedCopyMerge = arrayUnordered.clone();

        startTime = System.nanoTime();
        merge.mergeSort(unorderedCopyMerge);
        endTime = System.nanoTime();

        System.out.println("Lista não ordenada: " + ((endTime - startTime) / 1_000_000.0) + " ms");
        System.out.println("Comparações: " + merge.getComparisons() + ", Trocas: " + merge.getSwaps());

        int[] reverseCopyMerge = arrayReverse.clone();

        startTime = System.nanoTime();
        merge.mergeSort(reverseCopyMerge);
        endTime = System.nanoTime();

        System.out.println("Lista reversa: " + ((endTime - startTime) / 1_000_000.0) + " ms");
        System.out.println("Comparações: " + merge.getComparisons() + ", Trocas: " + merge.getSwaps());

        //Quick sort OK
        System.out.println("\nQuick Sort:");

        int[] orderedCopyQuick = arrayOrdered.clone();

        startTime = System.nanoTime();
        quick.quickSort(orderedCopyQuick, 0, orderedCopyQuick.length - 1);
        endTime = System.nanoTime();

        System.out.println("Lista ordenada: " + ((endTime - startTime) / 1_000_000.0) + " ms");
        System.out.println("Comparações: " + quick.getComparisons() + ", Trocas: " + quick.getSwaps());

        int[] unorderedCopyQuick = arrayUnordered.clone();

        startTime = System.nanoTime();
        quick.quickSort(unorderedCopyQuick, 0, unorderedCopyQuick.length - 1);
        endTime = System.nanoTime();

        System.out.println("Lista não ordenada: " + ((endTime - startTime) / 1_000_000.0) + " ms");
        System.out.println("Comparações: " + quick.getComparisons() + ", Trocas: " + quick.getSwaps());

        int[] reverseCopyQuick = arrayReverse.clone();

        startTime = System.nanoTime();
        quick.quickSort(reverseCopyQuick, 0, reverseCopyQuick.length - 1);
        endTime = System.nanoTime();

        System.out.println("Lista reversa: " + ((endTime - startTime) / 1_000_000.0) + " ms");
        System.out.println("Comparações: " + quick.getComparisons() + ", Trocas: " + quick.getSwaps());

        //Heap sort OK
        System.out.println("\nHeap Sort:");

        int[] orderedCopyHeap = arrayOrdered.clone();

        startTime = System.nanoTime();
        heap.heapSort(orderedCopyHeap);
        endTime = System.nanoTime();

        System.out.println("Lista ordenada: " + ((endTime - startTime) / 1_000_000.0) + " ms");
        System.out.println("Comparações: " + heap.getComparisons() + ", Trocas: " + heap.getSwaps());

        int[] unorderedCopyHeap = arrayUnordered.clone();

        startTime = System.nanoTime();
        heap.heapSort(unorderedCopyHeap);
        endTime = System.nanoTime();

        System.out.println("Lista não ordenada: " + ((endTime - startTime) / 1_000_000.0) + " ms");
        System.out.println("Comparações: " + heap.getComparisons() + ", Trocas: " + heap.getSwaps());

        int[] reverseCopyHeap = arrayReverse.clone();

        startTime = System.nanoTime();
        heap.heapSort(reverseCopyHeap);
        endTime = System.nanoTime();

        System.out.println("Lista reversa: " + ((endTime - startTime) / 1_000_000.0) + " ms");
        System.out.println("Comparações: " + heap.getComparisons() + ", Trocas: " + heap.getSwaps());

        //Bucket sort OK
        System.out.println("\nBucket Sort:");

        int[] orderedCopyBucket = arrayOrdered.clone();

        startTime = System.nanoTime();
        bucket.bucketSort(orderedCopyBucket, 1000);
        endTime = System.nanoTime();

        System.out.println("Lista ordenada: " + ((endTime - startTime) / 1_000_000.0) + " ms");
        System.out.println("Comparações: " + bucket.getComparisons() + ", Trocas: " + bucket.getSwaps());

        int[] unorderedCopyBucket = arrayUnordered.clone();

        startTime = System.nanoTime();
        bucket.bucketSort(unorderedCopyBucket, 1000);
        endTime = System.nanoTime();

        System.out.println("Lista não ordenada: " + ((endTime - startTime) / 1_000_000.0) + " ms");
        System.out.println("Comparações: " + bucket.getComparisons() + ", Trocas: " + bucket.getSwaps());

        int[] reverseCopyBucket = arrayReverse.clone();

        startTime = System.nanoTime();
        bucket.bucketSort(reverseCopyBucket, 100000);
        endTime = System.nanoTime();
        System.out.println("Lista reversa: " + ((endTime - startTime) / 1_000_000.0) + " ms");
        System.out.println("Comparações: " + bucket.getComparisons() + ", Trocas: " + bucket.getSwaps());


    }
}

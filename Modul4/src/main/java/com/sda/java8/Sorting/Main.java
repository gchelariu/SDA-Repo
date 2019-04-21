package com.sda.java8.Sorting;

import com.sun.scenario.effect.Merge;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] myArray = {9, 8, 7, 5, 4, 1, 3, 234, 232, 12312};
        QuickSort.quickSort(myArray);
//        insertionSort();
//        mergeSort();
//        bubbleSort();
    }

    private static void insertionSort() {
        int[] myArray = {9, 8, 7, 6, 5, 5, 4, 3, 2, 1};
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }
        System.out.println(" ");
//        InsertionSort.sort(myArray);
        InsertionSort.insertionSort(myArray);
    }

    private static void mergeSort() {
        int[] myArray = {10, 30, 3, 8, 9, 18, 9, 25};
        MergeSort.printArray(myArray);

        int[] arraySortat = MergeSort.sort(myArray);
        //Daca ii dai void in loc de int[] la sort poti sa scrii
        //MergeSort.sort(myArray) si myArray isi ia automat valoarea sortata
        //ca atunci cand ii dai print (dupa ce ii dai sort) se va scrie myArray sortat
//        MergeSort.printArray(arraySortat);
    }

    private static void bubbleSort() {
        int[] array = {2, 4, 3};
        int[] myArray = {6, 5, 3, 1, 8, 7, 2, 4};
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println("Introduceti elementele: ");

        //Random java util (ca scannerul)
        Random random = new Random();

        //Initializezi si parcurgi array-ul
        int[] nrRandom = new int[n];
        for (int i = 0; i < nrRandom.length; i++) {
            int numberRandom = random.nextInt(100);
            nrRandom[i] = numberRandom;
        }

        BubbleSort mySort = new BubbleSort(array);
        BubbleSort mySort2 = new BubbleSort(myArray);
        BubbleSort mySort3 = new BubbleSort(nrRandom);
        mySort.startSort();
        mySort2.startSort();
        mySort3.startSort();
    }
}

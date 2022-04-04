package com.gatia.spring.introduction;

public class BinarySearchAlgorithm {
    protected SortAlgorithm sortAlgorithm;

    public BinarySearchAlgorithm(SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }

    public int binarySearch(int[] numbers, int numberToSearchFor){
        // Implementing Sorting Logic
        int[] sortedNumbers = sortAlgorithm.sort(numbers);

        // Implementing Search Logic
        return 3;
    }
}

package com.gatia.spring.introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
    protected final SortAlgorithm sortAlgorithm;

    @Autowired
    public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }

    public int binarySearch(int[] numbers, int numberToSearchFor){
        // Implementing Sorting Logic
        int[] sortedNumbers = sortAlgorithm.sort(numbers);

        // Implementing Search Logic
        return 3;
    }
}

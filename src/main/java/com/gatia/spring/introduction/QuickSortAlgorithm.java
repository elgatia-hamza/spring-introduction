package com.gatia.spring.introduction;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class QuickSortAlgorithm implements  SortAlgorithm{
    @Override
    public int[] sort(int[] numbers){
        // Implementing Quick Sort Logic
        return numbers;
    }
}

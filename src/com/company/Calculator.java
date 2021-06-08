package com.company;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    private final List<Integer> numbers = new ArrayList<>();
    public Calculator(int number){
        while (number > 0) {
            numbers.add(number % 10);
            number = number / 10;
        }
    }

    public int Sum()
    {
        int summarize = 0;
        for (Integer number : numbers) {
            summarize += number;
        }
        return  summarize;
    }

    public int Max(){
        int maxInt = 0;
        for (Integer number : numbers) {
            if (maxInt < number) {
                maxInt = number;
            }
        }
        return  maxInt;
    }

    public int Min(){
        int minInt = 10;
        for (Integer number : numbers) {
            if (minInt > number) {
                minInt = number;
            }
        }
        return minInt;
    }

    public float Avg(){
        return (float) Sum()/numbers.size();
    }
}

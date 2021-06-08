package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        InputValidator validator = new InputValidator();
        int number = validator.Input();
        Calculator calculator = new Calculator(number);
        System.out.println(calculator.Sum());
        System.out.println(calculator.Max());
        System.out.println(calculator.Avg());
        System.out.println(calculator.Min());
    }
}


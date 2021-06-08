package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InputValidator {
    private int number;
    public InputValidator(){
    }


    public int Input()
    {
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));
        int number = -1;
        while(number < 0){
            try {
                System.out.println("Input int:");
                number = Integer.parseInt(reader.readLine());
            } catch (Exception e) {
                System.out.println("Error input");
            }
        }
        return number;
    }

}

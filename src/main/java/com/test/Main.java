package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello world from Java!");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter any text:");
        String text = reader.readLine();
        System.out.println("You print: " + text);
        String answer = "";
        while (!answer.equalsIgnoreCase("yes")) {
            System.out.println("Print yes for exist:");
            answer = reader.readLine();
        }
    }
}

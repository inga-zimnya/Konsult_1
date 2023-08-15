package org.example;

import org.example.task1.Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Which task do you want to try? 1 or 2");

        int goal = Consts.scanner.nextInt();

        switch(goal){
            case 1 -> new Task1().run();
            case 2 -> new Task2().run();
            default -> System.out.println("there is no task with such number");
        }
    }
}
package org.example;

public class Task2 {
    public void run(){
        int a = Consts.scanner.nextInt();
        int b = Consts.scanner.nextInt();
        System.out.println("Subtraction of 2 numbers: " + minus(a, b));
    }

    public int minus(int a, int b){
        return a - b;
    }

}

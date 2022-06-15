package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner=new Scanner(System.in);
        System.out.println("Press the number:  " + "" );
        double scan= scanner.nextDouble();
        UnaryOperator unaryOperator= num -> System.out.println(Math.sqrt(num));
        unaryOperator.sqrt(scan);
    }
}

@FunctionalInterface
interface UnaryOperator{
    void sqrt(double num);
}

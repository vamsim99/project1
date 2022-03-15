package com.harman.project1;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Addition addobj = new Addition();
        Subtraction subobj = new Subtraction();
        Divison divobj = new Divison();
        Multiplication mulobj = new Multiplication();
        Integer x,y,addResult,subResult,divResult,mulResult;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1st:");
        x = input.nextInt();
        System.out.println("Enter 2nd:");
        y = input.nextInt();
        addResult = addobj.Add2numbers(x,y);
        subResult = subobj.sub2numbers(x,y);
        divResult = divobj.div2numbers(x,y);
        mulResult = mulobj.mul2numbers(x,y);

        System.out.println(addResult);
        System.out.println(subResult);
        System.out.println(divResult);
        System.out.println(mulResult);



    }
}
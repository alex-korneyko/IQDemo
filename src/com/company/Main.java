package com.company;

import com.company.Classes.StackFpFg;
import com.company.Classes.StackFpLg;

public class Main {

    public static void main(String[] args) {
        StackFpFg stack1 = new StackFpFg(0);
        StackFpLg stack2 = new StackFpLg(0);

        for (int i=0; i<10; i++)
            stack1.put((char) ('A' + i));

        System.out.println("First put, First get");
        System.out.println("stack1 size: " + stack1.getLength());

        for (int i=0; i<5; i++)
            System.out.print(stack1.get() + " ");

        System.out.println();
        System.out.println("stack1 size: " + stack1.getLength());

        for (int i=0; i<5; i++)
            System.out.print(stack1.get() + " ");

        System.out.println();
        System.out.println("stack1 size: " + stack1.getLength());

        for (int i=0; i<10; i++)
            stack2.put((char) ('A' + i));

        System.out.println("First put, Last get");
        System.out.println("stack1 size: " + stack2.getLength());

        for (int i=0; i<5; i++)
            System.out.print(stack2.get() + " ");

        System.out.println();
        System.out.println("stack1 size: " + stack2.getLength());

        for (int i=0; i<5; i++)
            System.out.print(stack2.get() + " ");

        System.out.println();
        System.out.println("stack1 size: " + stack2.getLength());

    }
}

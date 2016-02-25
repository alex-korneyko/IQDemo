package com.company;

import com.company.Classes.StackFpFg;
import com.company.Classes.StackFpLg;

public class Main {

    public static void main(String[] args) {
        StackFpFg stack1 = new StackFpFg(0);
        StackFpLg stack2 = new StackFpLg(0);

        for (int i=0; i<10; i++)
            stack1.put((char) ('A' + i));

        System.out.println(stack1.printInfo());

        for (int i=0; i<5; i++)
            System.out.print(stack1.get() + " ");
        System.out.println();

        System.out.println(stack1.printInfo());

        for (int i=0; i<5; i++)
            System.out.print(stack1.get() + " ");
        System.out.println();

        System.out.println(stack1.printInfo());

        for (int i=0; i<10; i++)
            stack2.put((char) ('A' + i));

        System.out.println(stack2.printInfo());

        for (int i=0; i<5; i++)
            System.out.print(stack2.get() + " ");
        System.out.println();

        System.out.println(stack2.printInfo());

        for (int i=0; i<5; i++)
            System.out.print(stack2.get() + " ");
        System.out.println();

        System.out.println(stack2.printInfo());

    }
}

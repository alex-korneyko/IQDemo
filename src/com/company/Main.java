package com.company;

import com.company.IFaces.ICharQ;
import com.company.IQClasses.CircularQueue;
import com.company.IQClasses.DynQueue;
import com.company.IQClasses.FixedQueue;

public class Main {

    public static void main(String[] args) {
        FixedQueue q1 = new FixedQueue(10);
        CircularQueue q3 = new CircularQueue(10);
        DynQueue q2 = new DynQueue(5);

        ICharQ iQ;

        char ch;
        int i;

        iQ = q1;

        for (i=0; i<10; i++)
            iQ.put((char) ('A' + 1));

        System.out.print("Content of fixed queue: ");
        for (i=0; i<10; i++){
            ch = iQ.get();
            System.out.print(ch);
        }
        System.out.println();



    }
}

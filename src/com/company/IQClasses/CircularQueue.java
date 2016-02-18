package com.company.IQClasses;

import com.company.IFaces.ICharQ;

/**
 * Created by admin on 17.02.2016.
 */
public class CircularQueue implements ICharQ {
    private char q[];
    private int putloc, getloc;

    public CircularQueue(int size){
        q = new char[size+1];
        putloc = getloc = 0;
    }

    public void put(char ch){
        if(putloc + 1 == getloc | ((putloc == q.length-1) & (getloc == 0))){
            System.out.println("Queue is overflow");
            return;
        }

        putloc++;
        if(putloc == q.length) putloc = 0;
        q[putloc] = ch;
    }

    public char get(){
        if(getloc == putloc){
            System.out.println("Queue is empty!");
            return (char) 0;
        }

        getloc++;
        if(getloc == q.length) getloc = 0;

        return q[getloc];
    }
}

package com.company.Classes;

import com.company.IFaces.ICharQ;
import com.company.IFaces.IQueueProperties;

/**
 * Created by admin on 20.02.2016.
 */
public class StackFpFg implements ICharQ, IQueueProperties {

    private char stack[];
    private int stackSize;

    public boolean stackOverflow = false;

    public StackFpFg(int size){
        stack = new char[0];
        stackSize = size;
    }

    public void reset(){
        stack = new char[0];
        stackOverflow = false;
    }

    public void setLength(int stLength){
        stackSize = stLength;
    }

    public int getLength(){

        return stack.length;
    }

    public void put(char symb){
        if(stackSize != 0 & stack.length >= stackSize){
            stackOverflow = true;
            return;
        }

        char stack2[] = new char[stack.length + 1];
        for (int i=0; i<stack.length; i++)
            stack2[i] = stack[i];

        stack2[stack.length] = symb;
        stack = stack2;
    }

    public char get(){
        if(stack.length == 0)
            return (char) 0;

        char firstSymb = stack[0];
        char stack2[] = new char[stack.length - 1];

        for (int i=0; i<stack2.length; i++)
            stack2[i] = stack[i+1];

        stack = stack2;

        return firstSymb;
    }

}

package com.company.Classes;

import com.company.IFaces.ICharQ;
import com.company.IFaces.IQueueProperties;

/**
 * Created by admin on 20.02.2016.
 */
public class StackFpLg extends StackMain implements ICharQ, IQueueProperties {

    public StackFpLg(int size){
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

    public char get(){
        if(stack.length == 0)
            return (char) 0;

        char lastSymb = stack[stack.length-1];
        char stack2[] = new char[stack.length - 1];

        for (int i=0; i<stack2.length; i++)
            stack2[i] = stack[i];

        stack = stack2;

        return lastSymb;
    }

    public String printInfo() {
        String info = "Stack is LIFO | " + super.printInfo();
        return info;
    }
}

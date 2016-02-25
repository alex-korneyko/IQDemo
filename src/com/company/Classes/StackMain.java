package com.company.Classes;

/**
 * Created by admin on 21.02.2016.
 */
public class StackMain {

    protected char stack[];
    protected int stackSize;

    public boolean stackOverflow = false;

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

    public String printInfo(){
        String info = "Stack length: " + stack.length + " | Contains: ";
        for(int i=0; i<stack.length; i++)
            info = info + stack[i] + " ";

        return info;
    }
}

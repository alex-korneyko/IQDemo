package com.company.IFaces;

/**
 * Created by admin on 17.02.2016.
 */
public interface ICharQ {
    void put(char ch);
    char get();
    default void reset(){
        System.out.println("Reset function is not implemented!");
    }
}

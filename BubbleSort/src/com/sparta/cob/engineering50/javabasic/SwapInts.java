package com.sparta.cob.engineering50.javabasic;

public class SwapInts {
    public static Object Swap;
    private int x;
    private int y;

    public void Swap(){
        x = x - y;
        y = x + y;
        x = y - x;
    }
}

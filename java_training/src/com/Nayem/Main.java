package com.Nayem;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Bag bag = new Bag();

        int[] arr = new int[5];
        arr[2] = 777;

        System.out.println(Arrays.toString(arr));
        System.out.println("we can see, array is filled with 0, which is not initiated");
        System.out.println("but uninitiated String will be Null instead of empty String in java");

        String[] s = new String[5];
        s[2] = "Nayem";
        System.out.println(Arrays.toString(s));
    }
}
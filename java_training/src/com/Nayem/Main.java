package com.Nayem;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Bag bag = new Bag();

        int[] arr = new int[5];
        arr[4] = 559;

        for (int X: arr) {
            System.out.println(X);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int[] arr2 = {2,5,66,92};
        for (int X: arr2) {
            System.out.print(X + " ");
        }
    }
}
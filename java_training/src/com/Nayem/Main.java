package com.Nayem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Bag bag = new Bag();

        String s = "    b    ";
        System.out.println(s);
        System.out.println(s.trim());

        char s_array[] = {'a', 'b', 'c', 'd', 'e'};
        for (int i = 0; i < (int)s_array.length; i++) {
            System.out.println(s_array[i]);
        }

        String str_array[] = {"one", "two", "three"};
        for (int i = 0; i < (int)str_array.length; i++) {
            System.out.println(str_array[i]);
        }
        for (String X : str_array) {
            System.out.print(X);
        }
    }
}
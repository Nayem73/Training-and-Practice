package com.Nayem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Bag bag = new Bag();
        String s = "what";
        String c = "Not";
        s += c;

        for (int i = 0; i < (int)s.length(); i++) {
            char ch = s.charAt(i);
            System.out.println(ch);
        }
        System.out.println();
        System.out.println("Now practice List in java");

        List<Character> ls = new ArrayList<>();
        ls = List.of('c', 'd');
        for (int i = 0; i < ls.size(); i++) {
            System.out.println(ls.get(i));
        }

        System.out.println();
        System.out.println("Now practice Arraylist in java");;
        ArrayList<Character> arr = new ArrayList<>();
//        arr = Array.of('Y', 'z');
        arr.add('Y');
        arr.add('z');
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i));
            System.out.print(" ");
        }

    }
}
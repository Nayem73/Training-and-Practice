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

        System.out.println("more String training");
        System.out.println(s.concat("new"));

        System.out.println(s);


        s = s.concat(c);
        System.out.println(s);

        s = s.substring(0, 2);
        System.out.println(s);
    }
}
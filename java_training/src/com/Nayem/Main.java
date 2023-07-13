package com.Nayem;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public int var = 5;
    public static void not_static1() {
        System.out.println(var); // does not print
        //do following to print it
        Main main = new Main();
        System.out.println(main.var);
    }
    public static void main(String[] args) {
//        Bag bag = new Bag();
        //System.out.println(var);
    }

    public void not_static() {
        System.out.println(var); // it does not print anything
    }
}
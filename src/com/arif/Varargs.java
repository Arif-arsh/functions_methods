package com.arif;

import java.util.Arrays;

public class Varargs {
    public static void main(String[] args) {
        fun(1,34,45,5,4,45,3,435,45,3);
    }
    static void fun(int ...v) {
        System.out.println(Arrays.toString(v));
    }
}

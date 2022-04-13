package com.company;

import java.util.Arrays;

public class Main {

    private static final double PI = 3.1415926;
    private static final int[] ODD_NUMBERS = {1,3,5,7,9};

    public static void main(String[] args) {
        // we can print out this value
        System.out.println(PI);

        // but we're unable to reassign this value, because it is marked as final
//        PI = 3.14;

        // Same with the final object
//        System.out.println(Arrays.toString(oddNumbers));

        // we can't reassign variable but,...
//        ODD_NUMBERS = {2,4,6,8,10};

        // we can change individual elements within it.
//        ODD_NUMBERS[0] = 2;
//        ODD_NUMBERS[1] = 4;
//        ODD_NUMBERS[2] = 6;
//        ODD_NUMBERS[3] = 8;
//        ODD_NUMBERS[4] = 10;
//        System.out.println(Arrays.toString(ODD_NUMBERS));
    }
}

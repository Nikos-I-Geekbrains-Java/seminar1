package org.geekbrains;

import java.util.Arrays;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {

//        int[] nums1 = {1,2,3,0,0,0};
//        int[] nums2 = {2,5,6};
//        int m = 3;
//        int n = 3;
        int[] nums1 = {2,0};
        int[] nums2 = {1};
        int m = 1;
        int n = 1;
        Hw1 Mrg = new Hw1();
        Mrg.merge(nums1, m, nums2, n);
        out.println(Arrays.toString(nums1));

// ДЗ2
        int[] srcArray = {0,2,1,5,3,4};
        Hw2 bld = new Hw2();
        int[] dstArray = bld.buildArray(srcArray);
        out.println(Arrays.toString(srcArray));
        out.println(Arrays.toString(dstArray));

// ДЗ3
//        int[] rmvArray = {3,2,2,3};
        int[] rmvArray = {0,1,2,2,3,0,4,2};

//        int val = 3;
        int val = 2;
        int retVal = 0;
        Hw3 rmv = new Hw3();
        out.println(Arrays.toString(rmvArray));
        retVal = rmv.removeElement(rmvArray, val);
        out.printf("%d %s\n", retVal, Arrays.toString(rmvArray));

// ДЗ4
        Hw4 rw = new Hw4();
//        String srcS = "the sky is blue";
//        String srcS = "  hello world  ";
//
//        out.println(srcS);
//        srcS = rw.reverseWords(srcS);
//        out.println(srcS);

    }
}

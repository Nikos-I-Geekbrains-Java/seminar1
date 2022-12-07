package org.geekbrains;

class Hw1 {
    public void merge2(int[] nums1, int m, int[] nums2, int n) {
        if (nums1 == null || nums1.length == 0 || nums2 == null || nums2.length == 0) {
            return;
        }
        int last = (m--) + (n--) - 1;
        while (n >= 0) {
            if (m >= 0 && nums1[m] > nums2[n]) {
                nums1[last--] = nums1[m--];
            } else {
                nums1[last--] = nums2[n--];
            }
        }
    }

//    public void merge3(int[] nums1, int m, int[] nums2, int n) {
//        if (n == 0) return; // Особые случаи: 1. Нечего брать из 2 массива
//        if (m == 0){        // 2. копируем 2-й массив в 1-й
//            for (int i = 0; i < n; i++) {
//                nums1[i]=nums2[i];
//            }
//            return;
//        }
//        int len = (m--)+(n--); // +
//        while (n >= 0) {
//            nums1[--len] = nums1[m] >= nums2[n] ? nums1[m--] : nums2[n--];
//        }
//    }
}
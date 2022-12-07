package org.geekbrains;

class Hw1 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
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
}
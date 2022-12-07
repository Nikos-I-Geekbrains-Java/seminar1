package org.geekbrains;

public class Hw3 {
    public int removeElement(int[] nums, int val) {
        if(nums == null || nums.length == 0)  return 0;
        int i = 0; // счетчик не val
        int j = 0; // указатель на элемент массива

        while(j < nums.length) {
            while(j < nums.length && nums[j] == val) { // ищем индекс не val
                j++;
            };
            if(j < nums.length) {
                nums[i] = nums[j]; // gbitb на место val
                i++; // двигаемся дальше
                j++; // -//-
            }
        }

        return i; // Последнее значение = кол не val

    }
}

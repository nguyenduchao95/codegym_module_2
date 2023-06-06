package b8;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {1,3,4};
        int[] arr2 = {5,6,7};
        int[] newArr = mergeArr(arr1, arr2);
        System.out.println("Mảng thứ 1: " + Arrays.toString(arr1));
        System.out.println("Mảng thứ 2: " + Arrays.toString(arr2));
        System.out.println("Mảng sau gộp: " + Arrays.toString(newArr));
    }
    public static int[] mergeArr(int[] arr1, int[] arr2) {
        int[] newArr = new int[arr1.length + arr2.length];
        for (int i = 0; i < newArr.length; i++) {
            if (i < arr1.length) newArr[i] = arr1[i];
            else newArr[i] = arr2[i - arr1.length];
        }
        return newArr;
    }
}

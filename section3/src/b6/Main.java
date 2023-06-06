package b6;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {3,2,5,7,9,1,3,4};
        System.out.println("Nhập vị trí muốn xóa: ");
        int index = sc.nextInt();
        int[] newArr = removeValue(arr, index);
        System.out.println("Mảng ban đầu:" + Arrays.toString(arr));
        System.out.println("Mảng sau xóa:" + Arrays.toString(newArr));
    }

    public static int[] removeValue(int[] arr, int index){
        if(index < 0 || index >= arr.length) return arr;
        int[] newArr = new int[arr.length-1];
        for(int i = 0; i < newArr.length; i++){
            if(i < index) newArr[i] = arr[i];
            else newArr[i] = arr[i+1];
        }
        return newArr;
    }
}

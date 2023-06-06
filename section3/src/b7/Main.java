package b7;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {3,2,5,7,9,1,3,4};
        System.out.println("Nhập số muốn thêm: ");
        int newValue = sc.nextInt();
        System.out.println("Nhập vị trí muốn thêm: ");
        int index = sc.nextInt();
        int[] newArr = insertValue(arr, newValue, index);
        System.out.println("Mảng ban đầu:" + Arrays.toString(arr));
        System.out.println("Mảng sau thêm:" + Arrays.toString(newArr));
    }

    public static int[] insertValue(int[] arr, int newValue, int index){
        if(index < 0 || index > arr.length) return arr;
        int[] newArr = new int[arr.length+1];
        newArr[index] = newValue;
        for(int i = 0; i<newArr.length; i++){
            if(i < index) newArr[i] = arr[i];
            else if(i > index) newArr[i] = arr[i-1];
        }
        return newArr;
    }
}

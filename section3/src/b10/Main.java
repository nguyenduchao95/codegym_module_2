package b10;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 1, 7};
        int min = findMin(arr);
        System.out.println("Min = " + min);
    }

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i : arr) {
            if (i < min) min = i;
        }
        return min;
    }
}

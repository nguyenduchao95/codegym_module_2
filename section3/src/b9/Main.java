package b9;

public class Main {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,10,6},
                {7,8,9}
        };
        int max = findMax(arr);
        System.out.println("Max = " + max);
    }
    public static int findMax(int[][] arr){
        int max = arr[0][0];
        for(int[] i : arr){
            for(int j : i){
                if(j > max) max = j;
            }
        }
        return max;
    }
}

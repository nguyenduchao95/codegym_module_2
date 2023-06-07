package b14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String str = "The length() method returns the length of a specified string";
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập ký tự muốn tìm kiếm: ");
        String key = sc.nextLine();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (String.valueOf(str.charAt(i)).equals(key)) {
                count++;
            }
        }
        System.out.printf("số lần xuất hiện của '%s' trong chuỗi là: %d", key, count);
    }
}

package b9;

import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        int rate = 23000;
        double vnd, usd;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số USD: ");
        usd = sc.nextDouble();
        vnd = rate * usd;
        System.out.printf("%-5s --> %s", "USD", "VND\n");
        System.out.printf("%-5.2f  %.2f", usd, vnd);
    }
}

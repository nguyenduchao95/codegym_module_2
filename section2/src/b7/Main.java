package b7;

import static b6.Main.isPrime;

public class Main {
    public static void main(String[] args) {
        for(int i = 0; i <= 100 ; i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }
}

package coreJava;

import java.util.*;

public class PowerRecurssion {
    static int PowerOfNumber(int num, int pow){
        if(pow < 1){
            return 1;
        } else {
            return num * PowerOfNumber(num,pow-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Number = sc.nextInt();
        int power = sc.nextInt();
        int result = PowerOfNumber(Number,power);
        System.out.println(result);
    }
}

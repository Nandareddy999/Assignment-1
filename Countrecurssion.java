package coreJava;

import java.util.*;

public class Countrecurssion {
    public static void CountNumber(int num){
        if(num == 0){
            return;
        }
        System.out.println(num);
        CountNumber(num-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        CountNumber(number);
    }
}

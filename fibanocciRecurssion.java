package coreJava;

import java.util.Scanner;

public class fibanocciRecurssion {
    public static int Fibanocci(int n){
        if(n <= 1){
            return n;
        }
        return Fibanocci(n-1) + Fibanocci(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = Fibanocci(num);
        System.out.println(result);
    }
}

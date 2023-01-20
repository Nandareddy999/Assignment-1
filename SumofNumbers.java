package coreJava;

import java.util.Scanner;

public class SumofNumbers {
    static int Sumofnumber(int n){
        if(n <= 1){
            return n;
        }
        return n + Sumofnumber(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(Sumofnumber(num));
    }
}

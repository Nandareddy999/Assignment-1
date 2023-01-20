package coreJava;

import java.util.Scanner;

public class fibanocciForloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int a = 0;
        int b = 1;
        for(int i = 2; i < num; i++){
            int temp = a+b;
            a = b;
            b = temp;
        }
        System.out.println(b);
    }
}

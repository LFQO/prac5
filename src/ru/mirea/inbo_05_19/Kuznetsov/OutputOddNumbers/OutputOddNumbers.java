package ru.mirea.inbo_05_19.Kuznetsov.OutputOddNumbers;

import java.util.Scanner;

public class OutputOddNumbers {
    public static void Solution(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n%2==1) {
            System.out.print("-----"+n+"\n");
            Solution();
        }
        else if(n!=0) Solution();
    }
    public static void main(String args[]){
        Solution();
    }
}

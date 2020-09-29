package ru.mirea.inbo_05_19.Kuznetsov.NumberOfUnits;

import java.util.Scanner;

public class NumberOfUnits {
    public static int Solution(int c){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n==0) {
            int m=in.nextInt();
            if(m==0) return c;
            else if (m==1) return Solution(c+1);
        }
        else if (n==1) return Solution(c+1);
        return Solution(c);
    }
    public static void main (String args[]){
        System.out.println(Solution(0));
    }
}

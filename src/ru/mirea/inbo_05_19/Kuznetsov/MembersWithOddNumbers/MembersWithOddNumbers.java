package ru.mirea.inbo_05_19.Kuznetsov.MembersWithOddNumbers;

import java.util.Scanner;

public class MembersWithOddNumbers {
    public static void Solution(int c){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(c%2==1) {
            if (n != 0) {
                System.out.println("----" + n);
                Solution(c + 1);
            }
        }
        else if (n!=0) Solution(c+1);
    }
    public static void main(String args[]){
        Solution(1);
    }
}

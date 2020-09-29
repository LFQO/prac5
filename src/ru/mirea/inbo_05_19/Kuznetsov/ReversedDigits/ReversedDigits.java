package ru.mirea.inbo_05_19.Kuznetsov.ReversedDigits;

public class ReversedDigits {
    public static void Solution(int n){
        if(n!=0){
            int tmp=n%10;
            System.out.print(tmp+" ");
            Solution(n/=10);
        }
    }
    public static void main(String args[]){
        Solution(1234567890);
    }
}

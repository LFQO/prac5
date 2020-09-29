package ru.mirea.inbo_05_19.Kuznetsov.SeparatedDigits;

public class SeparatedDigits {
    public static void Solution(int n){
        if(n!=0){
            int tmp=n;
            n=n/10;
            Solution(n);
            tmp=tmp-n*10;
            System.out.print(tmp+" ");
        }
    }
    public static void main(String args[]){
        Solution(1234567890);
    }
}

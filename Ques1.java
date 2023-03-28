//Q1. Given an integer m, n, and n integers, return true if the number of unique integers among the n integers is
//greater than or equal to m, else return false.(Integers appearing multiple times are all considered as 1 unique
//integer)
//Input:
//5
//10
//1 2 1 4 5 2 1 1 2 2
//Expected Output:
//false


import java.util.Scanner;

public class Ques1 {
    static void uniqueIntegers(int[] arr,int m){
        int count=0;
        int[] freq=new int[100001];
        for(int i=0;i< arr.length;i++){
            freq[arr[i]]++;
        }
        for(int i=0;i< freq.length;i++) {
            if(freq[i]==1){
                count++;
            }
        }
        if(count>=m){
            System.out.println("Expected output: True");
        }
        else {
            System.out.println("Expected output: False");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to be compared:");
        int m=sc.nextInt();
        System.out.println("Enter the size of the array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        uniqueIntegers(arr,m);
    }
}

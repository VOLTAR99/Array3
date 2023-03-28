import java.util.Scanner;

public class Ques4 {
    static void pair(int[] arr,int n,int t){
        for(int i=1;i<n+1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==t){
                    System.out.println(i+" "+j);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=sc.nextInt();
        int[] arr=new int[n+1];
        System.out.println("Enter the elements:");
        for(int i=1;i<n+1;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the target number:");
        int t=sc.nextInt();
        pair(arr,n,t);
    }
}

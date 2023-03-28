import java.util.Scanner;

public class Ques5 {
    static void print(int[] arr){
        for (int j : arr) {
            System.out.println(j);
        }
    }
    static void swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    static void reverse(int[] arr){
        int i=0,j= arr.length-1;
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }
    static int[] squares(int[] arr,int n){
        int[] ans=new int[n];
        int i=0,j=n-1,k=0;
        while(i<=j){
            if (Math.abs(arr[i])>Math.abs(arr[j])){
                ans[k++]=arr[i]*arr[i];
                i++;
            }
            else {
                ans[k++]=arr[j]*arr[j];
                j--;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of the array:");
    int n=sc.nextInt();
    int[] arr=new int[n];
    System.out.println("Enter the elements:");
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
        }
        int[] ans=squares(arr,n);
        reverse(ans);
        print(ans);
   }
}

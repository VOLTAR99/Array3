import java.util.Scanner;

public class Ques3 {
    public static int getLargest(int[] a, int total){
        int temp;
        for (int i = 0; i < total; i++)
        {
            for (int j = i + 1; j < total; j++)
            {
                if (a[i] > a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a[total-1];
    }
    static void HeightCheck(int[] arr,int n){
        int[] area=new int[n*n];
        int count=0;
        for(int i=0;i<n;i++){
            for (int j=0;j<n-1;j++){
                if(arr[i]<=arr[j]){
                    area[count++]=arr[i]*Math.abs(j-i);
                }
                else{
                    area[count++]=arr[j]*Math.abs(i-j);

                }
            }
        }
        System.out.println(getLargest(area, area.length));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the heights:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        HeightCheck(arr,n);
    }
}

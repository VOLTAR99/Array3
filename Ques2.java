import java.util.Scanner;
public class Ques2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out. println("Enter the length of the array: ");
        int n = scn.nextInt();
        int[] arr = new int[n];
        System.out. println("Enter the elements of the array: ");
        for(int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }
        int odd = 0, even = 0, sum = 0;
        for (int i : arr) {
            if (i % 2 == 1) {
                int temp = odd;
                odd = even;
                even = temp;
                odd++;
            }
            else{
                even++;
            }
            sum += odd;
        }
        System.out.println(sum);
    }
}
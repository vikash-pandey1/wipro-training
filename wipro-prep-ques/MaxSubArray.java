import java.util.Scanner;


public class MaxSubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int maxSum = Integer.MIN_VALUE;
        int curSum = 0;
        
        for(int num:arr){
            curSum = Math.max(num,maxSum+num);
            maxSum= Math.max(maxSum,curSum);
        }
        System.out.println(maxSum);
        sc.close();
    }
}

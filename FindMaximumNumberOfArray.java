import java.util.Scanner;

public class FindMaximumNumberOfArray {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int arr[]={2,3,0,8,7,1,2};
        int max=-1;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}

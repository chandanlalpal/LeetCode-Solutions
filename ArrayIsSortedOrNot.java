import java.util.Scanner;

public class ArrayIsSortedOrNot {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int arr[]={2,1,6,7,8,9,23};

        for(int i=0;i<arr.length-1;i++){

            if(arr[i]>arr[i+1]){
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");

    }
}

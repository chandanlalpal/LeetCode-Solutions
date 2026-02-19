import java.util.Scanner;

public class FindMinimuValue {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int arr[]={2,3,4,5,8,9,10};
        int min=Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(min);
    }
}

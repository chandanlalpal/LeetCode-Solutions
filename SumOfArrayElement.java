import java.util.Scanner;

public class SumOfArrayElement {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int arr[]=new int[5];

        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }

        int sum=0;
        for(int it:arr){
            sum=sum+it;
        }

        System.out.println(sum);

//        for(int it:arr){
//            System.out.print(it+" ");
//        }

    }
}

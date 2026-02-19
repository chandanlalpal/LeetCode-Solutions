import java.util.Scanner;
public class TakeInputIntoArray {
    public static  void main (String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int size=sc.nextInt();//6//7

        //create array of n size
        int arr[]=new int[size];

        //put value into the Array
        for(int i=0;i<size;i++){
            System.out.println("Enter the value");
            arr[i]=sc.nextInt();
        }

        //print

        //for each loop
        for(int it:arr){
            System.out.print(it+" ");
        }
    }
}

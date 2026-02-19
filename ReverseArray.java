import java.util.Scanner;
public class ReverseArray {
    public static void main(String args[]){
       Scanner sc=new Scanner (System.in);

//       int arr[]=new int[6];//declare
               // 0 1 2 3 4 5 6
       int arr[]={2,4,5,6,7,4,3};//declare+initalization
               //       i
               //       j


        //3,4,7,6,5,4,2

        //two point i and j

        int i=0;
        int j=arr.length-1;//6
        while(i<j){

            int temp=arr[i];//2
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }

        //for each loop

        for(int it:arr){
            System.out.print(it+" ");
        }


    }

}

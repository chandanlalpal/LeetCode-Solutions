import java.util.Scanner;
public class makeTable{
    public static void main(String args[]){
        //object

        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        for(int i=1;i<=10;i++){

            // 2 X 2 = 4

            System.out.println(n+" X "+i+" = "+ n*i);
            //2*1 2*2-----2*10

        }


    }
}
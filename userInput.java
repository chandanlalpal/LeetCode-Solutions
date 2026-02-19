import java.util.Scanner;
public class userInput{
    public static void main(String args[]){

   Scanner sc=new Scanner(System.in);

   System.out.println("Enter Your Name:");
   String name=sc.nextLine();

   System.out.println("Enter Your age:");
   int age=sc.nextInt();

   System.out.println("Enter your marks:");
   Double marks=sc.nextDouble();

   System.out.println(name+" "+age+" "+marks);



    }
}
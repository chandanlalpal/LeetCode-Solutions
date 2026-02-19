import java.util.Scanner;

public class ConvertLowercaseToUppercase {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

     String str="defghijklm";

     String str2="";
//
//     str2=str2+'c';
//     str2=str2+'g';
//     str2+='c';
//     str2+='g';
        //(char)('a'-32)97-32=65---A B C D---
        //'b'-32
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            char s1=(char)(ch-32);//A
            str2+=s1;
        }
        System.out.println(str2);
//     System.out.println(str2);
    }
}

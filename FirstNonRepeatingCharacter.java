import java.util.Scanner;
public class FirstNonRepeatingCharacter {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        String str="cariscontriola";

        int freq[]=new int[26];
        //insert freq
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            freq[ch-'a']++;
            //99-97=2 freq[2]++;
//            0 1 2
//            a b c
            //0 0 2
        }
        //for each loop
//        for(int it:freq){
//            System.out.print(it+" ");
//        }
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            //99-97=2
            if(freq[ch-'a']==1){
                System.out.println(ch);
                return;
            }
                //
        }



    }
}

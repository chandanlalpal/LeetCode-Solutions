import java.util.Scanner;
public class FindFrequency {

    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        String str="abbbccafdgfdhfgfhdfgdsht";
        //a -> 2
        //b -> 3
        //c -> 2

        //loop
        //array 26 size
        int freq[]=new int[26];
        // str.charAt(i);
        // 'a'-'a'=0
        //'c'-'a'=98-97=2
        //freq['c'-'a']++=====freq[2];
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            freq[ch-'a']++;
        }

        //a -> 2
        //b -> 3
        //c -> 2
        //0+'a'===(char)0+97 ===a
        //freq  or agar uska value agar zero se bada atta he to print karna he varna skip


        for(int j=0;j<freq.length;j++){

            if(freq[j]>0){
                System.out.println((char)(j+'a') + "->"+freq[j]);
            }
        }

    }
}

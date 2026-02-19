public class Palindrome {
    public static void main(String args[]){

        String strs="122";

        int i=0;
        int j=strs.length()-1;

        while(i<j){
            //R                  !=R
            if(strs.charAt(i)!=strs.charAt(j)){
                System.out.println("not plindrome");
                return;
            }
            else{
                i++;
                j--;
            }
        }
        System.out.println("Palidrome");
    }
}

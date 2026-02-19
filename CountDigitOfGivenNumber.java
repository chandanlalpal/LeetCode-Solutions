public class CountDigitOfGivenNumber {

    public static void main (String args[]){

        long n=123454654684651846l;

        int count=0;

        while(n>0){
            count++;
          n=n/10;  //12345  n= 1234

        }

        System.out.println(count);
    }
}

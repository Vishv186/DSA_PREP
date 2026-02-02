package Learn_the_Basics.Know_Basic_Maths;


/*
Algorithm 

- Initialise a counter(cnt) to count the number of digits.
- While n is greater than o, increment counter by 1 and Update N by removing its last digit by performing a 
  modulo 10 (%10) operation on it.
- After exiting the while loop, we return the counter as the number of digits.
*/


public class CountDigits {

    public static int countDigits(int n){
        
        // Initialize a counter(cnt) to count number of last digit.
        int cnt = 0;

        // While loop iterates until n becomes 0
        while(n > 0) {
            //Increment the counter for each digit encountered
            cnt = cnt + 1;
            //Divide n by 10 to remove(extract) the last digit
            n = n / 10; 
        }
        // Return the count of digits=
        return cnt;

    }

    public static void main(String[] args) { 
        int n = 934237989;
        System.out.println("There are " + countDigits(n) + " digits in " + n);
    }

}

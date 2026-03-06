package Learn_the_Basics.Know_Basic_Maths;

/*
Algorithm

-Initialize a variable to store the reversed number as 0.
-Loop while the original number is greater than 0.
-Extract the last digit by performing modulo 10.
-Multiply the reversed number by 10 and add the extracted digit.
-Remove the last digit from the original number using integer division by 10.
-Continue this process until the original number becomes 0.
-Return the reversed number.

*/

public class ReverseNumber {
    public static int reverseNum(int n) {
        int revNum = 0;

        while(n>0){
            int lastDigit = n % 10;
            revNum = revNum * 10 + lastDigit;
            n = n / 10;
        }
        return revNum;
    }

    public static void main(String[] args) {
        int n = 123;
        System.out.println(reverseNum(n));
    }
}

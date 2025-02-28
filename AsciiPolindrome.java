import java.util.Scanner;
class AsciiPolindrome
{
    public static void main(String[] args) 
	{
     Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character:");
        char ch= sc.next().charAt(0);
		int n = ch;
       int asciiValue = ch;
        System.out.println("ASCII value: " + asciiValue);
        int reverse = 0;
        int n = num;
        while (num != 0) {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num /= 10;
}
if (n=rev) {
            System.out.println(asciiValue + " is a palindrome.");
        } else {
            System.out.println(asciiValue + " is not a palindrome.");
        }
    }
}
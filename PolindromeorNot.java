import java.util.Scanner;
class PolindromeorNot
{
	public static void main(String[]args)
	{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the Number");
	int num=sc.nextInt();
	int n=num;
	int rev=0;
	while(num!=0)
		{
		int rem=num%10;
		rev=rev*10+rem;
		num=num/10;
		}
		if(n==rev)
	   {
	System.out.println("It is Polindrome");
        }
		else
		{
	System.out.println("It is not Polindrome");
	}
  }
}

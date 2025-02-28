import java.util.Scanner;
class SpyNum
{
	public static void main(String[]args)
	{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the Number");
	int num=sc.nextInt();
	int sum=0;
	int product=1;
	while(num!=0)
		{
		int rem=num%10;
		sum+=rem;
		product*=rem;
		num=num/10;
		}
		if(sum==product)
	   {
	System.out.println("It is a Spy Number");
        }
		else
		{
	System.out.println("It is not a Spy Number");
	}
  }
}

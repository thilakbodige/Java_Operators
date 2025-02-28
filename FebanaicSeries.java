import java.util.Scanner;
class FebanaicSeries
{
	public static void main(String[]args)
	{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the Number");
	int n=sc.nextInt();
	int a=0;
	int b=1;
	int c=a+b;
	System.out.println(a);
	System.out.println(b);
	while(c<=n)
	{
		System.out.println(c);
		a=b;
		b=c;
		c=a+b;
}
	}
}
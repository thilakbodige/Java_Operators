import java.util.Scanner;
class ProductofFactors
{
public static void main(String[] args) 
	{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the Number");
int num=sc.nextInt();
int product=1;
for(int i=1;i<=num;i++)
{
if(num%i==0)
{
product = product * i;
}
}
System.out.println(product);
	}
}
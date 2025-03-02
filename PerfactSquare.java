import java.util.Scanner;
class PerfactSquare
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Number");
int num=sc.nextInt();
for(int i=1;i<=num;i++)
{
if(num==i*i)
{
	System.out.println("Perfact Square");
}
}
}
}
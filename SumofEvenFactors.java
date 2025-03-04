import java.util.Scanner;
class SumofEvenFactors
{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Number");
	int num = sc.nextInt();
	int sum = 0;
	    {
	for(int i=1;i<=num;i++)	
		{
	if (num%i==0&&i%2==0)
		{
	    sum+=i;
		}
        }
System.out.println("The sum of even factors of "+num+"  is "+sum);
}
}
	}
	
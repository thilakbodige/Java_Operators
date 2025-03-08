import java.util.Scanner;
class  User_Data1
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the 1 Numbers");
		int num1 =sc.nextInt();
		System.out.println("Enter the 2 Numbers");
		int num2 =sc.nextInt();
		if(num1>num2)
		{
		System.out.println(num1);
		}
		else
		{
		System.out.println(num2);
	}
	}
}

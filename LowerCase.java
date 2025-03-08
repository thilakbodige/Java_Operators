import java.util.Scanner;
class LowerCase 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Character");
		char ch = sc.next().charAt(0);
		char result = (char)(ch-32);
		System.out.println(result);
	}
}

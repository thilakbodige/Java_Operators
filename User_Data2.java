import java.util.Scanner;
class  User_Data2
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Mobile Number");
		long mobileNumber = sc.nextLong();
		System.out.println("Enter Age");
		int age = sc.nextInt();
		System.out.println("Enter the Blood Type");
		String Bloodtype =sc.next();
		System.out.println("Enter the Height");
		double height = sc.nextDouble();
		System.out.println("Enter the Name");
			String name = sc.next();
		
	    System.out.println(mobileNumber);
		System.out.println(age);
		System.out.println(Bloodtype);
		System.out.println(height);
		System.out.println(name);
		
	}
}

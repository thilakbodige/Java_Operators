import java.util.Scanner;
class User_Data3 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String user= "Thilak";
		String pwd="Thilak@123";
		System.out.println("Enter the Username");
		String userid = sc.next();
		System.out.println("Enter your Password");
		String password = sc.next();
		if(userid==user&&password==pwd)
		{
			System.out.println("Login Failed");
		}
		 else
		{
		System.out.println("Sucessfully Login");
	    }
	}
}

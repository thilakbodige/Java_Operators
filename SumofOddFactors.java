class SumofOddFactors 
{
    public static void main(String[] args){
    int num = 60;
	int sum = 0;
	System.out.println("Enter Odd Factors");	
   for(int i=1;i<=num;i++)
	   {
	if (num%i==0)
	   {
		if(i%2!=0)
		   {
			System.out.println(i);
			sum+=i;
		   }
	   }
   }
System.out.println("Sum of Odd Factors of "+num+" is "+sum); 
}
}


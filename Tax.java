import java.util.Scanner;
class Tax
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Salary ");
		int num = sc.nextInt();
		if(num>=30000 && num<60000)
		{
			double a = 0.06;
			double b = num*a;
			System.out.println("The tax will be "+b);
		}
		
		else if(num>=60000 && num<100000)
		{
			double a = 0.16;
			double b = num*a;
			System.out.println("The tax will be "+b);
		}
		
		else if(num>=100000)
		{
			double a = 0.25;
			double b = num*a;
			System.out.println("The tax will be "+b);
		}
		
		else
		{
			System.out.println("NO NEED TO PAY");
		}
	}	
}
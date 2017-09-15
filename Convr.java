import java.util.Scanner;
class Convr
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("PLESE CHOOSE YOUR OPTION:");
		System.out.println("");
		System.out.println("For Celsius to Fahrenheit press A");
		System.out.println("For Fahrenheit to Celsius press B");
		String num = sc.nextLine();
		
		
		
		switch(num)
		{
			case "A":
			{
				System.out.println("Please enter Celsius value ");
				double num1 = sc.nextDouble();
				double a = 1.8;
				int b = 32;
				double ans = num1*a+b;
				System.out.println("Your answer is "+ans);
				break;
			}
			case "B":
			{
				System.out.println("Please enter Fahrenheit value ");
				double num1 = sc.nextDouble();
				int a = 32;
				double b = 0.5556;
				double ans = (num1-a)*b;
				System.out.println("Your answer is "+ans);
				break;
			}
			default:
			{
				System.out.println("PLEASE ENTER RIGHT OPTION");
			}
		}
	}
}
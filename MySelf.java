import java.util.Scanner;
class MySelf
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name ");
		String name = sc.nextLine();
		
		System.out.println("Enter your weight ");
		double weight = sc.nextDouble();
		
		System.out.println("Enter your age ");
		int age = sc.nextInt();
		
		
		System.out.println("My Self:-");
		System.out.println("My name is "+name);
		System.out.println("My weight is "+weight);
		System.out.println("My age is "+age);
	}
}
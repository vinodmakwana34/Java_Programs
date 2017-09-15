import java.util.Scanner;
class EvenOdd
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Even odd checker:");
		System.out.println("enter a no.");
		int num = sc.nextInt();
		if(num%2==0)
		{
			System.out.println("No. is Even");
		}
		else
		{
			System.out.println("No. is Odd");
		}
	}
}
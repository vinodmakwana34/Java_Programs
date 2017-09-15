import java.util.Scanner;
class MulIf
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no.");
		int num = sc.nextInt();
		if (num<100 && num>=60)
		{
			System.out.println("1st Division");
		}
		else if (num<60 && num>=30)
		{
			System.out.println("2nd Division");
		}
		else if (num<30)
		{
			System.out.println("Fail");
		}
	}
}
import java.util.Scanner;
class Switch
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a no.");
		int num = sc.nextInt();
		switch(num)
		{
			case 1:
			{
				System.out.println("This is case 1");
				break;
			}
			
			case 2:
			{
				System.out.println("This is case 2");
				break;
			}
			case 3:
			{
				System.out.println("This is case 3");
				break;
			}
			default:
			{
				System.out.println("This is default case");
				break;
			}
		}
	}
}
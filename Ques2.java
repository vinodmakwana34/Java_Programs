import java.util.Scanner;
class Ques2
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<=5;i++)
		{
			sc.nextLine();
			System.out.println("enter your name ");
			String name = sc.nextLine();
			System.out.println("enter your age");
			int age = sc.nextInt();
		}
		System.out.println("enter your name "+name);
	    System.out.println("enter your age "+age);
		
	}
}
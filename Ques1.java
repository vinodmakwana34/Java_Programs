import java.util.Scanner;
class Ques1
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<=10;i++)
		{
			sc.nextLine();
			String name = sc.nextLine();
			int age = sc.nextInt();
			if(age<18)
			{
				System.out.println("not eligible");
			}
			else
			{
				System.out.println("eligible");
			}
		}
	}
}
import java.util.Scanner;
class Cal
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice:");
		int num = sc.nextInt();
		
		switch(num)
		{
			case 1:
			{
				System.out.println("Enter a no.");
			    int num1 = sc.nextInt();
			    System.out.println("Enter a no.");
			    int num2 = sc.nextInt();
			    int sum = num1+num2;
			    System.out.println("Result is "+sum);
			    break;
			}
			case 2:
			{
				System.out.println("Enter a no.");
			    int num1 = sc.nextInt();
			    System.out.println("Enter a no.");
			    int num2 = sc.nextInt();
			    int sum = num1-num2;
			    System.out.println("Result is "+sum);
			    break;
			}
			case 3:
			{
				System.out.println("Enter a no.");
			    int num1 = sc.nextInt();
			    System.out.println("Enter a no.");
			    int num2 = sc.nextInt();
			    int sum = num1*num2;
			    System.out.println("Result is "+sum);
			    break;
			}
			case 4:
			{
				System.out.println("Enter a no.");
			    int num1 = sc.nextInt();
			    System.out.println("Enter a no.");
			    int num2 = sc.nextInt();
			    int sum = num1/num2;
			    System.out.println("Result is "+sum);
			    break;
			}  
			default:
			{
				System.out.println("wrong choice");
			}
		}
		
	}
}
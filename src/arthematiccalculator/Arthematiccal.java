package arthematiccalculator;
import java.util.Scanner;

public class Arthematiccal {


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Choose a number 1 for addition 2 for subtraction 3 for mul and 4 for div");
		int choose=sc.nextInt();
		
		if(choose==1) {
			System.out.println("Enter a number");
			int a=sc.nextInt();
			System.out.println("Enter another number");
			int b=sc.nextInt();
			System.out.println("Answer is "+add(a,b));
		}
		else if(choose==2) {
			System.out.println("Enter a number");
			int a=sc.nextInt();
			System.out.println("Enter another number");
			int b=sc.nextInt();
			System.out.println("Answer is "+sub(a,b));
		}
		else if(choose==3) {
			System.out.println("Enter a number");
			int a=sc.nextInt();
			System.out.println("Enter another number");
			int b=sc.nextInt();
			System.out.println("Answer is "+mul(a,b));
		}
		else if(choose==4) {
			System.out.println("Enter a number");
			int a=sc.nextInt();
			System.out.println("Enter another number");
			int b=sc.nextInt();
			System.out.println("Answer is "+div(a,b));
		}else {
			System.out.println("choose 1 or 2 or 3 or 4");
		}
		
		
	}
	public static int add(int a, int b) {
		int n;
		n=a+b;
		return n;
		
	}
    public static int sub(int a, int b) {
    	int n;
    	n=a-b;
    	return n;
		
	}
    public static int mul(int a,int b) {
    	int n;
    	n=a*b;
    	return n;
		
	}
    public static int div(int a, int b) {
    	int n;
    	n=a/b;
    	return n;
		
	}



}

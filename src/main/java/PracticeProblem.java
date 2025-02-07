import java.util.Scanner;

public class PracticeProblem {
	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
	}

	public static void q1() {
		Scanner scan = new Scanner(System.in);
		System.out.print("In: ");
		String result = scan.nextLine();
		System.out.println(result);
		
	}

	public static void q2() {
		Scanner scan = new Scanner(System.in);
		System.out.print("In: ");
		int num1 = scan.nextInt();
		System.out.print("In: ");
		int num2 = scan.nextInt();
		System.out.println(num1 / num2);
		System.out.println(num1 % num2);
		
	}

	public static void q3() {
		Scanner scan = new Scanner(System.in);
		System.out.print("In: ");
		String s = scan.nextLine();
		System.out.println(s + " was the text you wrote");
		
	}

	public static void q4() {
		Scanner scan = new Scanner(System.in);
		System.out.print("In: ");
		int num = scan.nextInt();
		System.out.println(num * 5);
		
	}

	public static void q5() {
		Scanner scan = new Scanner(System.in);
		System.out.print("In: ");
		boolean b = scan.nextBoolean();
		System.out.println(b + " is a boolean");
		
	}

	public static void q6() {
		Scanner scan = new Scanner(System.in);
		System.out.print("In: ");
		double d = scan.nextDouble();
		System.out.println(d - 3.2);
		
	}

}

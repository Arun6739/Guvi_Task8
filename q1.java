package javaPractice;
import java.util.Scanner;
class q1 {
	public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        	System.out.println("Enter the value of 'a'");
			int a= num.nextInt();
			System.out.println("Enter the value of 'b'");
			int b= num.nextInt();
			System.out.println("Enter the value of 'c'");
			int c= num.nextInt();
			System.out.println("Enter the value of 'd'");
			int d= num.nextInt();
			
			if((a+b)>(c+d)){
				System.out.println("the sum of a+b is greater than the sum of c+d");
			}
			else if ((c+d)>(a+b)) {
				System.out.println("the sum of c+d is greater than the sum of a+b");
			}
			else {
				System.out.println("the sum of a+b and the sum of c+d are equal");
			}
		
	}
}
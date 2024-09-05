/*




*/

package javaPractice;
import java.util.Scanner;
  class Task4{
	  public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.println("Enetr a number");
		int a=num.nextInt();
		int i;
		int fact=1;
      for(i=1;i<=a;i++)
      {
    	fact=fact*i;
      }
      System.out.println("factorial of"  +a+  "is"  +fact);
	  num.close();
	  }
}
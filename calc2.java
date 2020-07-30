package calc;

import java.util.*;

public class calc2 {
	public static void main(String[] args) {
		int n1,n2,n3,result;
		System.out.println("Enter the given numbers for the addition");
		Scanner Add = new Scanner(System.in);
		n1= Add.nextInt();
		n2= Add.nextInt();
		n3= Add.nextInt();
		result=n1+n2+n3;
		System.out.printf("the value is %d",result).println();
		System.out.printf(" %d+%d+%d=%d",n1,n2,n3,result).println();
		
			
		
	}

}

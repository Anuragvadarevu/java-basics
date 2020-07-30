package compare1;

import java.util.Scanner;

public class compareclass {
	public static void main(String[] args) {
		int a,b,c,d,cal,cal1;
		System.out.println("enter values");
		Scanner S = new Scanner(System.in);
		a= S.nextInt();
		b= S.nextInt();
		c= S.nextInt();
		d= S.nextInt();
		cal=a+b;
		cal1= c+d;
		if(cal>cal1) {
			System.out.println("a+b: "+cal+ "is greater than b+c " +cal1);
			if(cal<cal1) {
				System.out.println("a+b is not greater than b+c ");
				}
			
		}
		
		
	}

}

package leap;
import java.util.*;
public class leapyr {
	public static void main(String[] args) {
		int year;
		boolean leap = false;
		System.out.println("enter the year");
		Scanner LY = new Scanner(System.in);
		year = LY.nextInt();
		
			if(year%4==0) {
				System.out.println(year+ " :itis a leap year");
				
			}
			if(year%4!=0) {
				System.out.println(+year+ " is not the leap year");
				
				
			}
		
		
				
		 
	}
	

}

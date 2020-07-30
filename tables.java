package tables;
import java.util.*;

public class tables {
	public static void main(String[]args) {
		int num=0,i=0,sol=0;
		System.out.println("enter number for tables");
		Scanner S =new Scanner(System.in);
		
		while(true) {
			num=num+1;
			num=S.nextInt();
			
			for(i=1;i<=10;i++) {
				sol=num*i;
			
			
			
				System.out.printf("%d*%d=%d",num,i,sol).println();
				
			
				
				
				

			
			
			}
			for(i=0;i<=10;i++) {
				System.out.printf("%d:  ",i).println();
			}
			for(i=10;i>=1;i--) {
				System.out.printf("%d:  ",i).println();
			}			
	}
		
		
		
	}

}

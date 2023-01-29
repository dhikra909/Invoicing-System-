package syain;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Throwable {
		
		Scanner sc = new Scanner(System.in);
		
		boolean menueExit=true;
		do {
			for (String x:Menue.getMenuArray()) {
				System.out.println(x);
				
			}
			
//			int select = sc.nextInt();
			
			
				int select=sc.nextInt();
				switch (select) {
					case 1:
						for (String x:men.getMenuArray2()) 
							System.out.println(x);
							
						
						break;
						
					case 2:
						for (String x:mun2.getMenuArray3()) 
							System.out.println(x);
						break;
				
			}
		}	while (menueExit);
	boolean	userExit = false;
	
					
}			
		
}		
		
		
	




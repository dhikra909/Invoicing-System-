package syain;

import java.util.Scanner;

public class Main {
//	static int factorial(int m) {
//	if (m == 0)
//		return 1;
//	else
//		return (m * factorial(m - 1));
//}

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
					boolean exitMenu=true;
					while(exitMenu) {
						for (String x:men.getMenuArray2()) 
							System.out.println(x);
							int choose=sc.nextInt();
							switch(choose) {
							case 1:
								Insert.maininsrt();
								Insert.maininsrt_item();
								break;
							case 2:
								Insertshop.maininsrt_shop();
								break;
							case 3:
								Insert.maininsrt();
								break;
							case 4:
								exitMenu=false;
							}
					}
						break;
						
					case 2:
						boolean exitMenu2=true;
						while(exitMenu2) {
							for (String x:mun2.getMenuArray3()) 
								System.out.println(x);
								int choose=sc.nextInt();
								switch(choose) {
								case 1:
									Insert.maininsrt_item();
									break;
								case 2:
									Deletitem.main();
									break;
								case 3:
									Updeteitem.updatitemp();
									break;
								case 4:
									reportit.reportitm();
									break;
								case 5:
									exitMenu2=false;
//						for (String x:mun2.getMenuArray3()) 
//							System.out.println(x);
				}}
						break;
					case 3:
						Insert.maininsrt();
						break;
					case 4:
						Reportst.reportst();
						break;
					case 5:
						
						break;
					case 6:
						
						break;
					case 7:
						
						break;
					case 8:
						boolean	userExit = false;
						break;
				
			}
		}	while (menueExit);
	
	
					
}			
		
}		
		
		
	




package syain;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Menue {

	public static List<String> getMenuArray() {

		List<String> menueItemList = Arrays.asList("*************",

				"1-Shop Settings ", "2- Manage Shop Items ", "3- Create New Invoice ", "4- Report: Statistics ",
				"5- Report: All Invoices ", "6- Search (1) Invoice ", "7- Program Statistics ", "8- Exit  ");
		return menueItemList;
	}

}

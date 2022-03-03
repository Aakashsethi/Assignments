package task3;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) throws ParseException {
		 java.util.Date date1=null;
	        Scanner input = new Scanner(System.in);
	        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
	        System.out.println("Enter date (dd/mm/yy):");
	        String cinput = input.nextLine();
	        if(null != cinput && cinput.trim().length() > 0){
	             date1 = format.parse(cinput);
	        }
	        
	        System.out.print(date1); 

	}

}

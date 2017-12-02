package ic_identifier;

import java.util.Scanner;
import java.time.LocalDate;;

public class calculator {
	
	public static void main(String[] args) {
		  
	    Scanner input = new Scanner(System.in);
	    System.out.print("Enter your IC number without dash.For example:930711106759:");
	    String icNum =	input.nextLine();
	    
	    //declare input
	    int year = Integer.parseInt(icNum.substring(0, 2));
	    int month = Integer.parseInt(icNum.substring(2, 4));
	    int day = Integer.parseInt(icNum.substring(4, 6));
	    int state = Integer.parseInt(icNum.substring(6, 8));
	    int gender = Integer.parseInt(icNum.substring(11, 12));
	    
	    //compact condition
	    int four_year=(year>17 ?  year + 1900 : year + 2000);
	    LocalDate dob = LocalDate.parse(four_year+"-"+icNum.substring(2, 4)+"-"+icNum.substring(4, 6));

	    //call method	   
	    cal_state.get_state(state);
	    cal_gender.get_Gender(gender);
	    System.out.println("age :"+CalculateAge.getAge(dob));
	    System.out.println("born date :"+dob);
	    
	} 

}

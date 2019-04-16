package ic_identifier;

import java.time.LocalDate;
import java.time.Period;

public class Person {

	private String idNum;
	
	public Person() {}

	public Person(String idNum) {
		super();
		this.idNum = idNum;
	}

	public String getIdNum() {
		return idNum;
	}

	public void setIdNum(String idNum) {
		this.idNum = idNum;
	}
	
	
	public void cal_gender(){
		int gender = Integer.parseInt(idNum.substring(11, 12));
	    switch (gender % 2) {
	      case 0:  System.out.println("Gender :female") ; 
	      break;
	      case 1:  System.out.println("Gender :male"); 
	      break;
	    }
	    }
	

	    public void get_state(){
	    int state = Integer.parseInt(idNum.substring(6, 8));
	    switch (state) {
	      case 1:  System.out.println("State :johor"); break;
	      case 2:  System.out.println("State :kedah"); break;
	      case 3:  System.out.println("State :kelantan"); break;
	      case 4:  System.out.println("State :malacca"); break;
	      case 5:  System.out.println("State :negeri sembilan"); break;
	      case 6:  System.out.println("State :pahang"); break;
	      case 7:  System.out.println("State :penang"); break;
	      case 8:  System.out.println("State :perak"); break;
	      case 9:  System.out.println("State :perlis"); break;
	      case 10:  System.out.println("State :selangor"); break;
	      case 11:  System.out.println("State :terrengganu"); break;
	      case 12:  System.out.println("State :sabah"); break;
	      case 13:  System.out.println("State :sarawak"); break;
	      case 14:  System.out.println("State :kuala lumpur"); break;
	      case 15:  System.out.println("State :labuan"); break;
	      case 16:  System.out.println("State :putrajaya"); break;
	      default: System.out.println("N/A");
	    }
	}
	
	    
	public void getAge() {
		int year = Integer.parseInt(idNum.substring(0, 2));
		//int month = Integer.parseInt(idNum.substring(2, 4));
		//int day = Integer.parseInt(idNum.substring(4, 6));
		int four_year = (year > 17 ? year + 1900 : year + 2000);
		LocalDate dob = LocalDate.parse(four_year + "-" + idNum.substring(2, 4) + "-" +idNum.substring(4, 6));
		LocalDate curDate = LocalDate.now();
		System.out.println("Born Date:"+dob);
		System.out.println("Age:"+Period.between(dob, curDate).getYears());
	}
	

	
	
	
	}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


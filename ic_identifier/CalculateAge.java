package ic_identifier;
import java.time.LocalDate;
import java.time.Period;


// Java example program to calculate age from date of birth
// Works only in Java 8 and above
public class CalculateAge {

    // Returns age given the date of birth
    public static int getAge(LocalDate dob) {
        LocalDate curDate = LocalDate.now();
        return Period.between(dob, curDate).getYears();
    }
    
    
}


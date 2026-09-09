import java.util.*;
import java.time.*;
public class Main{

    public static void main(String[] args)
    {
        
        LocalDate currentDate = LocalDate.now();
        int year = currentDate.getYear();
        int month = currentDate.getMonthValue();
        int day = currentDate.getDayOfMonth();
        System.out.println("Date: "+month + "/" + day + "/" + year);
        System.out.println("Year: " + year);
        System.out.println("Month: " + month);
        System.out.println("Day: " + day);
        System.out.println("Enter your birthdate (mm/dd/year): ");
        Scanner sc = new Scanner(System.in);
        String birthdate = sc.nextLine();
        String[] parts = birthdate.split("/");
        int birthMonth = Integer.parseInt(parts[0]); 
        int birthDay = Integer.parseInt(parts[1]);   
        int birthYear = Integer.parseInt(parts[2]);  
        int age = year - birthYear;

        if (month < birthMonth || (month == birthMonth && day < birthDay)) {
        age--;
        }   

        System.out.println("You are " + age + " years old.");
        LocalDate nextBirthday = LocalDate.of(year, birthMonth, birthDay);

        if (nextBirthday.isBefore(currentDate)) {
        nextBirthday = LocalDate.of(year + 1, birthMonth, birthDay);
        }

        long daysUntilBirthday =java.time.temporal.ChronoUnit.DAYS.between(currentDate, nextBirthday);

        System.out.println("Days until your next birthday: " + daysUntilBirthday);


        




    }


}
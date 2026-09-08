package Password;
import java.util.*;
public class PasswordApp {

    public static void main(String[] args)
    {
        
        
        Scanner sc = new Scanner(System.in);
       
        boolean flag = true;
        while (flag){
            System.out.println("Please create a password.");
            System.out.println("Password must: ");
            System.out.println("    1)Contain one uppercase letter.");
            System.out.println("    2)One lowercase letter.");
            System.out.println("    3)One number.");
            System.out.println("Enter Password:");
            String password = sc.nextLine();
            int upper = 0;
            int lower = 0;
            int num = 0;
            for (int i = 0 ; i< password.length(); i++)
            {   
                
                if (Character.isDigit(password.charAt(i)))
                {
                    num++;

                }
                else if (Character.isUpperCase(password.charAt(i)))
                {
                    upper++;

                }
                else if (Character.isLowerCase(password.charAt(i)))
                {
                    lower++;

                }
                
                


        }
        if (lower == 0)
            {
                System.out.println("Must contain one lowercase letter.");
                

            }
        if(upper == 0)
        {
            System.out.println("Must contain one uppercase letter.");

        }
        if(num == 0)
        {
            System.out.println("Must contain one  number.");
        }
        if ((num > 0) && (upper>0) && (lower>0)){
                flag = false;
                System.out.println("Password accepted!");
            }
    }



    }
}

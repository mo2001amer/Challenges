import java.util.Scanner;
import java.util.*;

public class ReplApp {
    public static void main(String[] args) {
        System.out.println("Welcome to my REPL App!");
        Scanner sc = new Scanner(System.in);
        boolean flag = true;

        do  {
            String input = sc.nextLine();

            if (input.equals("help")) {
                System.out.printf("Available commands: %n add %n subtract %n multiply %n divide %n random %n reverse %n quit %n");
            }
            else if (input.equals("add")) {
                System.out.println("First Number: ");
                double first = sc.nextDouble();
                System.out.println("Second Number: ");
                double second = sc.nextDouble();
                System.out.println("Result: " + (second + first));


            }
            else if (input.equals("reverse")) {
                System.out.println("Enter text: ");
                String rev = sc.nextLine();
                String ans = "";
                for (int i = rev.length()-1; i >= 0;i--)
                {
                    ans += rev.charAt(i);

                }
                System.out.println(ans);


            }
            else if (input.equals("random")) {
                int min = 0;
                int max = 0;
                System.out.println("Minimum: ");
                min = sc.nextInt();
                System.out.println("Maximum: ");
                max = sc.nextInt();
                Random random = new Random();
                int number = random.nextInt(max - min +1) + min;
                System.out.println(number);


            }
            else if (input.equals("quit")) {
                flag = false;


            }
            else if (input.equals("subtract")) {
                System.out.println("First Number: ");
                double first = sc.nextDouble();
                System.out.println("Second Number: ");
                double second = sc.nextDouble();
                System.out.println("Result: " + (first - second));


            }
            else if (input.equals("multiply")) {
                System.out.println("First Number: ");
                double first = sc.nextDouble();
                System.out.println("Second Number: ");
                double second = sc.nextDouble();
                System.out.println("Result: " + (second * first));

            }
            else if (input.equals("divide")) {
                System.out.println("First Number: ");
                double first = sc.nextDouble();
                System.out.println("Second Number: ");
                double second = sc.nextDouble();
                if (second == 0)
                {
                    System.out.println("Cant have zero as second number");
                    System.out.printf("Available commands: %n add %n subtract %n multiply %n divide %n random %n reverse %n quit %n");
                    continue;

                }
                System.out.println("Result: " + (first/second));

            }
        }while (flag);

    }
}

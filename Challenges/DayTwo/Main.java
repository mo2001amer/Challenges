import java.util.*;
public class Main {
    public static void  main (String args[]){

        // Challenge one : Calculate 5 test scores
        int test;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter test scores: ");
        int total = 0;
        int max = 0;
        int min = 0;
        int[] arr =  new int[5];
        for (int i = 0; i <= 4 ; i ++ )
        {  
            test = sc.nextInt();
            if (test>max)
            {
                max = test;


            }
            if(test< min)
            {
                min = test;

            }
            total += test;
            arr[i] = test;


        }
        System.out.println("Total: " + total);
        System.out.println("Average: " + (total/5));
        System.out.println("Highest: "+ max);
        System.out.println("Lowest: "+ min);
        System.out.println("Your values were: ");
         for (int i = 0; i <= 4 ; i ++ )
        {  
            if (arr[i]>=90)
            {
                System.out.println(arr[i]+ "- A");
            }
             else if (arr[i]>=80)
            {
                System.out.println(arr[i]+ "- B");
            }
             else if (arr[i]>=70)
            {
                System.out.println(arr[i]+ "- C");
            }
            else if (arr[i]>=60)
            {
                System.out.println(arr[i]+ "- D");
            }
            else
            {
                System.out.println(arr[i]+ "- F");
            }




        }








        // Challenge two : Repl
        int input = 0;
        double balance = 0;
        double deposit = 0;
        double withdraw = 0;
        while (input != 4)
        {
            System.out.println("1. Check Balance");
            System.out.println("2.Depsit");
            System.out.println("3.Withdraw");
            System.out.println("4.Exit" );
            input = sc.nextInt();
            if (input == 4)
                {
                    break;

                }
            else if (input == 1)
            {
                System.out.println(balance);

            }
            else if (input == 2)
            {
                System.out.println("Enter deposit amount: ");
                deposit = sc.nextDouble();
                balance += deposit;
                continue;



            }
            else if (input == 3)
            {
                System.out.println("Enter withdraw: ");
                withdraw = sc.nextDouble();
                balance -= withdraw;
                if (balance <0)
                {
                    balance += withdraw;
                    System.out.println("Can't make withdraw. Not enough balance.");
                    continue;

                }
                else 
                {
                    continue;
                }


            }



        }
    }
}

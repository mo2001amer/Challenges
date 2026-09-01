import java.util.*;
public class Main {

    public static void main(String[] args) {
        //First challenge - Hello World!
        System.out.println("Hello Wolrd!");


        //Second challenge - Printing Output
        int age = 25;
        double height = 5.8;
        String name = "Muhammad Amer";
        System.out.printf("Name:%s,Age:%d,Height:%f",name,age,height);

        //Third challange - Operators
        int a = 20;
        int b = 10;
        int add = a + b;
        int sub = a - b;
        int mul = a* b;
        int div = a / b;
        boolean greater = a>b;
        boolean andOp = (a>b) && b>0;
        System.out.println("Addition: "+add);
        System.out.println("Subtraction: " + sub);
        System.out.println("Multiplication: " + mul);
        System.out.println("Division: "+ div);
        System.out.println("Is a greater than b? " + greater);
        System.out.println("Is a>b and b>0? "+ andOp);  

        // Fourth Challenge - Control Flow
        int score = 75;
        char grade = 'B';
        if (score >= 90 )
        {
            System.out.println("Passed");
            grade = 'A';
            System.out.println(grade);

        }
        else if (score >= 75)
        {
            System.out.println("Passed");
            grade = 'B';
            System.out.println(grade);


        }
        else if (score >= 60)
        {
            System.out.println("Passed");
            grade = 'C';
            System.out.println(grade);

        }
        else if (score< 60 && score >=50)        {
            System.out.println("Passed");
            grade = 'D';
            System.out.println(grade);


        }
        else
        {
             System.out.println("Failed");
            grade = 'D';
            System.out.println(grade);



        }

        //Fifth Challenge - Loops
        System.out.print("For loop: ");

        for (int i = 1 ; i <=5;i++)
        {
            System.out.print(" "+ i);


        }
        int j = 1;
        System.out.println();
        System.out.print("While loop: ");
        while(j <= 5)
        {
            System.out.print(" "+j);
            j++;
            
        }
        System.out.println();
        System.out.print("Do-While Loop: ");
        
        int k = 1;
        do {
            System.out.print(" "+ k);
            k++;

        }
        while(k<=5);


    }
   


}
package WordAnalyzer;
import java.util.*;
public class WordAnalyzer {
    public static void main(String[] args)
    {
        int vowels = 0;
        int ch = 0;
        int cons = 0;
        int dig = 0;
        int spaces = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a sentence: ");
        String word = sc.nextLine();
        for (int i = 0; i <= word.length() - 1 ; i++   )
        {
            if(word.charAt(i)== ' ')
            {
                spaces++;

            }
            else if (Character.isDigit(word.charAt(i)))
            {
                dig++;


            }
            else if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' ||  word.charAt(i) == 'o' ||  word.charAt(i) == 'u'   )
            {
                vowels++;


            }
            else{

                cons++;
            }


        }
        System.out.println("Charecters: " + word.length());
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + cons );
        System.out.println("Digits: " + dig);
        System.out.println("Spaces: "+ spaces);


    }
}

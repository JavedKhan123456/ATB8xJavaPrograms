package Sep.ex_25092024;

import java.util.Scanner;

public class VowelAndConsent {
    public static void main(String[] args) {


        String name;
        int vowel=0;
        int consonent=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        name = sc.next();
        for(int i=0;i<name.length();i++)
        {
            if(name.charAt(i)=='a'|| name.charAt(i)=='e'
                    ||name.charAt(i)=='i' || name.charAt(i)=='o' || name.charAt(i)=='u')
            {
                vowel++;
            }

            else
            {
                consonent++;
            }

        }

        System.out.println("The no of vowel is "+vowel+ " The no of consonent is "+consonent);
    }
}
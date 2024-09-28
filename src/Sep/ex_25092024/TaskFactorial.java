package Sep.ex_25092024;

import java.util.Scanner;

public class TaskFactorial {
    public static void main(String [] args)
    {
        int n,sum=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        n=sc.nextInt();
        for(int i=n;i>0;i--)
        {
            sum=sum*i;
        }
        System.out.println("The factorial of number "+n+" is "+sum);
    }
}

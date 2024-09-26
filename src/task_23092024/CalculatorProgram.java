package task_23092024;

import java.util.Scanner;

public class CalculatorProgram {
    public static void main(String[] args) {
        char operator='%';
        //Scanner sc=new Scanner(System.in);
       // operator=
        int a=10,b=20;
        switch(operator)
        {
            case '+':System.out.println("addition of a and b is"+(a+b));
            break;
            case '-':System.out.println("subtraction of a and b is"+(a-b));
                break;
            case '*':System.out.println("multiplication of a and b is"+(a*b));
                break;
            case '/':System.out.println("division of a and b is"+(a/b));
                break;
            case '%':System.out.println("modulo division of a and b is"+(a%b));
                break;
            default:System.out.println("no case is matched");

        }
    }
}

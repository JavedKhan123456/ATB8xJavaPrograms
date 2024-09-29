package task_23092024;

import java.util.Scanner;

public class UnitsConversion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String unit=sc.next();
        float celcius=50.09f;

        switch(unit)
        {
            case "meter":System.out.println(5*1000);
            break;



            case "farenoid":
                float faren=(celcius*9/5)+32;
                System.out.println(faren);
                break;

            default:System.out.println("Not matched") ;


        }

    }
}

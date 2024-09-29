package task_23092024;

import java.util.Scanner;

public class Month {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the month");
        int month=sc.nextInt();

        switch(month)
        {
            case 1->System.out.println("The month is january");
            case 2->System.out.println("The month is February");
            case 3->System.out.println("The month is March");
            case 4->System.out.println("The month is April");
            case 5->System.out.println("The month is May");
            case 6->System.out.println("The month is June");
            case 7->System.out.println("The month is July");
            case 8->System.out.println("The month is August");
            case 9->System.out.println("The month is September");
            case 10->System.out.println("The month is October");
            case 11->System.out.println("The month is November");
            case 12->System.out.println("The month is December");
            default->System.out.println("No month is selected");
        }
    }

}

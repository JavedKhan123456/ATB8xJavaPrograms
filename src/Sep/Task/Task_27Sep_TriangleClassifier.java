package Sep.Task;

import java.util.Scanner;

public class Task_27Sep_TriangleClassifier {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the side1");
        double side1=sc.nextDouble();
        System.out.println("Enter the side2");
        double side2=sc.nextDouble();
        System.out.println("Enter the side3");
        double side3=sc.nextDouble();

        if(side1>=1 && side2>=1 && side3>=1)
        {
           if(side1==side2 && side1==side3 && side2==side3)
           {
               System.out.println("Equilateral Triangle");
           }
            if(side1==side2 || side1==side3 || side2==side3)
            {
                System.out.println("Isoseles  Triangle");
            }

            else
            {
                System.out.println("Scalene Triangle");
            }
        }

        else
        {
            System.out.println("Are you mad entering negative side");
        }

    }
}

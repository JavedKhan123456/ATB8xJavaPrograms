package Sep.ex_16092024;

import java.util.Scanner;

public class LargestOf3No {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        a= sc.nextInt();
        b= sc.nextInt();
        c= sc.nextInt();

        int largest=a>b&&a>c?a:(b>a&&b>c)?b:c;
        System.out.println("Largest no is "+largest);
    }
}

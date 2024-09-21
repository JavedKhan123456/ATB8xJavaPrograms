package Sep.ex_13092024;

public class Task_Calculator {
    public static void main(String[] args) {
        double  a=34;
        double b=10;
        /*
        System.out.println("The addition of a and b ="+(a+b));
        System.out.println("The subtraction of a and b="+(a-b));
        System.out.println("The multiplication of a and b ="+(a*b));
        System.out.println("The division of a and b ="+(a/b));
        System.out.println("The modulus of a and b ="+(a%b));
         */
        System.out.printf("The addition of %f and %f = %f",a,b,a+b );
        System.out.println();
        System.out.printf("The subtraction of %f and %f = %f",a,b,a-b );
        System.out.println();
        System.out.printf("The multiplication of %f and %f = %f",a,b,a*b );
        System.out.println();
        System.out.printf("The division of %f and %f = %f",a,b,a/b );
        System.out.println();
        System.out.printf("The modulus of %f and %f = %f",a,b,a%b );

    }
}

package Sep.ex_25092024;

public class Lab108 {
    public static void main(String[] args) {
        //WAP to print Even and Odd no from 0 to 50
        for(int i=0;i<=50;i++)
        {
            if(i%2==0)
            {
                System.out.println("Even -> "+i);
                continue;
            }
            System.out.println("Odd ->"+i);
        }
    }
}

package Sep.ex_27092024;

public class Lab119_Do_While {
    public static void main(String[] args) {
        int age=18;
        do {

                System.out.println("Go tomvote if age greator than 18");
                age++;
                if(age==90)
                    break;
            }
        while(age > 18);
        }
    }


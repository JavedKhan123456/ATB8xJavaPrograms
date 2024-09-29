package Sep.Task;

public class WhileVsDoWhile {
    public static void main(String[] args) {
        int Age=17;
        //While example
        /*
        while(Age>18)
        {
            System.out.println("Eligible for Voting");
            Age++;
        }
       */

        do {

                System.out.println("Eligible for voting");
                Age++;
            }
        while(Age>18);
        }
    }


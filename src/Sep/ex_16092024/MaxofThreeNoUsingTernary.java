package Sep.ex_16092024;

public class MaxofThreeNoUsingTernary {
    public static void main(String[] args) {
        int a=100,b=164,c=101;
        int max1=a>b?a:b;
        int max2=max1>c?max1:c;
        System.out.println("The maximum no is "+max2);

    }
}

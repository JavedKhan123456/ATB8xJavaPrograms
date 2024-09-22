package Sep;

public class IncrementAndDecrement {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        //int c=++a+a++;//11+11
       // System.out.println(c);
       // System.out.println(a);//12

        int d=++a+a+++b++;//11+12+20
        System.out.println(d);//42
        System.out.println(a);//12
        System.out.println(b);//21
    }
}

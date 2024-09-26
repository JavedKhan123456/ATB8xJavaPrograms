package Sep.ex_23092024;

public class Lab083 {
    public static void main(String [] args)
    {
      int itemcode=006;

      switch(itemcode)
      {
          case 001,002,005:
              System.out.println("All of them are electrical Gadget");
              break;

          case 004,006,007:
              System.out.println("This is Mech");
              break;

          default:
              System.out.println("None of them");
      }

    }
}

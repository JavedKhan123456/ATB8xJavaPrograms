package Sep.ex_13092024;

public class EscapeCharacters {
    public static void main(String[] args) {
        System.out.println("javed"+"\n"+"Khan");
        System.out.println("Javed"+"\t"+"khan");
        System.out.println("Javed"+"\b"+"khan");
        System.out.println("Javed"+"\r"+"khan");

        char carriage_return='\r';
        System.out.println("Javed"+carriage_return+"khan");

    }
}

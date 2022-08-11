import java.util.Scanner;

public class CaseConvert {
    static void CaseConvert(String Enteredstring)
    {
        int i = 0, length = 0;
        String word = "";
        char character = ' ';
        Enteredstring = Enteredstring + " ";
        length = Enteredstring.length();
        for (i = 0; i < length; i++) {
            character = Enteredstring.charAt(i);
            if (character == ' ') {
                System.out.print(word + " ");
                word = "";
            } else {
                if (Character.isLowerCase(character) == true) {
                    word = word + Character.toUpperCase(character);

                } else {
                    word = word + Character.toLowerCase(character);
                }

            }
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Sentence to convert");
        String Enteredstring = scanner.nextLine();
        CaseConvert(Enteredstring);

    }
}
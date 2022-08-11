import java.util.*;
import java.lang.Exception;
class customException extends Exception {
    customException(String string) {
        super(string);
    }
}
public class Election {
    public static void ApplicableUser(int age) throws customException {
        if (age < 25) {
            throw new customException("Not applicable user");
        } else {
            System.out.println("Accepted");
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the age");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        try {
            ApplicableUser(age);
        } catch (customException e) {
            System.out.println("Exception Caught----" + e);

        }
    }
}
import java.util.Scanner;
import java.util.Scanner.*;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String string1 = sc.next();
        String string2 = sc.next();
        StringBuffer sb = new StringBuffer(string1);
        sb.append(string2);


        System.out.println("Merging of string " + sb);
        String text = "Hello World";
        String[] result = text.split(" ");
        System.out.print("split = ");
        for (String str : result) {
            System.out.println(str + ", ");
        }
        System.out.println("Length of String " + sb.length());
        System.out.println("Reverse of String " + sb.reverse());
        System.out.println(string1.equals(string2));
    }
}

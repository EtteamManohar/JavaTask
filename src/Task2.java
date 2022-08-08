import java.util.*;
public class Task2 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int D1=sc.nextInt();
        int D2=sc.nextInt();
        int D3=sc.nextInt();
        int D4=sc.nextInt();

        int D5=sc.nextInt();

        int D6=sc.nextInt();

        int D7=sc.nextInt();

        int B, Br, r1=0, r2=0, r3=0, r4=0, r5=0, r6=0, r7=0, r8 = 0;

        int x, y, z;

        r1 = D1 * 150;

        r7=D7*125;

        if(D2 <= 8)

        {

            r2 = D2 * 100;

        }

        else if(D2 > 8)

        {

            B = D2 - 8;

            Br = B * 115;

            r2 = Br + 800;

        }

        if(D3 <= 8)

        {

            r3 = D3 * 100;

        }

        else if(D3 > 8)

        {

            B = D3 - 8;

            Br = B * 115;

            r3 = Br + 800;

        }

        if(D4 <= 8)

        {

            r4 = D4 * 100;

        }

        else if(D4 > 8)

        {

            B = D4 - 8;

            Br = B * 115;

            r4 = Br + 800;

        }

        if(D5 <= 8)

        {

            r5 = D5 * 100;

        }

        else if(D5 > 8)

        {

            B = D5 - 8;

            Br = B * 115;

            r5 = Br + 800;

        }

        if(D6 <= 8)

        {

            r6 = D6 * 100;

        }

        else if(D6 > 8)

        {

            B = D6 - 8;

            Br = B * 115;

            r6 = Br + 800;

        }

        y = D2 + D3 + D4 + D5 + D6;

        if(y > 40)

        {

            x = y - 40;

            r8 = x * 25;

        }

        z = r1 + r2 + r3 + r4 + r5 + r6 + r7 + r8;

        System.out.printf("%d", z);

    }

}

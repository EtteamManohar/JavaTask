import java.util.*;
public class Task3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char Char1=sc.next().charAt(0);
        char Char2=sc.next().charAt(0);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int k=0;k<=i;k++){
                System.out.print(Char1);
            }
            for(int j=n-1;j>=i;j--){
                System.out.print(Char2);
            }
            System.out.println();
        }
    }
}
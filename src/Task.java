import java.util.*;

public class Task {
    public static void main(String[] args) {
        int L1, L2, L3, N, X, Y, Z;
        Scanner sc = new Scanner(System.in);
        L1 = sc.nextInt();
        L2 = sc.nextInt();
        L3 = sc.nextInt();
        N = sc.nextInt();
        X = L1 - N;//5
        Y = L2 - N;//15
        Z = L3 - N;//-5
        if(X<0 && Y>=0 && Z>=0 ){
            if(Y<Z){
                System.out.println("L2");
            }else{
                System.out.println("L3");
            }
        }
        if(X>=0 && Y<0 && Z>=0 ){
            if(X<Z){
                System.out.println("L1");
            }else{
                System.out.println("L3");
            }
        }
        if(X>=0 && Y>=0 && Z<0 ){
            if(X<Y){
                System.out.println("L1");
            }else{
                System.out.println("L2");
            }
        }
        if(X<=Y && X<=Z && X>=0 && Y>=0 && Z>=0){
            System.out.println("L1");
        }
        else if(Y<=X && Y<=Z && X>=0 && Y>=0 && Z>=0){
            System.out.println("L2");
        }
        else if(Z<=X && Z<=Y && X>=0 && Y>=0 && Z>=0){
            System.out.println("L3");
        }

    }
}

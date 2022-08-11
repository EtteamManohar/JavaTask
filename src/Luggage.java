import java.util.*;
import java.lang.Exception;
class AdditionalCharges extends Exception{
    AdditionalCharges(String str){
        super(str);
    }
}
public class Luggage {
    public static void CalculatingWeight(float Weight) throws AdditionalCharges {
        if (Weight <=15) {
            System.out.println("No Charges");
        } else {
            float charge=0;
            charge=(Weight-15)*500;
            String TotalCost=String.format("%.02f",charge);
            System.out.println(TotalCost+" Rupees");
            throw new AdditionalCharges("Applicable");
        }
    }
    public static void main(String[] args) {
        System.out.println("Hello User! Maximum luggage allowed is 15 Kg without any additional cost");
        System.out.println("If weight  exceeds the limit, a charge of 500 rupees per Kg is levied");
        System.out.println("Enter the luggage weight");
        Scanner scanner=new Scanner(System.in);
        float Weight=scanner.nextFloat();
        try
        {
            CalculatingWeight(Weight);
        }
        catch(AdditionalCharges e){
            System.out.println(e);
        }

    }
}

public class Task6
{
    public static void main(String[] args)
    {
        int[] n = { 1,2,3,4,5,6 };
        int max = n[0];
        int min = n[0];
        for (int i = 1; i < n.length; i++)
        {
            if (n[i] > max) {
                max = n[i];
            }
            else if (n[i] < min) {
                min = n[i];
            }
        }
        System.out.println("minimum :" + min);
        System.out.println("maximum :" + max);
    }

}

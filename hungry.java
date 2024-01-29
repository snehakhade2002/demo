import java.util.*;

public class hungry{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println(" are you hungry....??");
        String ipstr = sc.nextLine();
        ipstr = ipstr.toLowerCase().trim();
        if(ipstr.equals("yes") || ipstr.equals("y") || ipstr.equals("Y"))
        {
            System.out.println(" eat an apple");
            System.out.println(" eat a pizza");
        }
        else
        {
            System.out.println(" code.......");
        }
    }
}
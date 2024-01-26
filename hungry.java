import java.util.*;

public class hungry{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println(" are you hungry....??");
        String ipstr = sc.nextLine();
        ipstr = ipstr.toLowerCase().trim();
        if(ipstr.equals("yes"))
        {
            System.out.println(" eat an apple");
        }
        else
        {
            System.out.println(" code.......");
        }
    }
}
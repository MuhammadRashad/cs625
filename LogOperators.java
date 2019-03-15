public class LogOperators
{
   public static void main(String[] args)
   {
        String x = "Sher";
        String y = "locked";
        
        Scanner s = new Scanner(System.in);
        System.out.println("Enter username:");
        String uuid = s.next();
        System.out.println("Enter password:");
        String upwd = s.next();


        if ((uuid.equals(x) && upwd.equals(y)) ||
                 (uuid.equals(y) && upwd.equals(x))) {
            System.out.println("welcome user.");
        } else {
            System.out.println("wrong uid or password");
        }
    }
}
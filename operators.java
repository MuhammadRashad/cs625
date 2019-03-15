// Java program to illustrate
// unary operators
public class operators
{
   public static void main(String[] args)
    {
       int a = 20, b = 10, c = 0, d = 20, e = 40, f = 38;
        boolean condition = true;
          
         // pre increment operator
         // a = a+1 and then c = a;
         c = ++a;
         Syestem.out.println("valiue of c (++a) = " +c);
         //  post increment operator
         // c=b then b=b+1
         c = b++;
         System.out.println("value of c (b++) = " +c);
         // pre-decrement operator
         // d=d-1 then c=d
          c = --d;
          System.out.println("value of c (--d) = "+c);
          // post-decrement operator
          // c=e then e=e-1
           c = --e;
           System.out.println("value of c (--e) =" +c);
           // Logical operator
           system.out.println("value of !condition =" + !condition);

    }

 }
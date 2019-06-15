class CallByValue {
      public static void main(String args[]) {
        test ob = new test ();

        int a = 15, b = 20;

        System.out.println("a and b before call: "+ a + " " + b) ;

        ob.nochange (a, b);
 
       System.out.println("a and b after call: " + a + " " + b);

   }
 }
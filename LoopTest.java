public class LoopTest {
   // The main method is the point of entry into the program...
   public static void main(String[] args) {
      LoopTest me = new LoopTest();
      me.doStuff();
   }
   // add your code here...
   public void doStuff() {
      System.out.println("A: " + powerOf2A(3));
      System.out.println("B: " + powerOf2B(3));
      System.out.println("C: " + powerOf2C(3));

      printLineA(powerOf2A(3));
      printLineB(powerOf2B(3));
      printLineC(powerOf2C(3));

   }
   // These functions compute powers of two.
   public int powerOf2A(int n) {
      int counter = n;
      int result  = 1;
      while (counter != 0) {
         result = 2 * result;
         counter--;
      }
      return result;
   }
   public int powerOf2B(int n) {
      int counter = n;
      int result  = 1;
      if(counter != 0) {
         do {
            result = 2 * result;
            counter--;
         } while (counter != 0);
      }
      return result;
   }
   public int powerOf2C(int n) {
      int counter;
      int result;
      for (counter = n, result = 1; counter != 0; counter--) {
         result = 2 * result;
      }
      return result;
   }
   /**
     *  Prints a row of stars of a given length.
     */
   public void printLineA(int length) {
      int counter = length;
      while (counter != 0) {
         System.out.print("#");
         counter--;
      }
      System.out.println();
   }
   public void printLineB(int length) {
      int counter = length;
      if(counter != 0) {
         do {
            System.out.print("#");
            counter--;
         } while (counter != 0);
      }
      System.out.println();
   }
   public void printLineC(int length) {
      for (int i=0; i<length; i++) {
         System.out.print("#");
      }
      System.out.println();
   }
}

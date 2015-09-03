public class Iffy {
   private int anIntProp = 42;
   public static void main(String[] args) {
      Iffy me = new Iffy();
      me.callSomeMethods();
   }

   public void callSomeMethods() {
      warnIfNegative(-2);
      resetIfNegative();

      if(isInRange(5, 4, 1))
        System.out.println("true");
      else
        System.out.println("false");

      if(isInRange(5, 5, 1))
        System.out.println("true");
      else
        System.out.println("false");

      if(isInRange(5, 7, 1))
        System.out.println("true");
      else
        System.out.println("false");

      if(isInRangeIfLess(9, 11, 10))
        System.out.println("WARNING - upperbound is lower than or equal to lowerbound");


   }

   /**
    * Print out a warning if the value is negative
    * otherwise don't do anything.
    */
   public void warnIfNegative(int theValue) {
      // Don't put a semicolon after an if-statement
      if(theValue < 0)
        System.out.println("Caution - negative value given (" + theValue + ")");
   }
  
   /**
    * Print out a warning if the value of anIntProp is negative
    * and also set the value to zero.
    * Otherwise don't do anything.
    */
   public void resetIfNegative() {
    // Use brackets when there is more than one statement after an if-statement
      if(anIntProp < 0) {
        System.out.println("Caution - negative value given (" + anIntProp + ")");
        anIntProp = 0;
      }
         System.out.println("New value: " + anIntProp);
   }

   /**
    * return true if value is between upperBound and LowerBound
    * (or equal to either bound) otherwise return false.
    */
   /*public boolean isInRange(int value, int upperBound, int lowerBound) {
     if(lowerBound <= value && value <= upperBound)
       return true;
     else
       return false;
   }*/

   public boolean isInRange(int value, int upperBound, int lowerBound) {
      return (lowerBound <= value && value <= upperBound );
   }

   public boolean isInRangeIfLess(int value, int upperBound, int lowerBound) {
      return (upperBound <= lowerBound);
   }
}

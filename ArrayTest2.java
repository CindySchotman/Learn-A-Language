class Human {

   // Properties of the class...
   String name;

   // Constructor of the class...
   public Human(String aName) {
      name = aName;
   }

   // Methods of the class...
   public String toString() {
      return "I am a human and my name is " + name;
   }
}

class ArrayTest2 {

   public static void main(String[] args) {
      ArrayTest2 x = new ArrayTest2();
      x.doStuff();
   }

   public void doStuff() {

      Human[] threesome = new Human[3];
      
      Human a = new Human("Agnus");
      Human b = new Human("Brian");
      Human c = new Human("Charles");

      threesome[0] = a;
      threesome[1] = b;
      threesome[2] = c;

      for (int i=0; i<threesome.length; i++) {
         System.out.println(threesome[i].toString());
      }

      printArray(threesome);

   }

   public void printArray(Human[] x) {
      for (int i=0; i<x.length; i++) {
         System.out.println(x[i].toString());
      }
   }


}

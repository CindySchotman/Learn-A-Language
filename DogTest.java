class Flea {
   
   // Properties of the class...
   public String name;
   
   // Constructor of the class...
   public Flea(String aName) {
      name = aName;
   }

   // Methods of the class...
   public String toString() {
      return "I am a flea called " + name;
   }

}

class Dog {

   // Properties of the class...
   public String name;
   private int    age;
   public Flea   dogsFlea;

   // Constructor of the class...
   public Dog(String aName, int anAge, Flea aFlea) {
      name     = aName;
      age      = anAge;
      dogsFlea = aFlea;
   }

   // Methods of the class...
   public String toString() {
      return "I am a dog called " + name + " of age " + age + " and with a flea called " + dogsFlea.name;
   }

}

class DogOwner {

   // Properties of the class...
   private String name;
   private int    salary;
   public Dog    ownersDog;

   // Constructor of the class...
   public DogOwner(String aName, int aSalary, Dog aDog) {
      name      = aName;
      salary    = aSalary;
      ownersDog = aDog;
   }

   // Methods of the class...
   public String toString() {
      return "I am a dogowner called " + name + " with a salary of " + salary + " and with a dog called " + ownersDog.name;
   }

}

class DogTest {

   // The main method is the point of entry into the program...
   public static void main(String[] args) {
      Flea p = new Flea("Pop");
      Flea s = new Flea("Squeak");
      Flea z = new Flea("Zip");

      Dog r = new Dog("Rex", 2, p);
      Dog j = new Dog("Jimbo", 3, s);
      Dog f = new Dog("Fido", 1, z);

      DogOwner a = new DogOwner("Angus", 2000, r);
      DogOwner b = new DogOwner("Brian", 3000, j);
      DogOwner c = new DogOwner("Charles", 1000, f);


      System.out.println(a.toString());
      System.out.println(b.toString());
      System.out.println(c.toString());

      System.out.println(a.ownersDog.dogsFlea.toString());
   }
}


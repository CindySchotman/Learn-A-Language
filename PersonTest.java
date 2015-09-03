class Person {

   // Properties of the class...
   private String name;
   public int    age;
   private String gender;
    
   // Constructor of the class...
   public Person(String aName, int anAge, String aGender) {
      name = aName;
      age  = anAge;
      gender = aGender;
   }


   // Methods of the class...
   public void talk() {
      System.out.println("Hi, my name's " + name);
      System.out.println("and my age is " + age);
      System.out.println("and my gender is " + gender);
      commentAboutAge();
      System.out.println();
   }
   public void commentAboutAge() {
      if (age < 5) {
         System.out.println("baby");
      }
      if (age == 5) {
         System.out.println("time to start school");
      }
      if (age > 60) {
         System.out.println("old person");
      }
   }
   public void growOlder(int years) {
      age += years;
   }
   public void giveKnighthood() {
      name = "Sir " + name;
   }
}

class PersonTest {

   // The main method is the point of entry into the program...
   public static void main(String[] args) {

      Person ls = new Person("Luke Skywalker",34,"man");
      Person wp = new Person("Winston Peters",4,"man");

      ls.talk();
      //ls.commentAboutAge();
      wp.talk();
      //wp.commentAboutAge();

      wp.growOlder(1);
      wp.talk();
      //wp.commentAboutAge();

      ls.giveKnighthood();
      ls.talk();

      System.out.println("My age is " + ls.age);

      ls.growOlder(10);
      ls.talk();
      
   }

}


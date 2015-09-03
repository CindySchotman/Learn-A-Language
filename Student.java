/* Need to import java.io package to use the BufferedReader and
	 InputStreamReader. 
*/
import java.io.*;

public class Student {

  private static BufferedReader stdIn = new BufferedReader(new
		InputStreamReader(System.in));

  private String name;
  private int age;

  public Student() {
    name = "";
    age = 0;
  }

  public void readName() throws IOException {
    System.out.print("Input your name: ");
    name = stdIn.readLine();
  }
  public void printName() {
    System.out.println("Name: " + name);
  }


  public void readAge() {
    try {
      System.out.print("Input your age: ");
      age = Integer.valueOf(stdIn.readLine());
      if(age < 0 || age > 150) {
        System.out.println("Age must be between 0 and 150");
        readAge();
      }
    } catch (IOException e) {
        System.out.println("ERROR - Exit programm");
        System.exit(0);
    } catch (NumberFormatException f) {
        age = -1;
        System.out.println("ERROR - Try again.");
        readAge();
    }
  }
  
  public void printAge() {
    System.out.println("Age: " + age);
  }


  public static void main (String[] args) throws IOException {
    Student me = new Student();
    me.readName();
    me.printName();
    me.readAge();
    me.printAge();

  }
}

  
  

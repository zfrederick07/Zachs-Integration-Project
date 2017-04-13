import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {
  Scanner s = new Scanner(System.in);
  
  public static int intException(Scanner s) {
    int userInt = 0;
    boolean pass = false;
    System.out.println("Please enter your number."); 
    do {
      try {
        userInt = s.nextInt(); 
        pass = true;
      } catch(InputMismatchException ex) {
          System.out.println("You did not enter an Interger. Please enter one.");
          s.nextLine();
      } catch(Exception e) {
          System.out.println("Please enter an Integer.");
          s.nextLine();
      }
    } while (pass == false);
    return userInt;
  }
  
  public static double doubleException(Scanner s) {
    double userDouble = 0;
    boolean pass = false;
    System.out.println("Please enter your number."); 
    do {
      try {
        userDouble = s.nextDouble(); 
        pass = true;
      } catch(InputMismatchException ex) {
          System.out.println("You did not enter an Interger. Please enter one.");
          s.nextLine();
      } catch(Exception e) {
          System.out.println("Please enter an Integer.");
          s.nextLine();
      }
    } while (pass == false);
    return userDouble;
  }
  
  public static int genericIntException(Scanner s) {
    int userInt = 0;
    boolean pass = false; 
    do {
      try {
        userInt = s.nextInt();
        pass = true;
      } catch(InputMismatchException ex) {
          System.out.println("You did not enter an Interger. Please enter one.");
          s.nextLine();
      } catch(Exception e) {
          System.out.println("Please enter an Integer.");
          s.nextLine();
      }
    } while (pass == false);
    return userInt;
  }  
}

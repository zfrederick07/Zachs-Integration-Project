import java.util.Scanner;

class Basic_Calculation {
   double sum;
  
   public void addition(double x, double y) {
      sum = x + y;
      System.out.println("The sum of the given numbers:" + sum);
   }
  
   public void Subtraction(double x, double y) {
      sum = x - y;
      System.out.println("The difference between the given numbers:" + sum);
   }
   
   public void Remainder(double x, double y) {
     System.out.println("To advanced for this section.");
   }
}

public class Math_Calculation extends Basic_Calculation {//Inheriting from parent class
  
  public void multiplication(double x, double y) {
    sum = x * y;
    System.out.println("The product of the given numbers:" + sum);
  }
   
  public void division(double x, double y) {
    sum = x / y;
    System.out.println("The quotient of the numbers: " + sum);
  }
  
  public void remainder(double x, double y) {//Use of polymorphism because changed from parent class
    sum = x % y;
    System.out.println("The remainder is: " + sum);
  }
  
  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);
    Math_Calculation calc = new Math_Calculation();
    
    System.out.println("Please enter your two numbers: ");
    double first = Exceptions.doubleException(scan);
    double second = Exceptions.doubleException(scan);
    
    
    System.out.println("What Calculation would you like to do?");
    System.out.println("\t1) Addition");
    System.out.println("\t2) Subtraction");
    System.out.println("\t3) Multiplication");
    System.out.println("\t4) Division");
    System.out.println("\t5) Remainder");
    int userChoice = Exceptions.genericIntException(scan);
    
    switch(userChoice) {
      case 1:
        calc.addition(first, second);
        break;
      
      case 2:
        calc.Subtraction(first, second);
        break;
      
      case 3:
        calc.multiplication(first, second);
        break;
        
      case 4:
        calc.division(first, second);
        break;
        
      case 5:
        calc.remainder(first, second);
        break;
        
      default:
        System.out.println("That is not an option.");
        break;
    }
  }
}

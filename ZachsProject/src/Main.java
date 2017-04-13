import java.util.Random;
import java.util.Scanner;

public class Main {

  public static void main (String[] args) {
    // Zachary Frederick
    // Here is a compilation of everything that I have learned in the class
    Scanner scan = new Scanner(System.in);

    // Main Menu of program
    userIntro(scan);
    String userName = userInfo.getName();
    program(args, scan, userName);
  }

  public static void program(String[] args, Scanner scan, String userName) {
    int programNumber;

    mainMenu();
    programNumber = Exceptions.intException(scan);
    scan.nextLine();

    // Switch statement to organize the menu options
    switch (programNumber) {
    case 1:// Java Test
      System.out.println("You have been learing Java for " + userInfo.getjavaYears() + " year(s).");
      System.out.println("Lets test those skills!");
      short correctAnswer = 0;

      // Definition of a variable
      System.out.println("\n Question 1: What is a variable?");
      System.out.println("\tA) A fancy math term");
      System.out.println("\tB) A location in memory");
      System.out.println("\tC) A sequence of characters");
      System.out.println("\tD) None of the above");
      String answerOne = scan.nextLine();
      if (answerOne.equalsIgnoreCase("B")) {
        correctAnswer = countingCorrect(correctAnswer);
      } else {
        System.out.println("Sorry that is incorrect.");
        System.out.println("The correct answer was B.");
      }

      // Built in Java data types (Others include byte, short, long, float, and
      // char)
      // Byte, short, char, int, and long store numbers (size stored from byte
      // to long)
      System.out.println("\n Question 2: Which of these are not a built in data type in Java?");
      System.out.println("\tA) int");
      System.out.println("\tB) boolean");
      System.out.println("\tC) class");
      System.out.println("\tD) double");
      String answerTwo = scan.nextLine();
      if (answerTwo.equalsIgnoreCase("C")) {
        correctAnswer = countingCorrect(correctAnswer); // This is a header
      } else {
        System.out.println("Sorry that is incorrect.");
        System.out.println("The correct answer was C.");
      }

      // Division of integers; It will always return an integer
      System.out.println("\n Question 3: int num1 = 15 and int num2 = 7. What is num1/num2?");
      System.out.println("\tA) 7.5");
      System.out.println("\tB) 8");
      System.out.println("\tC) Error");
      System.out.println("\tD) 7");
      String answerThree = scan.nextLine();
      if (answerThree.equalsIgnoreCase("D")) {
        correctAnswer = countingCorrect(correctAnswer);
      } else {
        System.out.println("Sorry that is incorrect.");
        System.out.println("The correct answer was D.");
      }

      // Smallest built in java type
      System.out.println("\n Question 4: What is the smallest of these built in Java types?");
      System.out.println("\tA) char");
      System.out.println("\tB) int");
      System.out.println("\tC) short");
      System.out.println("\tD) long");
      String answerFour = scan.nextLine();
      if (answerFour.equalsIgnoreCase("C")) {
        correctAnswer = countingCorrect(correctAnswer);
      } else {
        System.out.println("Sorry that is incorrect.");
        System.out.println("The correct answer was C.");
      }

      // Data types that store decimals
      System.out.println("\n Question 5: Which of these data types would you use if you want to store fractional numbers?");
      System.out.println("\tA) Float");
      System.out.println("\tB) Int");
      System.out.println("\tC) Double");
      System.out.println("\tD) Both A and C");
      String answerFive = scan.nextLine();
      if (answerFive.equalsIgnoreCase("D")) {
        correctAnswer = countingCorrect(correctAnswer);
      } else {
        System.out.println("Sorry that is incorrect.");
        System.out.println("The correct answer was D.");
      }

      // Boolean data type
      System.out.println("\n Question 6: Which data type stores true or false values?");
      System.out.println("\tA) String");
      System.out.println("\tB) Boolean");
      System.out.println("\tC) Byte");
      System.out.println("\tD) None of the above");
      String answerSix = scan.nextLine();
      if (answerSix.equalsIgnoreCase("B")) {
        correctAnswer = countingCorrect(correctAnswer/* this is a argument */);
      } else {
        System.out.println("Sorry that is incorrect.");
        System.out.println("The correct answer was B.");
      }

      // Short hand for if-then-else statement
      System.out.println("\n Question 7: What is the shorthand for an if-then-else statement?");
      System.out.println("\tA) !");
      System.out.println("\tB) #");
      System.out.println("\tC) ?");
      System.out.println("\tD) /");
      String answerSeven = scan.nextLine();
      if (answerSeven.equalsIgnoreCase("C")) {
        correctAnswer = countingCorrect(correctAnswer);
      } else {
        System.out.println("Sorry that is incorrect.");
        System.out.println("The correct answer was C.");
      }

      // Defining what a class is
      System.out.println("\n Question 8: A class is?");
      System.out.println("\tA) The start of a program");
      System.out.println("\tB) A location in memory");
      System.out.println("\tC) Code");
      System.out.println("\tD) Both A and C");
      String answerEight = scan.nextLine();
      if (answerEight.equalsIgnoreCase("C")) {
        correctAnswer = countingCorrect(correctAnswer);
      } else {
        System.out.println("Sorry that is incorrect.");
        System.out.println("The correct answer was C.");
      }

      // Assignment operator in java
      System.out.println("\n Question 9: What is the assignment operator in Java?");
      System.out.println("\tA) =");
      System.out.println("\tB) ()");
      System.out.println("\tC) +");
      System.out.println("\tD) ==");
      String answerNine = scan.nextLine();
      if (answerNine.equalsIgnoreCase("A")) {
        correctAnswer = countingCorrect(correctAnswer);
      } else {
        System.out.println("Sorry that is incorrect.");
        System.out.println("The correct answer was A.");
      }

      // User input
      System.out.println("\n Question 10: How do you get user input?");
      System.out.println("\tA) Magic");
      System.out.println("\tB) Scanner");
      System.out.println("\tC) String");
      System.out.println("\tD) int");
      String answerTen = scan.nextLine();
      if (answerTen.equalsIgnoreCase("B")) {
        correctAnswer = countingCorrect(correctAnswer);
      } else {
        System.out.println("Sorry that is incorrect.");
        System.out.println("The correct answer was B.");
      }
      
      //Parts of a method
      System.out.println("\n Question 11: What is not part of a Mehtod?");
      System.out.println("\tA) parameters");
      System.out.println("\tB) body");
      System.out.println("\tC) break");
      System.out.println("\tD) return type");
      String answerEleven = scan.nextLine();
      if (answerEleven.equalsIgnoreCase("C")) {
        correctAnswer = countingCorrect(correctAnswer);
      } else {
        System.out.println("Sorry that is incorrect.");
        System.out.println("The correct answer was C.");
      }
      
      //for loop
      System.out.println("\n Question 12: A for loop is also called a ___ controlled loop.");
      System.out.println("\tA) Event");
      System.out.println("\tB) Count");
      System.out.println("\tC) Sentinel");
      System.out.println("\tD) Condition");
      String answerTwelve = scan.nextLine();
      if (answerTwelve.equalsIgnoreCase("B")) {
        correctAnswer = countingCorrect(correctAnswer);
      } else {
        System.out.println("Sorry that is incorrect.");
        System.out.println("The correct answer was B.");
      }
      
      //for and while loops
      System.out.println("\n Question 13: All while loops can be rewritten as for loops and still work the same.");
      System.out.println("\tA) False");
      System.out.println("\tB) True");
      String answerThirteen = scan.nextLine();
      if (answerThirteen.equalsIgnoreCase("A")) {
        correctAnswer = countingCorrect(correctAnswer);
      } else {
        System.out.println("Sorry that is incorrect.");
        System.out.println("The correct answer was A.");
      }
      
      //method call
      System.out.println("\n Question 14: What is the line that causes the method to run called?");
      System.out.println("\tA) Argument");
      System.out.println("\tB) Header");
      System.out.println("\tC) Modifier");
      System.out.println("\tD) Call");
      String answerFourteen = scan.nextLine();
      if (answerFourteen.equalsIgnoreCase("D")) {
        correctAnswer = countingCorrect(correctAnswer);
      } else {
        System.out.println("Sorry that is incorrect.");
        System.out.println("The correct answer was D.");
      }
      
      //array characteristics
      System.out.println("\n Question 15: An array size can be changed.");
      System.out.println("\tA) True");
      System.out.println("\tB) False");
      String answerFifteen = scan.nextLine();
      if (answerFifteen.equalsIgnoreCase("B")) {
        correctAnswer = countingCorrect(correctAnswer);
      } else {
        System.out.println("Sorry that is incorrect.");
        System.out.println("The correct answer was B.");
      }
      
      //array elements
      System.out.println("\n Question 16: Individuual storage locations within arrays are called ____.");
      System.out.println("\tA) Varibales");
      System.out.println("\tB) Indexes");
      System.out.println("\tC) Elements");
      System.out.println("\tD) Variables");
      String answerSixteen = scan.nextLine();
      if (answerSixteen.equalsIgnoreCase("C")) {
        correctAnswer = countingCorrect(correctAnswer);
      } else {
        System.out.println("Sorry that is incorrect.");
        System.out.println("The correct answer was C.");
      }
      
      //building an array
      System.out.println("\n Question 17: What do you put put the list of elements of an array in?");
      System.out.println("\tA) {}");
      System.out.println("\tB) <>");
      System.out.println("\tC) []");
      System.out.println("\tD) ()");
      String answerSeventeen = scan.nextLine();
      if (answerSeventeen.equalsIgnoreCase("A")) {
        correctAnswer = countingCorrect(correctAnswer);
      } else {
        System.out.println("Sorry that is incorrect.");
        System.out.println("The correct answer was A.");
      }
      
      //Big O notation
      System.out.println("\n Question 18: The order of a linear search is:");
      System.out.println("\tA) O(1)");
      System.out.println("\tB) O(N logN)");
      System.out.println("\tC) O(N)");
      System.out.println("\tD) O(logN)");
      String answerEighteen = scan.nextLine();
      if (answerEighteen.equalsIgnoreCase("C")) {
        correctAnswer = countingCorrect(correctAnswer);
      } else {
        System.out.println("Sorry that is incorrect.");
        System.out.println("The correct answer was C.");
      }
      
      //Big O notation
      System.out.println("\n Question 19: The order of a binary search is:");
      System.out.println("\tA) O(N^2)");
      System.out.println("\tB) O(1)");
      System.out.println("\tC) O(N)");
      System.out.println("\tD) O(log N)");
      String answerNineteen = scan.nextLine();
      if (answerNineteen.equalsIgnoreCase("A")) {
        correctAnswer = countingCorrect(correctAnswer);
      } else {
        System.out.println("Sorry that is incorrect.");
        System.out.println("The correct answer was A.");
      }
      
      //interfaces
      System.out.println("\n Question 20: An interface is like a:");
      System.out.println("\tA) Variable");
      System.out.println("\tB) Dictionary");
      System.out.println("\tC) Blueprint");
      System.out.println("\tD) Contract");
      String answerTwinty = scan.nextLine();
      if (answerTwinty.equalsIgnoreCase("D")) {
        correctAnswer = countingCorrect(correctAnswer);
      } else {
        System.out.println("Sorry that is incorrect.");
        System.out.println("The correct answer was D.");
      }
      System.out.println("\nYou got a score of: " + correctAnswer +"/20");
      
      if (correctAnswer >= 18) {
      System.out.println("\nGreat Job " + userName + "!" );
      } else if (correctAnswer >= 14 && correctAnswer <= 17) {
        System.out.println("\n" + userName + ", it looks like you need to sharpen up your skills.");
      } else if (correctAnswer >= 10 && correctAnswer <= 13) {
        System.out.println("\nSorry " + " you need to study a lot more.");
      } else {
        System.out.println("\nYou should go back and start from the beginning.");
      }
      break;

    case 2:// Outputting the Fibonacci sequence to the N number
      System.out.println(fibNumbers(scan, userName));
      break;

    case 3:// Word Count
      System.out.println("Please enter your text below:");
      String userText = scan.nextLine();
      System.out.println(wordCount(scan, userText));
      break;

    case 4: // math operations (Basic Calulator)
      System.out.println("Which operation would you like to use?");
      System.out.println("\t1) + (Addition)");
      System.out.println("\t2) - (Subtraction)");
      System.out.println("\t3) / (Division)");
      System.out.println("\t4) * (Multiplication)");
      System.out.println("\t5) % (Remainder)");
      int mathOperation = Exceptions.intException(scan);
      
      if (mathOperation >= 1 && mathOperation <= 5) { /*&&(AND) is example of a conditional operator. Another one is || (OR)*/
          System.out.println(mathOperations(scan, mathOperation)); /* Use of a call*/
      } else {
        System.out.println("Invaild Number.");
      } 
      break;
      
    case 5: /*Smallest value in array, sum of values in array, search array and identify index number*/
      System.out.println("Please enter a series of numbers seperated by a comma.");
      String userString = scan.nextLine();

      System.out.println("What would you like me to do with these numbers?");
      System.out.println("\t1) Smallest and Largest Number");
      System.out.println("\t2) Sum of Array");
      System.out.println("\t3) Average of Array");
      System.out.println("\t4) Index Number of a One-Demention Array");
      int arrayChoice = Exceptions.intException(scan);
      System.out.println(doArrayWork(userString, arrayChoice, scan));
      break;
      
    case 6:
      System.out.println("What number are you looking for?");
      System.out.println(twoDIndex());
      break;
      
    default:
      System.out.println("Sorry, that is not an option.");
      break;
    }

    int x = 0;
    do {
      try {
        System.out.println("\nPress any number to go back to main menu and 2 to exit.");
        if (scan.nextInt() == 2) {
          System.out.println("Goodbye " + userName + "!");
          System.exit(2);
        } else {
            program(args, scan, userName);
          }
        x = 1;
      } catch (Exception e) {
          System.out.println("Please enter a number.");
      } 
  } while(x == 0);
 }

  public static short countingCorrect(short correctAnswer/* This is a parameter */) { // This is a header
    System.out.println("Correct!");
    correctAnswer++;
    return correctAnswer;
  }

  public static void userIntro(Scanner scan) {
    userInfo person1 = new userInfo();
    System.out.println("Hello!");
    System.out.println("Let me get some basic information from you:");
    
    System.out.println("\nPlease enter your name!");
    String userName = scan.nextLine();
    person1.setName(userName);
    
    System.out.println("\nHow old are you?");
    int userAge = Exceptions.genericIntException(scan);
    scan.nextLine();
    person1.setAge(userAge);
    
    System.out.println("\nWhat is your Major?");
    String userMajor = scan.nextLine();
    person1.setMajor(userMajor);
    
    System.out.println("\nHow many years have you been learning about Java?");
    int userYears = Exceptions.genericIntException(scan);
    scan.nextLine();
    person1.setjavaYears(userYears);
    
    System.out.println("\nFinally what job do you plan on getting after college?");
    String userJob = scan.nextLine();
    person1.setJob(userJob);
    
    System.out.println("\nWelcome " + userInfo.getName() + "!");
  }
  
  public static void mainMenu() {
    System.out.println("\nPlease enter the number you would like to go to:");
    System.out.println("\t1) Java Test");
    System.out.println("\t2) Fibonacci Sequence To n Number.");
    System.out.println("\t3) Word Count");
    System.out.println("\t4) Basic Calculator");
    System.out.println("\t5) Work With 1D Arrays");
    System.out.println("\t6) Work With 2D Arrays");
  }

  public static String doArrayWork(String userString, int arrayChoice, Scanner scan) {
    String[] userArray = userString.split(","); /*an array*/
    String retVal = "";
    retVal = "You entered: {" + userString + "}";
    switch (arrayChoice) {
    case 1:
      retVal = retVal + "\tLargest number is: " + getLargest(toFloatArray(userArray)) + "\tSmallest number is: "
          + getSmallest(toFloatArray(userArray));
      break;
    case 2:
      retVal = retVal + "\tSum of the Array: " + sumArray(toFloatArray(userArray));
      break;
    case 3:
      retVal = retVal + "\tAverage of the Array: " + sumArray(toFloatArray(userArray)) / (userArray.length);
      break;
    case 4:
      System.out.println("What number are you searching for?");
      float userNumber = scan.nextFloat();
      retVal = retVal + "\t" + findIndex(toFloatArray(userArray), userNumber);
      break;
    default:
      break;
    }
    return retVal;
  }

  public static float[] toFloatArray(String[] array) {
    float[] retVal = new float[array.length];

    for (int i = 0; i <= array.length - 1; i++) { /*for loop*/
      retVal[i] = Float.parseFloat(array[i]);
    }
    return retVal;
  }

  public static float getLargest(float[] floatArray) {
    float retVal = floatArray[0];
    for (int i = 0; i <= floatArray.length - 1; i++) { /*<= is a relational operations. Others include ==, <, >, >=, and !=*/
      if (retVal < floatArray[i]) {
        retVal = floatArray[i];
      }
    }
    return retVal;
  }

  public static float getSmallest(float[] floatArray) {
    float retVal = floatArray[0];
    for (int i = 0; i <= floatArray.length - 1; i++) {
      if (retVal > floatArray[i]) {
        retVal = floatArray[i];
      }
    }
    return retVal;
  }

  public static float sumArray(float[] floatArray) {
    float retVal = 0;
    for (int i = 0; i <= floatArray.length - 1; i++) {
      retVal += floatArray[i];
    }
    return retVal;
  }

  public static String findIndex(float[] floatArray, float userNumber) {
    boolean found = false;
    int idx = 0;
    for (int i = 0; i <= floatArray.length - 1; i++) {
      if (userNumber == floatArray[i] && !found) {
        found = true;
        idx = i;
      }
    }

    if (found) {
      return "The first occurance of your number was found at index " + idx;
    }
    return "Your number was not found";
  }
  
  public static int[][] twoDIndex() {
    Random ran = new Random();
    int[][] twoDArray = new int[10][10]; 
    
    for(int i = 0; i < twoDArray.length; i++) {
      for (int j = 0; j < twoDArray[i].length; j++) {
        twoDArray[i][j] = ran.nextInt(11);
      }
    }
    return twoDArray;
  }
  
  public static String wordCount (Scanner scan, String userText) {
    String retVal = "";
    String[] wordCountArray = userText.split(" ");
    retVal = "The word count is: " + wordCountArray.length + " word(s)";
    return retVal;
  }
  
  public static String fibNumbers (Scanner scan, String userName) {
    System.out.println("How many numbers of the Fibonacci sequence do you want " + userName + "?");
    int topNumber = Exceptions.intException(scan);
    int firstNumber = 0;
    int secondNumber = 1;
    int count = 1;
    String retVal ="";

    if (topNumber == 1) {
      retVal= "0";
    } else if (topNumber == 2) {
      retVal ="0,1";
    } else {
      retVal = "0,1";
      while (count <= (topNumber - 2)) { /*While loop*/
        int fibNumber = firstNumber + secondNumber;
        firstNumber = secondNumber;
        secondNumber = fibNumber;
        retVal = retVal + "," + fibNumber;
        count++;
      }
    }
    return retVal;
  }
  
  public static String mathOperations (Scanner scan, int mathOperation) {
    System.out.println("Please enter your two numbers.");
    double firstDouble = Exceptions.doubleException(scan);
    double secondDouble = Exceptions.doubleException(scan);
    double mathAnswer;
    String retVal = "";
    
    if (mathOperation == 1) {
      mathAnswer = firstDouble + secondDouble;
      retVal = firstDouble + " + " + secondDouble + " = " + mathAnswer;
    } else if (mathOperation == 2) {
      mathAnswer = firstDouble - secondDouble;
      retVal = firstDouble + " - " + secondDouble + " = " + mathAnswer;
    } else if (mathOperation == 3) {
        mathAnswer = firstDouble / secondDouble;
        retVal = firstDouble + " / " + secondDouble + " = " + mathAnswer;
    } else if (mathOperation == 4) {
      mathAnswer = firstDouble * secondDouble;
      retVal = firstDouble + " * " + secondDouble + " = " + mathAnswer;
    } else if (mathOperation == 5) {
      mathAnswer = firstDouble % secondDouble;
      retVal = firstDouble + " % " + secondDouble + " = " + mathAnswer;
      }
    return retVal;
  }
}

class userInfo { /*use of getters and setters*/
  private static String userName;
  private static int userAge;
  private static String userMajor;
  private static int javaYears;
  private static String userJob;
  
  public void setName(String userInput) {
   userInfo.userName = userInput;
    }
  public static String getName() {
    return userName;
  }
  public void setAge(int userInput) {
    userInfo.userAge = userInput;
     }
  public static int getAge() {
    return userAge;
  }
  public void setMajor(String userInput) {
    userInfo.userMajor = userInput;
     }
  public static String getMajor() {
    return userMajor;
  }
  public void setjavaYears(int userInput) {
    userInfo.javaYears = userInput;
     }
  public static int getjavaYears() {
    return javaYears;
  }
  public void setJob(String userInput) {
    userInfo.userJob = userInput;
     }
  public static String getJob() {
    return userJob;
  }
}
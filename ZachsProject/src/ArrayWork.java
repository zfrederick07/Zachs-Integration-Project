import java.util.Scanner;

public class ArrayWork {

  public static void main(String[] args) {//Creates a 2D array with random integers and gives the index of the searched integer
    Scanner scan = new Scanner(System.in);
    int x = 0;
    int userNumber = 0;
    do{
      System.out.println("What integer 0 to 100 are you looking for?");
      userNumber = Exceptions.genericIntException(scan);
      if(userNumber >= 0 && userNumber <= 100) {
        x = 1;
      } else {
        System.out.println("That integer is not between 0 and 100.");
        System.out.println();
      }
    }while(x == 0);
    
    System.out.println();
    
    int[][] twoDArray = new int[10][10];//Creates 2D array with random numbers
    for (int i = 0; i < twoDArray.length; i++) {
      for (int j = 0; j < twoDArray.length; j++){
        twoDArray[i][j] = (int) (Math.random() * 100);  
      }
    }
    for (int i = 0; i < twoDArray.length; i++) {//Shows the 2D array
      for (int j = 0; j < twoDArray.length; j++) {
        System.out.print(twoDArray[i][j] + " ");
      }
      System.out.println();
    }
    
    System.out.println();
    
    boolean found = false;//Searches for the index
    int idxOne = 0;
    int indxTwo = 0;
    for (int i = 0; i <= twoDArray.length - 1; i++) {
      for (int j = 0; j <= twoDArray.length - 1; j++) {
        if (userNumber == twoDArray[i][j] && !found) {
          found = true;
          idxOne = i;
          indxTwo = j;
        } 
      }
    }

    if (found) {
      System.out.println("The first occurance of your number was found at index " + "[" + idxOne + "," + indxTwo + "]");
    } else {
    System.out.println("Your number was not found!");
    }
  }  
}

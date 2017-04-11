import java.util.Scanner;

public class TicTacToe {

  public static void main(String[] args) {
    String[][] ticTacToe = new String[3][3];
    
    for(int i = 0; i < 3; i++) {
      for(int j = 0; j < 3; j++) {
        ticTacToe[i][j] = "-";
        System.out.print("\t" + ticTacToe[i][j]);
      }
      System.out.println();
      System.out.println();
    }
    
  }
  
  public static String userMarker() {
    Scanner scan = new Scanner(System.in);
    System.out.println("What character would you like for your marker?");
    String retVal = scan.nextLine();
    return retVal;
  }
}

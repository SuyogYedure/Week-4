import java.util.Random;
import java.util.Scanner;
public class Guess {
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    Random random=new Random();
    System.out.println("Enter the range");
    int range=s.nextInt();
    int num=random.nextInt(range);
    int count=1;
    while(true) {
      System.out.println("Enter your number");
      int g=s.nextInt();
      if(g==num) {
        System.out.println("Congrats");
        break;
      }
      else if(g<num) {
        System.out.println("your number is less than expected, please try again");
      }
      else {
        System.out.println("your number is grater than expected, please try again");
      }
      count++;
    }
  }
}
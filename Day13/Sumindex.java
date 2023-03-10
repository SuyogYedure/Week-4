import java.util.Scanner;
class Sumindex {
  public static void main(String args[]) {
    Scanner s =new Scanner(System.in);
    int arr[] = {23,35,89,10,70,45};
    System.out.println("Enter number");
    int num=s.nextInt();
    int key = 0, count = 0, indexi = -1, indexj = -1;
    for (int i = 0; i < arr.length; i++) {
      for (int j = i+1; j < arr.length; j++) {
        if (arr[i] + arr[j] == num) {
          indexi = i;
          indexj = j;
          count = count + 1;
        }
      }
      if (count == 1) {
        System.out.println(indexi + " " + indexj);
        System.out.println();
      }
      count = 0;
    }
  }
}
import java.util.Scanner;
class Appendlast{
  public static void main(String args[]){
    int arr[] = {10,45,12,78,63,41,25,89,36};
    int elements = arr.length-1;
    Scanner s = new Scanner(System.in);
    int flag, i=0;
    System.out.println("Enter the number for rotations");
    int n = s.nextInt();

    for(i=0;i<n;i++){
      flag=arr[0];
      for (int j=0; j<elements;j++){
        arr[j] = arr[j+1];
      }
      arr[elements] = flag;
    }
    System.out.println("The new array is: ");
    for(int k=0;k<arr.length;k++){
      System.out.print(arr[k]+" ");
    }
  }
}
import java.util.Scanner;
class Append{
  public static void main(String args[]){
    int arr[] = {23,89,4,45,11,90,44};
    int elements = arr.length-1;
    Scanner s = new Scanner(System.in);
    int flag, i=0;
    System.out.println("Enter   ");
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
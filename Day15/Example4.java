class Ascdsc {
  public static void main(String args[]) {
    int arr[] = { -7,-1,-5,-2,5,2,4,6,9,10 };
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        int flag = 0;
         if(arr[j]<0){
            if (arr[i] < arr[j]) {
               flag = arr[i];
              arr[i] = arr[j];
              arr[j] = flag;
      }
  }
         else{
            if (arr[i] > arr[j]) {
          flag = arr[i];
          arr[i] = arr[j];
          arr[j] = flag;
        }
      }
    }
  }
     System.out.println("After Re-arranging the elements are: ");
       for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]+ " ");
       }
   }
}
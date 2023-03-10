class Frequency{
  public static void main(String args[]){
    String str = "nnmk";
    char ch[] = new char[str.length()];
    for(int i = 0; i<str.length();i++){
      ch[i] = str.charAt(i);
    }
    int count=1,flag=0;
    for (int i=0;i<ch.length;i++){
      count=1;
      flag=1;
      for (int j=i+1;j<ch.length;j++){
        if (ch[i]==ch[j]){
          count++;
          ch[j] = ' ';
        }
        else{
          flag++;
          ch[j] = ' ';
        }
      }
      if (ch[i]!=' ' && count >1){
      System.out.println("Repeated elements in a string is: "+count);
      System.out.println("The number other of elements are: "+flag);
      }
    }
  }
}
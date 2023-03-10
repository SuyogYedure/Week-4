class Reverse {
  public static void main(String args[]) {
    String str = "hi hello welcome to bitLabs";
    String words[]=str.split(" ");
    for(int i=words.length-1;i>=0;i--){
      System.out.print(words[i]+" ");
    }
  }
}
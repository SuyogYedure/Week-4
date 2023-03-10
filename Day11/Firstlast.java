class Firstlast {
  public static void main(String args[]) {
    String str = "hi hello how are you doing";
    String words[] = str.split(" ");
    System.out.println(words[0] + " :  " + words[0].length());
    System.out.println(words[words.length - 1] + "  :  " + words[words.length - 1].length());
  }
}


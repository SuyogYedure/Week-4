class Lastwordlen{
  public static void main(String[] args) {
    String input = "Hello how are you";
    String[] words = input.split(" ");
    int lastwordlen = 0;
    if (words.length > 0) {
      String lastWord = words[words.length - 1];
      lastwordlen= lastWord.length();
      }
    System.out.println("Length of the last word: " + lastwordlen);
  }
}
class Digits {
  public static void main(String args[]) {
    String str = "hi hello 1234 how are$% you890";
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
        System.out.print(str.charAt(i));
      }
    }
  }
}
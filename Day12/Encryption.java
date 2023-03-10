class Encryption {
  public static void main(String args[]) {
    String str = "Hi how are you";
    
     char ch[] = new char[str.length()];
     for (int i = 0; i < str.length(); i++) {
        ch[i] = str.charAt(i);
      }
     String st = " ";
    for (int i = 0; i < ch.length; i++) {
    if (ch[i] != ' ') {
      if (i % 2 == 0) {
        string = string + ch[i];
        }
      }
    }
    for (int i = 0; i < ch.length; i++) {
     if (ch[i] != ' ') {
        if (i % 2 == 1) {
          string = string + ch[i];
        }
     }
  }
     System.out.println("Encrypted String is : " + string);
  }
}
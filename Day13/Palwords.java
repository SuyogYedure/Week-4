class PalindromeWords {
  public static void main(String[] args) {
     String str = "madam and radar";
     String words[] = str.split(" ");
    String palindromes[] = new String[words.length];

    int index = 0;
    int i = 0, j = 0, count = 0;
    for (i = 0, j = word.length() - 1; i < word.length() / 2; i++) {
      if (word.charAt(i) == word.charAt(j)) {
        j--;
        count++;
    }
      else {
        count = 0;
          break;
      }
    }
    if (count > 0) {
      palindromes[index] = word;
      index++;
    }
    for (i = 0; i < words.length; i++) {
      checkPalindrome(words[i]);
    }
    System.out.println("\nPalindrome words in given String are : ");
    for (i = 0; i < index; i++) {
      System.out.println(palindromes[i]);
    }
    String longest = palindromes[0];
    for (i = 0; i < index; i++) {
      if (palindromes[i].length() > longest.length()){
        longest = palindromes[i];
      }
    }
    System.out.println("Longest Palindrome word is : " + longest);
  
  }
}
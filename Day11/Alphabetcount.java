class Alphabetcount{
   public static void main(String[] args){
   String str = "hi HELLO 1234 how are$% you890";
   String words[] = str.split(" ");
     for (int i = 0; i < words.length; i++) {
         String word=words[i];
      System.out.println("Alphabets in word " +word +" are");
      for(int j=0;j<word.length();j++){

        if (word.charAt(j)>='A' && word.charAt(j)<='Z'||word.charAt(j)>='a' && word.charAt(j)<='z') {
           System.out.println(word.charAt(j));
        }
      }
     }
   }
}


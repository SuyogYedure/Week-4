class Longest {
  public static void main(String args[]) {
    String str = "What a Cricket match!";
    String words[]=str.split(" ");
    int wordLength=0,max=0;
    String longestWord=null;
    for(int i=0;i<words.length;i++){
      wordLength=words[i].length();
         if(max<=wordLength){
               max=wordLength;
                 longestWord=words[i];
       }
    }
    System.out.println("Longest word: "+longestWord);
  }
}
class Smallest {
  public static void main(String args[]) {
    String str = "hidgdfgdf hello welcome to bitLabs kjshfkjhhsk";
    String words[]=str.split(" ");
        int wordLength=0;
        String smallestWord=null;
       int min=words[0].length();
         for(int i=0;i<words.length;i++){
          wordLength=words[i].length();
             if(min>=wordLength){
                min=wordLength;
             smallestWord=words[i];
       }
     }
    System.out.println("Smallest word: "+smallestWord);
  }
}
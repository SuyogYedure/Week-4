class Uppercase {
  public static void main(String args[]){
    String str="hi HELLO 1234 how are$% you890";
    for(int i=0;i<str.length();i++){
      if(str.charAt(i)>='A' && str.charAt(i)<='Z'){
        System.out.print(str.charAt(i));
      }
    }
  }
}
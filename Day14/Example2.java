public class Example2 {
  public static void main(String[] args) {
    StringBuffer str=new StringBuffer("welComE 824867 ^$$%^% to BITlABS");
    StringBuffer sb=new StringBuffer();
       for(int i=0;i<str.length();i++) {
         if(str.charAt(i)>='A' && str.charAt(i)<='Z') {
           sb.append((char)(str.charAt(i)+32));
         }
         else if(str.charAt(i)>='a'&& str.charAt(i)<='z') {
           sb.append((char)(str.charAt(i)-32));
         }
         else {
              sb.append(str.charAt(i));
         }
        }
       System.out.println(sb);
  }
}


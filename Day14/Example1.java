public class Example1 {
  public static void main(String[] args) {
    StringBuffer sb=new StringBuffer("hi");
    sb.append("hello");
    System.out.println(sb);
    System.out.println(sb.isEmpty());
    System.out.println(sb.reverse());
    StringBuffer sb1=new StringBuffer("madam");
    if(sb1.equals(sb1.reverse())) {
      System.out.println("palindrome");
    }
  }
}
public class Example4 {
  int a,b;
  public void m1(int a,int b) {
    this.a=a;
    this.b=b;
  }
  public void m2() {
    System.out.println(a);
    System.out.println(b);
  }
  public static void main(String[] args) {
    Example4 obj=new Example4();
    obj.m1(10, 20);
    obj.m2();
  }
}
public class Example5 {
  public static void main(String args[]) {
    Student std=new Student();
    std.setStudent_id(100);
    std.setSname("Nagul");
    std.setEmail("nagul@gmail.com");
    std.setCity("Hyd");
    std.setMobile(9876543210l);
    System.out.println("Student id: "+std.getStudent_id());
    System.out.println("Student name: "+std.getSname());
    System.out.println("Student email: "+std.getEmail());
    System.out.println("Student city: "+std.getCity());
    System.out.println("Student mobile: "+std.getMobile());
  }
}
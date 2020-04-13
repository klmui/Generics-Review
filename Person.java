
public class Person {
  private String name;
  private String school;
  
  public Person(String name, String school) {
    this.name = name;
    this.school = school;
  }
  
  
  public void print() {
    System.out.println(this.name + " is from " + this.school + ".");
  }

}

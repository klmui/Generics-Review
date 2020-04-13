
public class Example3 extends Queue<Person> {

  public Example3() {
    super();
    // Try erasing "<Person>" and peek() will return something of type Object instead of Person
    Person firstPerson = this.peek();
  }
  
}

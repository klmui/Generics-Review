import java.util.ArrayList;

/**
 * Reasons to use generics:
 * 1. Reuse code
 * 2. Type safety - compile time detection vs. runtime detection
 * 
 * @author Kenneth
 *
 */
public class Generics {
  
  /**
   * ArrayLists use generics!
   */
  public static void example1() {
    ArrayList<String> arrList = new ArrayList<String>();
  }
  
  /**
   * Compile time vs. run time
   */
  public static void example2() {
    // Add <Integer> to arrList to turn this into a compile-time error
    ArrayList arrList = new ArrayList();
    
    arrList.add(0);
    arrList.add("1");
    
    System.out.println((String) arrList.get(0));
  }
  
  /**
   * Queue implementation using generics
   */
  public static void example3() {
    // Line of people. Can reuse this code since it uses generics.
    Queue<Person> queue = new Queue<Person>();

  }
  
  /**
   * Methods can also use generics
   * 
   * @param <T>
   * @param <U>
   */
  public static <T, U> void example4(T arg1, U arg2) {
    System.out.println("arg1: " + arg1.getClass().getName());
    System.out.println("arg2: " + arg2.getClass().getName());
  }
  
  public static void main(String[] args) {
    example2();
    example4(1, "Hello");
  }
  
}

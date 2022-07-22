/**
 * javadoc should be given here.
 */
public class App {
  /**
   * javadoc should be given here.
   */
  public static void main(String[] args) {
    GradeConverter converter = new GradeConverter();

    for (int i = 0; i < 105; i++) {
      System.out.println(i + ";" + converter.convert(i));
    }
  }
}
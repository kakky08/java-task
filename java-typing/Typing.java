import java.util.ArrayList;

public class Typing {
  public static void main(String[] args) {
    ArrayList<String> dataset = new ArrayList<String>();
    dataset.add("test");
    dataset.add("test2");
    dataset.add("test3");

    for (String s : dataset) {
      System.out.println(s);
    }
  }
}

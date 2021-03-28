// <if文> 課題1

public class Task01 {
  public static void main(String[] args) {
    keisan(90, 70);

  }

  public static void keisan(int kokugo, int sugaku) {
    int sum = kokugo + sugaku;
    if (sum >= 160 && kokugo > 40 && sugaku > 40) {
      System.out.println("優");
    } else if (sum >= 140 && kokugo > 40 && sugaku > 40) {
      System.out.println("良");
    } else if (sum >= 100 && kokugo > 40 && sugaku > 40) {
      System.out.println("可");
    } else if (sum < 100 || kokugo < 40 || sugaku < 40) {
      System.out.println("追試");
    }
  }
}

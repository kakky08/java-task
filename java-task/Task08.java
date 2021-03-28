// <繰り返し> 課題4
public class Task08 {

  public static void main(String[] args) {
    for (int i = 1; i <= 9; i++) {
      for (int k = 1; k <= 9; k++) {
        int sub = (5 - i);
        int mas = Math.abs(sub);
        int cal = (9 - (mas - 1));

        if (i <= 5) {
          if (k < cal && k > mas) {
            System.out.print("■");
          } else {
            System.out.print("◇");
          }
        } else if (i > 5) {
          if (k < cal && k > mas) {
            System.out.print("■");
          } else {
            System.out.print("◇");
          }
        }
      }
      System.out.println("");
    }
  }
}

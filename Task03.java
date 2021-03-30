// <if文> 課題2-2
public class Task03 {
  public static void main(String[] args) {

    double number = 2;
    double code = Math.signum(number);
    if (number % 2 == 0 && code == 1 || code == 0) {
      System.out.println("正の偶数");
    } else if (number % 2 == 0 && code == -1) {
      System.out.println("負の偶数");
    } else if (number % 2 != 0 && code == 1) {
      System.out.println("正の奇数");
    } else if (number % 2 != 0 && code == -1) {
      System.out.println("負の奇数");
    }
  }
}

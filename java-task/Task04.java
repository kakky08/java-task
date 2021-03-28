// <if文> 課題3

public class Task04 {
  public static void main(String[] args) {
    // BMI(体重(kg),身長(cm))
    BMI(80, 160);
  }

  public static void BMI(float weight, float height) {

    float bmi = weight / (height / 100) / (height / 100);
    if (bmi < 18.5) {
      System.out.println("やせ");
    } else if (bmi >= 18.5 && bmi <= 24.9) {
      System.out.println("標準");
    } else if (bmi >= 25 && bmi < 30) {
      System.out.println("肥満");
    } else if (bmi >= 30) {
      System.out.println("高度肥満");
    }
  }

}

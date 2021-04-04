package Class;

import java.util.Random;

/*== おみくじの結果を設定 ==*/
public class Omikuzi {
  public static int CPUHand(int i) {
    /*
     * Random random = new Random(); int rand = random.nextInt(12) + 1;
     */
    if (i == 1) {
      Panel.contentsLabel.setText("大吉");
    } else if (i >= 3) {
      Panel.contentsLabel.setText("中吉");
    } else if (i >= 6) {
      Panel.contentsLabel.setText("小吉");
    } else if (i >= 9) {
      Panel.contentsLabel.setText("吉");
    } else if (i >= 11) {
      Panel.contentsLabel.setText("凶");
    } else {
      Panel.contentsLabel.setText("大凶");
    }
    return (i);
  }
}

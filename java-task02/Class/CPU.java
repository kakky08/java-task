package Class;

import java.util.Random;

/*== CPUのジャンケンの手を設定 ==*/
public class CPU {
  public static int CPUHand() {
    Random random = new Random();
    int rand = random.nextInt(3) + 1;
    if (rand == 1) {
      Panel.contentsLabel.setText("グー");
    } else if (rand == 2) {
      Panel.contentsLabel.setText("チョキ");
    } else if (rand == 3) {
      Panel.contentsLabel.setText("パー");
    }
    return (rand);
  }
}

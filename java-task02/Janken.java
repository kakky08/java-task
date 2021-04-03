import Class.*;

import javax.swing.JFrame;

public class Janken {
  public static void main(String[] args) {
    // ウィンドウの表示
    JFrame frame = new JFrame("じゃんけんゲーム");
    frame.setVisible(true);// ウィンドウ表示
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// 閉じるボタンの処理
    frame.setSize(400, 300);// ウィンドウサイズ
    frame.setLocationRelativeTo(null);// 画面中央に配置
    frame.setResizable(false);// リサイズ禁止
    Panel.createPanel(frame);
  }
}

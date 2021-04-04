package Class;

import javax.swing.JFrame;
import javax.swing.JPanel;

import javax.swing.JLabel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

public class Panel {
  public static JLabel contentsLabel;
  public static JLabel resultLabel;;

  public static void createPanel(JFrame frame) {

    /* == じゃんけんの結果表示用パネル == */
    // 画面のカラーとサイズの設定
    Dimension result = new Dimension(400, 50);
    JPanel resultPanel = setPanel(Color.WHITE, result);

    // 画面内のフォントの設定
    resultLabel = new JLabel("");
    resultLabel = setFont(Color.BLACK, resultLabel, 16);

    // 設定を代入
    resultPanel.add(resultLabel);

    // パネルの位置を設定
    frame.add(resultPanel, BorderLayout.NORTH);

    /* == cpuのテキスト表示用パネル == */
    // 画面のカラーとサイズの設定
    Dimension cpuPanel = new Dimension(400, 200);
    JPanel contentsPanel = setPanel(Color.WHITE, cpuPanel);

    // 画面内のフォント設定
    contentsLabel = new JLabel("じゃんけん・・・");
    contentsLabel = setFont(Color.BLACK, contentsLabel, 20);

    // 設定を代入
    contentsPanel.add(contentsLabel);

    // おみくじボタンを代入
    Player.createOmikujiButton(contentsPanel);
    Player.OmikujiBool(false);

    // パネルの位置を設定
    frame.add(contentsPanel, BorderLayout.CENTER);

    /* == ボタン用のパネル == */
    // 画面のカラーとサイズの設定
    Dimension player = new Dimension(400, 50);
    JPanel playerPanel = setPanel(Color.WHITE, player);

    // ジャンケンボタンを代入
    Player.createButton(playerPanel);
    Player.end(true);

    // パネルの位置を設定
    frame.add(playerPanel, BorderLayout.SOUTH);

  }

  // パネルの共通の設定値
  public static JPanel setPanel(Color color, Dimension PanelDimension) {
    JPanel panel = new JPanel();
    panel.setPreferredSize(PanelDimension);
    panel.setLayout(new BorderLayout());
    panel.setBackground(color);
    return (panel);
  }

  // パネル内の文字の共通の設定値
  public static JLabel setFont(Color clr, JLabel label, int strSize) {
    label.setForeground(clr);
    Font labelFont = new Font("MS ゴシック", Font.PLAIN, strSize);
    label.setFont(labelFont);
    label.setHorizontalAlignment(JLabel.CENTER);
    label.setVerticalAlignment(JLabel.CENTER);
    return (label);
  }

}

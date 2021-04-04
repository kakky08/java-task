package Class;

import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.Random;

public class Player implements ActionListener {
  private static int count = 0;
  private static int count2 = 0;
  public static Boolean bool = false;
  // (おみくじ)ボタンの変数設定
  public static JButton omikuji;
  // (グー)ボタンの変数設定
  public static JButton rock;
  // (チョキ)ボタンの変数設定
  public static JButton scissors;
  // (パー)ボタンの変数設定
  public static JButton paper;

  /* == ボタンの作成 == */
  public static void createButton(JPanel playerPanel) {
    // (グー)ボタン
    rock = new JButton("グー");
    rock = setButton(rock);
    playerPanel.add(rock, BorderLayout.WEST);
    // (チョキ)ボタン
    scissors = new JButton("チョキ");
    scissors = setButton(scissors);
    playerPanel.add(scissors, BorderLayout.CENTER);
    // (パー)ボタン
    paper = new JButton("パー");
    paper = setButton(paper);
    playerPanel.add(paper, BorderLayout.EAST);

  }

  /* == ボタンの配置,各種設定 == */
  public static JButton setButton(JButton button) {
    int buttonWidth = (400 - 10) / 3;
    Dimension buttonDimension = new Dimension(buttonWidth, 50);
    button.setPreferredSize(buttonDimension);
    Font buttonFont = new Font("MSゴシック", Font.PLAIN, 16);
    button.setFont(buttonFont);
    Player player = new Player();
    button.addActionListener(player);
    return (button);
  }

  /* == おみくじボタンの作成 == */
  public static void createOmikujiButton(JPanel contentsPanel) {
    // (おみくじ)ボタン
    omikuji = new JButton("おみくじを引く");
    omikuji = setOmikujiButton(omikuji);
    contentsPanel.add(omikuji, BorderLayout.SOUTH);
    /*
     * // ボタンの表示・非表示 omikuji.setEnabled(bool);
     */
  }

  public static void OmikujiBool(Boolean bool) {
    omikuji.setEnabled(bool);
  }

  public static void end(Boolean bool) {
    rock.setEnabled(bool);
    scissors.setEnabled(bool);
    paper.setEnabled(bool);
  }

  /* == おみくじボタンの配置、各種設定 == */
  public static JButton setOmikujiButton(JButton omikujiButton) {
    int buttonWidth = 130;
    Dimension omikujiButtonDimension = new Dimension(buttonWidth, 50);
    omikujiButton.setPreferredSize(omikujiButtonDimension);
    Font omikujiButtonFont = new Font("MSゴシック", Font.PLAIN, 16);
    omikujiButton.setFont(omikujiButtonFont);
    Player player = new Player();
    omikujiButton.addActionListener(player);
    return (omikujiButton);
  }

  /* == ジャンケンボタンを押した際の設定 == */
  public void actionPerformed(ActionEvent e) {
    String command = e.getActionCommand();
    int playerHand = 0;
    int omikuziResult = 0;
    if (command.equals("グー")) {
      playerHand = 1;
    } else if (command.equals("チョキ")) {
      playerHand = 2;
    } else if (command.equals("パー")) {
      playerHand = 3;
    } else if (command.equals("おみくじを引く")) {
      omikuziResult = 1;
    }

    int playerHandTemp = playerHand;
    playerHandTemp++;
    int computer = CPU.CPUHand();

    // ジャンケンの結果を管理
    if (playerHand == computer) {
      Panel.resultLabel.setText("あいこ");
    } else if ((playerHand == 3 && computer == 1) || (playerHandTemp == computer)) {
      count += 1;
      Panel.resultLabel.setText("勝ち :" + count + "回目の勝利");
      if (count == 3) {
        Player.OmikujiBool(true);
        count = 0;
      }
    } else {
      count2 += 1;
      Panel.resultLabel.setText("負け :" + count2 + "回目の負け");
      /* == ３回負けたらゲーム終了 == */
      if (count2 == 3) {
        Player.end(false);
        Panel.resultLabel.setText("Game Over");
      }
    }

    /* == 3回勝ったらおみくじが引ける == */
    if (omikuziResult == 1) {
      Random ran = new Random();
      int ra = ran.nextInt(12) + 1;
      Omikuzi.CPUHand(ra);
      Panel.resultLabel.setText("おみくじの結果は・・・");
      Player.OmikujiBool(false);
      omikuziResult = 0;
    }
  }
}

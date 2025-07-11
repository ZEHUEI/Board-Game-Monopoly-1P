package main;

import javax.swing.*;

public class Main {
    public static void main(String[] args){
        JFrame window = new JFrame();

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);

        ImageIcon logo = new ImageIcon(".//res//logo.png");
        window.setTitle("NETGRID");

        GamePanel gamePanel = new GamePanel();
        window.add(gamePanel);

        window.setIconImage(logo.getImage());

        window.pack();

        window.setLocationRelativeTo(null);
        window.setVisible(true);

        //rin game
        gamePanel.setupGame();

        gamePanel.startGameThread();
    }
}

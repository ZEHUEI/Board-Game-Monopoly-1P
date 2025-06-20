package Main;

import javax.swing.*;

public class Main {
    public static void main(String[] args){
        JFrame window = new JFrame();

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
//declare logo from resource folder
        ImageIcon logo = new ImageIcon(".//res//logo.png");
        window.setTitle("JUST A PROGRAM");

        GamePanel gamePanel = new GamePanel();
        window.add(gamePanel);
        //set the icon
        window.setIconImage(logo.getImage());

        window.pack();

        window.setLocationRelativeTo(null);
        window.setVisible(true);

        //rin game
        gamePanel.setupGame();

        gamePanel.startGameThread();
    }
}

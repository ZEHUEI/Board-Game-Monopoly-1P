package Main;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel implements Runnable {

    //screen settings
    final int originalTilesSize = 16;
    final int scale = 3;

    Thread gameThread;

    public int tileSize = originalTilesSize * scale;//48x48px
    public int maxScreenColumn = 30;
    public int maxScreenRow = 20;
    //map has to be 31px in column X 17px in row game in 1488x1080 change if want as got some problem #fixed 13/4/2025
    public int screenWidth = tileSize * maxScreenColumn;
    public int screenHeight = tileSize * maxScreenRow;

    //world map parameters change this if want too!!!
    public final int maxWorldCol = 95;
    public final int maxWorldRow = 50;

    //FPS
    int FPS = 120;


    //Game state
    public int gameState;
    public final int titleState = 0;
    public final int playState = 1;
    public final int pauseState = 2;
    public final int dialogueState = 3;


    public GamePanel() {

        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setBackground(Color.BLACK);
        this.setDoubleBuffered(true);
        this.setFocusable(true);
    }

    public void setupGame() {
//            asset.setObject();
//            asset.setNPC();
//            asset.setMonster();
//        playMusic(0);

        gameState = titleState;
    }

    public void startGameThread() {
        gameThread = new Thread(this);
        gameThread.start();
    }

    public void run() {
        double drawingInterval = 1000000000 / FPS;
        double delta = 0;
        long lastTime = System.nanoTime();
        long currentTime;

        while (gameThread != null) {

            currentTime = System.nanoTime();

            delta += (currentTime - lastTime) / drawingInterval;
            lastTime = currentTime;

            if (delta >= 1) {
                update();

                repaint();

                delta--;
            }

        }
    }

    public void update() {

    }
}

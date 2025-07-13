package main;

import Player.Player;
import Player.Dice;
import Tile.TileManager;

import javax.swing.JPanel;
import java.awt.*;

public class GamePanel extends JPanel implements Runnable{

    public int originalTileSize = 16;
    // if cannot see the whole then change this
    public int scale =3;

    public int FPS = 120;
    public int tileSize = originalTileSize * scale;
    //wdith is 1440 and height is 960
    public int maxScreenCol = 30;
    public int maxScreenRow = 20;

    public final int maxWorldCol = 30;
    public final int maxWorldRow = 20;

    public int screenWidth = tileSize * maxScreenCol;
    public int screenHeight = tileSize * maxScreenRow;

    Keybinds keyH = new Keybinds(this);
    Thread gameThread;
    public Player player = new Player(this,keyH);
    public Dice dice = new Dice(this,keyH);
    public UI ui = new UI(this);
    public EventHandler eHandler = new EventHandler(this);
    public TileManager tileM = new TileManager(this);


    public GamePanel(){

        this.setPreferredSize(new Dimension(screenWidth,screenHeight));
        this.setBackground(Color.BLACK);
        this.setDoubleBuffered(true);
        this.addKeyListener(keyH);
        this.setFocusable(true);
        //debug
        System.out.println("screen width is " + screenWidth + "height" + screenHeight);
    }

    public void setupGame() {
    }

    public void startGameThread() {
        gameThread = new Thread(this);
        gameThread.start();

    }

    @Override
    public void run() {
        double drawingInterval = 1000000000/FPS;
        double delta = 0;
        long lastTime = System.nanoTime();
        long currentTime;

        while (gameThread != null) {

            currentTime = System.nanoTime();

            delta +=(currentTime - lastTime) / drawingInterval;
            lastTime = currentTime;

            if(delta >=1)
            {
                update();

                repaint();

                delta--;
            }

        }
    }

    public void update(){
        player.update();
        dice.update();
        keyH.update();
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D)g;

        tileM.draw(g2);
        dice.draw(g2);
        player.draw(g2);
        ui.draw(g2);

        g2.dispose();
    }
}

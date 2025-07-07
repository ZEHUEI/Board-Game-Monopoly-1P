package main;

import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.util.Random;
import Player.Entity;
import Player.Player;

public class Keybinds implements KeyListener {
    GamePanel gp;
    public boolean up, down, left, right, enter;
    boolean checkdrawTime = false;

    public Keybinds(GamePanel gp) {
        this.gp = gp;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        Random rand = new Random();
        int code = e.getKeyCode();
        //play state
        if (code == KeyEvent.VK_ENTER) {
            int dice = rand.nextInt(6) + 1;
            System.out.println(dice);
            gp.player.startMove(dice);
        }
    }


    @Override
    public void keyReleased(KeyEvent e) {
        int code = e.getKeyCode();
        if(code == KeyEvent.VK_ENTER)
        {
            up = false;
        }
        if(code == KeyEvent.VK_ENTER)
        {
            left = false;
        }
        if(code == KeyEvent.VK_ENTER)
        {
            down = false;
        }
        if(code == KeyEvent.VK_ENTER)
        {
            right = false;
        }

    }
}

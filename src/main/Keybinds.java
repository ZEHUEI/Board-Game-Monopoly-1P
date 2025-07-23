package main;

import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.util.Random;

public class Keybinds implements KeyListener {
    GamePanel gp;
    public boolean up, down, left, right, enter;
    public int locked = 0;
    public boolean enterLocked = false;
    public int dice;

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
        if(gp.gamestate == gp.playstate){
            if (code == KeyEvent.VK_ENTER) {
//            dice = rand.nextInt(6) + 1;
                dice = 3;
                System.out.println(dice);
                gp.dice.startSpin(dice);

                enterLocked = true;
                locked = 90;
                if (gp.ui.showConditionWindow && enter) {
                    gp.ui.showConditionWindow = false;
                }
            }
        }
    }


    @Override
    public void keyReleased(KeyEvent e) {
        int code = e.getKeyCode();
        if(code == KeyEvent.VK_ENTER)
        {
            up = false;
            enter = true;
        }
        if(code == KeyEvent.VK_ENTER)
        {
            left = false;
            enter = true;
        }
        if(code == KeyEvent.VK_ENTER)
        {
            down = false;
            enter = true;
        }
        if(code == KeyEvent.VK_ENTER)
        {
            right = false;
            enter = true;
        }

    }
    public void update() {
        if (enterLocked) {
            locked--;
            if (locked <= 0) {
                enterLocked = false;
            }
        }
    }

}

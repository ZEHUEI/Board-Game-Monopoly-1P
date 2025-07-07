package main;

import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class Keybinds implements KeyListener {
    GamePanel gp;
    public boolean up, down, left, right,enter;
    boolean checkdrawTime = false;

    public Keybinds(GamePanel gp)
    {
        this.gp =gp;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        //play state

            if (code == KeyEvent.VK_W) {
                up = true;
            }
            if (code == KeyEvent.VK_A) {
                left = true;
            }
            if (code == KeyEvent.VK_S) {
                down = true;
            }
            if (code == KeyEvent.VK_D) {
                right = true;
            }
            if (code == KeyEvent.VK_ENTER) {
                enter = true;
            }

            if (code == KeyEvent.VK_T) {
                if (checkdrawTime == false) {
                    checkdrawTime = true;
                } else if (checkdrawTime == true) {
                    checkdrawTime = false;
                }
            }

        }


    @Override
    public void keyReleased(KeyEvent e) {
        int code = e.getKeyCode();
        if(code == KeyEvent.VK_W)
        {
            up = false;
        }
        if(code == KeyEvent.VK_A)
        {
            left = false;
        }
        if(code == KeyEvent.VK_S)
        {
            down = false;
        }
        if(code == KeyEvent.VK_D)
        {
            right = false;
        }

    }
}

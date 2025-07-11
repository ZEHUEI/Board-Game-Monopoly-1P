package Player;

import main.GamePanel;
//i think this one dont need alr cause dice initiate then change this
import main.Keybinds;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Random;

public class Dice extends Entity {

    GamePanel gp;
    Keybinds keyH;

    boolean isSpinning = false;
    int spinCounter =0;
    int finalface =1;
    int diceStepsLeft = 0;

    //delay
    boolean delayMove = false;
    int delay = 0;


    public Dice(GamePanel gp, Keybinds keyH) {
        this.gp = gp;
        this.keyH = keyH;

        setDefaultValues();
        getDiceImage();
    }

    public void setDefaultValues() {

        x = gp.tileSize * 13+  gp.screenWidth / 2;
        y = (gp.tileSize * 5) + gp.screenHeight / 2;
    }

    public void getDiceImage() {

        one = setup("/Dice/1", gp.tileSize, gp.tileSize );
        two = setup("/Dice/2", gp.tileSize, gp.tileSize );
        three = setup("/Dice/3", gp.tileSize, gp.tileSize );
        four = setup("/Dice/4", gp.tileSize, gp.tileSize );
        five = setup("/Dice/5", gp.tileSize , gp.tileSize );
        six = setup("/Dice/6", gp.tileSize, gp.tileSize );

    }
    public void startSpin(int steps) {
        this.diceStepsLeft = steps;
        isSpinning =true;
        spinCounter =0;
        finalface = new Random().nextInt(6)+1;
        delay = steps;
    }

    public void update() {
        if (isSpinning) {
            spinCounter++;
            if (spinCounter % 5 == 0) {
                spriteNum = (spriteNum % 6) + 1;
            }
            if (spinCounter >= 30) {
                spriteNum = finalface;
                isSpinning = false;
                delayMove = true;
                delay =0;
            }
        }
        //so after it runs the dice and stops
        //add delay finish dice -> move player
        else if(delayMove){
            delay++;
            if(delay >= 100){
                gp.player.startMove(diceStepsLeft);
                delayMove = false;

            }
        }
    }
    public void draw(Graphics2D g2) {

        BufferedImage image = null;

                if (spriteNum == 1) {image = one;}
                else if (spriteNum == 2) {image = two;}
                else if (spriteNum == 3) {image = three;}
                else if (spriteNum == 4) {image = four;}
                else if (spriteNum == 5) {image = five;}
                else if (spriteNum == 6) {image = six;}

        spriteCounter++;
        if (spriteCounter > 10) {
            if (spriteNum == 1) {
                spriteNum = 2;
            } else if (spriteNum == 2) {
                spriteNum = 3;
            }else if (spriteNum == 3) {
                spriteNum = 4;
            }else if (spriteNum == 4) {
                spriteNum = 5;
            }else if (spriteNum == 5) {
                spriteNum = 6;
            }
            spriteCounter = 0;
        }

        g2.drawImage(image, x , y ,gp.tileSize,gp.tileSize, null);
    }
}


//debug text
//        g2.setFont(new Font("Arial",Font.PLAIN,26));
//        g2.setColor(Color.WHITE);
//        g2.drawString("iframe:" + iframecounter,10,400);
//        player size debugg
//        g2.setColor(Color.RED);
//        g2.drawRect(screenX + solidarea.x ,screenY + solidarea.y , solidarea.width,solidarea.height );
//        }
//    }
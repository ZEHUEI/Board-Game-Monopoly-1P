package Player;

import main.GamePanel;
import main.Keybinds;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Player extends Entity {

    GamePanel gp;
    Keybinds keyH;

    String[] path = {"left", "up", "right", "down"};
    int[] stepsPerDir = {21, 17, 22, 17};

    int pathIndex = 0;
    int stepsTaken = 0;
    int diceStepsLeft = 0;


    public Player(GamePanel gp, Keybinds keyH) {
        this.gp = gp;
        this.keyH = keyH;

        setDefaultValues();
        getPlayerImage();
    }

    public void setDefaultValues() {

        x = gp.tileSize * 8 +  gp.screenWidth / 2;
        y = (gp.tileSize * 8) + gp.screenHeight / 2;
        speed = 2;
        direction = "left";
    }

    public void getPlayerImage() {

        GD1 = setup("/Player/GD1", gp.tileSize, gp.tileSize);
        GD2 = setup("/Player/GD2", gp.tileSize, gp.tileSize);
        GL1 = setup("/Player/GL1", gp.tileSize, gp.tileSize);
        GL2 = setup("/Player/GL2", gp.tileSize, gp.tileSize);
        GR1 = setup("/Player/GR1", gp.tileSize, gp.tileSize);
        GR2 = setup("/Player/GR2", gp.tileSize, gp.tileSize);
        GU1 = setup("/Player/GU1", gp.tileSize, gp.tileSize);
        GU2 = setup("/Player/GU2", gp.tileSize, gp.tileSize);

    }
    public void startMove(int steps) {
        this.diceStepsLeft = steps;
    }

public void update() {
    if (diceStepsLeft > 0) {
        if (direction.equals("left")) {
            x -= speed;
        } else if (direction.equals("right")) {
            x += speed;
        } else if (direction.equals("up")) {
            y -= speed;
        } else if (direction.equals("down")) {
            y += speed;
        }

        // Check if player has completed 1 tile
        if (x % gp.tileSize == 0 && y % gp.tileSize == 0) {
            stepsTaken++;
            diceStepsLeft--;

            if (stepsTaken >= stepsPerDir[pathIndex]) {
                // Change direction
                pathIndex = (pathIndex + 1) % path.length;
                direction = path[pathIndex];
                stepsTaken = 0;
            }
        }
    }
}
    public void draw(Graphics2D g2) {

        BufferedImage image = null;

        switch (direction) {
            case "up":
                if (spriteNum == 1) {
                    image = GU1;
                }
                if (spriteNum == 2) {
                    image = GU2;
                }
                break;
            case "down":
                if (spriteNum == 1) {
                    image = GD1;
                }
                if (spriteNum == 2) {
                    image = GD2;
                }
                break;
            case "left":
                if (spriteNum == 1) {
                    image = GL1;
                }
                if (spriteNum == 2) {
                    image = GL2;
                }
                break;
            case "right":
                if (spriteNum == 1) {
                    image = GR1;
                }
                if (spriteNum == 2) {
                    image = GR2;
                }
                break;
        }
        spriteCounter++;
        if (spriteCounter > 10) {
            if (spriteNum == 1) {
                spriteNum = 2;
            } else if (spriteNum == 2) {
                spriteNum = 1;
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
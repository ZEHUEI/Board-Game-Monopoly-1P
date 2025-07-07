package Player;

import main.GamePanel;
import main.Keybinds;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Player extends Entity {

    GamePanel gp;
    Keybinds keyH;

    public Player(GamePanel gp, Keybinds keyH) {
        this.gp = gp;

        this.keyH = keyH;

//        solidarea = new Rectangle();
//        solidarea.x =9;
//        solidarea.y=21;
//        solidAreaDefaultX = solidarea.x;
//        solidAreaDefaultY = solidarea.y;
//        solidarea.width =30;
//        solidarea.height =27;
//
//        //atk area
//        atkarea.width = 36;
//        atkarea.height = 36;

        setDefaultValues();
        getPlayerImage();
    }

    public void setDefaultValues() {

        x = gp.tileSize * 7 +  gp.screenWidth / 2;
        y = (gp.tileSize * 8) + gp.screenHeight / 2;
        speed = 4;
        direction = "left";
        worldX = gp.maxScreenCol / 2;
        worldY = gp.maxScreenCol / 2;
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

    public void update() {
//        if(keyH.up == true|| keyH.down == true|| keyH.left == true ||
//                keyH.right == true || keyH.enter == true){
        if (keyH.up == true) {
            direction = "up";
            y -= speed;
        } else if (keyH.down == true) {
            direction = "down";
            y += speed;
        } else if (keyH.left == true) {
            direction = "left";
            x -= speed;
        } else if (keyH.right == true) {
            direction = "right";
            x += speed;
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

        g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1f));
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
//
//        BufferedImage image = null;
//        int tempScreenX = screenX;
//        int tempScreenY = screenY;
//
//        switch(direction){
//            case "up":
//                if(attacking == false){
//                    if(spriteNum == 1){image =up1;}
//                    if(spriteNum == 2) {image = up2;}
//                }
//                if(attacking == true)
//                {
//                    tempScreenY = screenY - gp.tileSize;
//                    if(spriteNum == 1){image =atkup1;}
//                    if(spriteNum == 2) {image = atkup2;}
//                }
//                break;
//            case "down":
//                if(attacking == false) {
//                    if (spriteNum == 1) {image = down1;}
//                    if (spriteNum == 2) {image = down2;}
//                }
//                if(attacking == true)
//                {
//                    if(spriteNum == 1){image =atkdown1;}
//                    if(spriteNum == 2) {image = atkdown2;}
//                }
//                break;
//            case "left":
//                if(attacking == false) {
//                    if (spriteNum == 1) {image = left1;}
//                    if (spriteNum == 2) {image = left2;}
//                }
//                if(attacking == true)
//                {
//                    tempScreenX = screenX - gp.tileSize;
//                    if(spriteNum == 1){image =atkL1;}
//                    if(spriteNum == 2) {image = atkL2;}
//                }
//                break;
//            case "right":
//                if(attacking == false) {
//                    if (spriteNum == 1) {image = right1;}
//                    if (spriteNum == 2) {image = right2;}
//                }
//                if(attacking == true)
//                {
//                    if(spriteNum == 1){image =atkR1;}
//                    if(spriteNum == 2) {image = atkR2;}
//                }
//                break;
//
//        }
//        if(iframe == true)
//        {
//            g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.3f));
//        }
//
//        g2.drawImage(image,tempScreenX,tempScreenY,null);
//
//        g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1f));
//
//
//
//
//        //debug text
////        g2.setFont(new Font("Arial",Font.PLAIN,26));
////        g2.setColor(Color.WHITE);
////        g2.drawString("iframe:" + iframecounter,10,400);
////        player size debugg
//        g2.setColor(Color.RED);
//        g2.drawRect(screenX + solidarea.x ,screenY + solidarea.y , solidarea.width,solidarea.height );
//    }

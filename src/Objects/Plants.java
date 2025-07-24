package Objects;

import Player.Entity;
import main.GamePanel;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Random;

public class Plants extends Entity {
    BufferedImage set = null;

    public Plants(GamePanel gp){
        super(gp);
        name ="Plants";
        P1 = setup("/Object/P1",gp.tileSize,gp.tileSize);
        P2 = setup("/Object/P2",gp.tileSize,gp.tileSize);
        P3 = setup("/Object/P3",gp.tileSize,gp.tileSize);
        P4 = setup("/Object/P4",gp.tileSize,gp.tileSize);
        P5 = setup("/Object/P5",gp.tileSize,gp.tileSize);
        P6 = setup("/Object/P6",gp.tileSize,gp.tileSize);
        P7 = setup("/Object/P7",gp.tileSize,gp.tileSize);
        P8 = setup("/Object/P8",gp.tileSize,gp.tileSize);
        P9 = setup("/Object/P9",gp.tileSize,gp.tileSize);
        P10 = setup("/Object/P10",gp.tileSize,gp.tileSize);

        int digit = new Random().nextInt(10) + 1;
        switch(digit){
            case 1: set = P1;
            break;
            case 2: set = P2;
                break;
            case 3: set = P3;
                break;
            case 4: set = P4;
                break;
            case 5: set = P5;
                break;
            case 6: set = P6;
                break;
            case 7: set = P7;
                break;
            case 8: set = P8;
                break;
            case 9: set = P9;
                break;
            case 10: set = P10;
                break;
        }

    }

    @Override
    public void draw(Graphics2D g2){
        if(set != null){
            g2.drawImage(set,x,y,null);
        }
    }
}

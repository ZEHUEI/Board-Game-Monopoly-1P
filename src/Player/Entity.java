package Player;

import main.GamePanel;
import main.UtilityTool;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Entity {
    protected GamePanel gp;
    public int x,y,speed,life,maxlife;
    //player animation
    public BufferedImage GD1,GD2,GL1,GL2,GR1,GR2,GU1,GU2;
    public String direction, name;
    //dice animation
    public BufferedImage one, two, three, four, five,six;
    public int spriteCounter = 0;
    public int spriteNum = 1;
    public static BufferedImage image;
    public static BufferedImage image2;

    //random plants
    public BufferedImage P1, P2, P3, P4, P5,P6,P7,P8,P9,P10;

    public Entity(GamePanel gp) {
        this.gp = gp;
    }

    public BufferedImage setup(String imagePath,int width,int height)
    {
        UtilityTool uTool = new UtilityTool();
        BufferedImage image = null;

        try{
            image = ImageIO.read(getClass().getResourceAsStream(imagePath + ".png"));
            image= uTool.scaleImage(image, width, height);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return image;
    }

    public void draw(Graphics2D g2) {
        g2.drawImage(image,x, y, null);
    }

}

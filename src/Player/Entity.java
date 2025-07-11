package Player;

import main.UtilityTool;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Entity {
    public int worldX , worldY;
    public int x,y,speed;
    //player animation
    public BufferedImage GD1,GD2,GL1,GL2,GR1,GR2,GU1,GU2;
    public String direction;
    //dice animation
    public BufferedImage one, two, three, four, five,six;

    public int spriteCounter = 0;
    public int spriteNum = 1;
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
}

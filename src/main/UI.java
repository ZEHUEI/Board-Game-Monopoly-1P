package main;

import java.awt.*;
import java.io.IOException;
import java.io.InputStream;

public class UI {
    GamePanel gp;
    Font pixelplay_40;


    public UI(GamePanel gp) {
        this.gp = gp;
        try {
            InputStream is = getClass().getResourceAsStream("/fonts/pixelplay.ttf");
            System.out.println("Font stream = " + is);
            pixelplay_40 = Font.createFont(Font.TRUETYPE_FONT, is);
        } catch (
                IOException e) {
            e.printStackTrace();
        } catch (
                FontFormatException e) {
            e.printStackTrace();
        }
    }

    public void draw(Graphics2D g2) {

        g2.setFont(g2.getFont().deriveFont(Font.BOLD,23f));
        g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        g2.setColor(Color.WHITE);

        String text ="COINS x" + gp.player.x;
        int x=gp.tileSize*27;
        int y=gp.tileSize*7;
        g2.setColor(Color.gray);
        g2.drawString(text,x+2,y+2);
        g2.setColor(Color.white);
        g2.drawString(text,x,y);

        text ="GEMS x" + gp.player.x;
        y=gp.tileSize*9;
        g2.setColor(Color.gray);
        g2.drawString(text,x+2,y+2);
        g2.setColor(Color.white);
        g2.drawString(text,x,y);

        text ="TOKEN x" + gp.player.x;
        y=gp.tileSize*11;
        g2.setColor(Color.gray);
        g2.drawString(text,x+2,y+2);
        g2.setColor(Color.white);
        g2.drawString(text,x,y);

        text ="ROLLED:"+gp.keyH.dice;
        y=(gp.tileSize * 7) + gp.screenHeight / 2;
        g2.setColor(Color.gray);
        g2.drawString(text,x+2,y+2);
        g2.setColor(Color.white);
        g2.drawString(text,x,y);

    }
}



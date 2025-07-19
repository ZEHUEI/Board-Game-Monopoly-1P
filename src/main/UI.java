package main;

import java.awt.*;
import java.io.IOException;
import java.io.InputStream;

public class UI {
    GamePanel gp;
    Font pixelplay_40;
    public Graphics2D g2;
    public String currentDialogue = "";
    public boolean showConditionWindow;


    public UI(GamePanel gp) {
        this.gp = gp;
        try {
            InputStream is = getClass().getResourceAsStream("/fonts/pixelplay.ttf");
            //debug
            // System.out.println("Font stream = " + is);
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
        this.g2 = g2;

        g2.setFont(g2.getFont().deriveFont(Font.BOLD,23f));
        g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        g2.setColor(Color.WHITE);

        String text ="COINS x" + gp.player.coin;
        int x=gp.tileSize*27;
        int y=gp.tileSize*7;
        g2.setColor(Color.gray);
        g2.drawString(text,x+2,y+2);
        g2.setColor(Color.white);
        g2.drawString(text,x,y);

        text ="GEMS x" + gp.player.gems;
        y=gp.tileSize*9;
        g2.setColor(Color.gray);
        g2.drawString(text,x+2,y+2);
        g2.setColor(Color.white);
        g2.drawString(text,x,y);

        text ="TOKEN x" + gp.player.token;
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

        if(showConditionWindow){
            drawWindow(g2,40,40,800,200);
            drawDialogue(g2,40,40);
        }

    }
    public void drawWindow(Graphics2D g2,int x,int y, int width, int height){

        Color c =new Color(0,0,0,200);
        g2.setColor(c);
        g2.fillRoundRect(x,y,width,height,35,35);

        c = new Color(255,255,255);
        g2.setColor(c);
        g2.setStroke(new BasicStroke(5));
        g2.drawRoundRect(x+5,y+5,width-10,height-10,25,25);

    }
    public void drawDialogue(Graphics2D g2,int x,int y){
        g2.setFont(g2.getFont().deriveFont(Font.BOLD,32));
        x+=gp.tileSize;
        y+=gp.tileSize;

        for(String line : currentDialogue.split("\n"))
        {
            g2.drawString(line,x,y);
            y+=40;
        }
    }
}



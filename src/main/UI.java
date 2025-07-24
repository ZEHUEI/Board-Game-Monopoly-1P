package main;

import Objects.Network;
import Objects.Strikes;
import Player.Entity;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

public class UI {
    GamePanel gp;
    Font pixelplay_40;
    public Graphics2D g2;
    public String currentDialogue = "";
    public boolean showConditionWindow;
    BufferedImage Striked, noStrike, Havenet, nonet;
    public boolean one = false;
    public boolean two = false;
    public boolean three = false;
    public boolean four = false;
    public boolean five = false;

    public boolean hasPlayedSound = false;

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

        //strikes
        Entity strikes = new Strikes(gp);
        Striked = strikes.image;
        noStrike = strikes.image2;

        //nets
        Entity net = new Network(gp);
        nonet = net.image;
        Havenet = net.image2;
    }

    public void draw(Graphics2D g2) {
        this.g2 = g2;

        g2.setFont(g2.getFont().deriveFont(Font.BOLD, 23f));
        g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        g2.setColor(Color.WHITE);

        drawStrikes();
        drawnNet();

        String text = "STRIKES";
        int x = gp.tileSize * 27;
        int y = gp.tileSize * 2;
        g2.setColor(Color.gray);
        g2.drawString(text, x + 2, y + 2);
        g2.setColor(Color.white);
        g2.drawString(text, x, y);

        text = "COINS x" + gp.player.coin;
        x = gp.tileSize * 27;
        y = gp.tileSize * 7;
        g2.setColor(Color.gray);
        g2.drawString(text, x + 2, y + 2);
        g2.setColor(Color.white);
        g2.drawString(text, x, y);

        text = "GEMS x" + gp.player.gems;
        y = gp.tileSize * 9;
        g2.setColor(Color.gray);
        g2.drawString(text, x + 2, y + 2);
        g2.setColor(Color.white);
        g2.drawString(text, x, y);

        text = "TOKEN x" + gp.player.token;
        y = gp.tileSize * 11;
        g2.setColor(Color.gray);
        g2.drawString(text, x + 2, y + 2);
        g2.setColor(Color.white);
        g2.drawString(text, x, y);

        text = "ROLLED:" + gp.keyH.dice;
        y = (gp.tileSize * 7) + gp.screenHeight / 2;
        g2.setColor(Color.gray);
        g2.drawString(text, x + 2, y + 2);
        g2.setColor(Color.white);
        g2.drawString(text, x, y);

        g2.setFont(g2.getFont().deriveFont(Font.BOLD, 45));
        g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        g2.setColor(Color.WHITE);

        if(gp.gamestate == gp.playstate){
            text = "LIGHT ALL NETWORKS";
            x = gp.tileSize* 7;
            y = gp.screenHeight / 2;
            g2.setColor(Color.gray);
            g2.drawString(text, x + 2, y + 2);
            g2.setColor(Color.white);
            g2.drawString(text, x, y);
        }


        if (one) {
            g2.drawImage(Havenet, gp.tileSize * 19, gp.tileSize * 17, null);
        }
        if (two) {
            g2.drawImage(Havenet, gp.tileSize * 5, gp.tileSize * 17, null);
        }
        if (three) {
            g2.drawImage(Havenet, gp.tileSize * 3, gp.tileSize * 9, null);
        }
        if (four) {
            g2.drawImage(Havenet, gp.tileSize * 12, gp.tileSize * 2, null);
        }
        if (five) {
            g2.drawImage(Havenet, gp.tileSize * 21, gp.tileSize * 9, null);
        }

        if (showConditionWindow) {
            drawWindow(g2, 40, 40, 800, 200);
            drawDialogue(g2, 40, 40);
        }

        if (gp.player.life == 0) {
            drawWinLoseScreen("LOST");
            if (!hasPlayedSound) {
                gp.playSE(9);
                hasPlayedSound = true;
            }
        } else if (one && two && three & four && five) {
            drawWinLoseScreen("VICTORY");
            if (!hasPlayedSound) {
                gp.playSE(8);
                hasPlayedSound = true;
            }
        }
    }


    public void drawWindow(Graphics2D g2, int x, int y, int width, int height) {

        Color c = new Color(0, 0, 0, 200);
        g2.setColor(c);
        g2.fillRoundRect(x, y, width, height, 35, 35);

        c = new Color(255, 255, 255);
        g2.setColor(c);
        g2.setStroke(new BasicStroke(5));
        g2.drawRoundRect(x + 5, y + 5, width - 10, height - 10, 25, 25);

    }

    public void drawDialogue(Graphics2D g2, int x, int y) {
        g2.setFont(g2.getFont().deriveFont(Font.BOLD, 32));
        x += gp.tileSize;
        y += gp.tileSize;

        for (String line : currentDialogue.split("\n")) {
            g2.drawString(line, x, y);
            y += 40;
        }
    }

    public void drawStrikes() {

        int x = 22 + gp.tileSize * 26;
        int y = gp.tileSize * 3;
        int i = 0;

        while (i < gp.player.maxlife) {
            if (i < (gp.player.maxlife - gp.player.life)) {
                g2.drawImage(Striked, x, y, null);
            } else {
                g2.drawImage(noStrike, x, y, null);
            }
            i++;
            x += 50;
        }
    }

    public void drawnNet() {
        int x = gp.tileSize * 19;
        int y = gp.tileSize * 17;
        g2.drawImage(nonet, x, y, null);

        x = gp.tileSize * 5;
        y = gp.tileSize * 17;
        g2.drawImage(nonet, x, y, null);

        x = gp.tileSize * 3;
        y = gp.tileSize * 9;
        g2.drawImage(nonet, x, y, null);

        x = gp.tileSize * 12;
        y = gp.tileSize * 2;
        g2.drawImage(nonet, x, y, null);

        x = gp.tileSize * 21;
        y = gp.tileSize * 9;
        g2.drawImage(nonet, x, y, null);
    }

    public void drawWinLoseScreen(String text) {

        gp.gamestate = gp.winlosestate;

        g2.setFont(g2.getFont().deriveFont(Font.PLAIN, 80f));
        int x = gp.tileSize* 9;
        int y = gp.screenHeight / 2;

        g2.drawString(text, x, y);
    }
}



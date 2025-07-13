package main;

import java.awt.*;

public class EventHandler {
    GamePanel gp;
    EventRect eventRect[][];
    int col = 0;
    int row = 0;
    public int coin;
    public int token;
    public int gems;

    public EventHandler(GamePanel gp) {
        this.gp = gp;
        eventRect = new EventRect[gp.maxWorldCol][gp.maxWorldRow];

        while (col < gp.maxWorldCol && row < gp.maxWorldRow) {
            eventRect[col][row] = new EventRect();
            eventRect[col][row].eventRectX = eventRect[col][row].x;
            eventRect[col][row].eventRectY = eventRect[col][row].y;
            col++;
            if (col == gp.maxWorldCol) {
                col = 0;
                row++;
            }

        }
    }
    public int getTileX() {
        return gp.player.x / gp.tileSize;
    }

    public int getTileY() {
        return gp.player.y / gp.tileSize;
    }


    public void checkEvent() {
        int tileX = getTileX();
        int tileY = getTileY();
        if(tileX >=0 && tileX < gp.maxWorldCol && tileY >=0 && tileY <gp.maxWorldRow){
//            if (tileX == 5 && tileY == 8 && !eventRect[5][8].eventDone) {
//                damagePit(5, 8);
//            }

            if (tileX == 5 && tileY == 18 && !eventRect[5][18].eventDone) {
                teleport(5, 18,3);
                gp.player.x = gp.tileSize * 23;
                gp.player.y = gp.tileSize * 18;
            }
            if (tileX == 6 && tileY == 18 && !eventRect[6][18].eventDone) {
                gainCoin(6, 18);
            }
        }
        System.out.println("Player is at tile: " + tileX + ", " + tileY);

    }

    public void damagePit(int col,int row) {
        System.out.println("DMG DONE");
        eventRect[col][row].eventDone = true;
    }

    public void gainCoin(int col,int row) {
        gp.player.diceStepsLeft = 0;
        coin++;
    }

    public void teleport(int col,int row,int haha) {
        gp.player.diceStepsLeft = 0;
        switch(haha){
            case 1:
                gp.player.direction = "up";
                break;
            case 2:
                gp.player.direction = "down";
                break;
            case 3:
                gp.player.direction = "left";
                break;
            case 4:
                gp.player.direction = "right";
                break;
        }
        gp.player.stepsTaken = 0;

    }
}


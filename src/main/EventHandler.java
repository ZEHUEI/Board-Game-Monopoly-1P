package main;

import Objects.Network;

import java.awt.*;

public class EventHandler {
    GamePanel gp;
    EventRect eventRect[][];
    int col = 0;
    int row = 0;
    public int tileX,tileY;

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
        tileX = getTileX();
        tileY = getTileY();
        if(tileX >=0 && tileX < gp.maxWorldCol && tileY >=0 && tileY <gp.maxWorldRow){
            //all tiles
            //left
            if (tileX == 22 && tileY == 18 && !eventRect[22][18].eventDone) {
                gainCoin(22, 18);
            }
            //1
            if (tileX == 21 && tileY == 18 && !eventRect[21][18].eventDone) {
                gainGems(21, 18);
            }
            if (tileX == 20 && tileY == 18 && !eventRect[20][18].eventDone) {
                gainToken(20, 18);
            }
            if (tileX == 19 && tileY == 18 && !eventRect[19][18].eventDone) {
                condition(19, 18);
            }
            if (tileX == 18 && tileY == 18 && !eventRect[18][18].eventDone) {
                gainGems(18, 18);
            }
            if (tileX == 17 && tileY == 18 && !eventRect[17][18].eventDone) {
                damagePit(17, 18);
            }
            if (tileX == 16 && tileY == 18 && !eventRect[16][18].eventDone) {
                gainCoin(16, 18);
            }
            if (tileX == 15 && tileY == 18 && !eventRect[15][18].eventDone) {
                gainGems(15, 18);
            }
            if (tileX == 14 && tileY == 18 && !eventRect[14][18].eventDone) {
                gainToken(14, 18);
            }
            if (tileX == 13 && tileY == 18 && !eventRect[13][18].eventDone) {
                gainCoin(13, 18);
            }
            if (tileX == 12 && tileY == 18 && !eventRect[12][18].eventDone) {
                //10
               teleport(12, 18,3);
            }
            if (tileX == 11 && tileY == 18 && !eventRect[11][18].eventDone) {
                gainToken(11, 18);
            }
            if (tileX == 10 && tileY == 18 && !eventRect[10][18].eventDone) {
                gainCoin(10, 18);
            }
            if (tileX == 9 && tileY == 18 && !eventRect[9][18].eventDone) {
                gainGems(9, 18);
            }
            if (tileX == 8 && tileY == 18 && !eventRect[8][18].eventDone) {
                gainToken(8, 18);
            }
            if (tileX == 7 && tileY == 18 && !eventRect[7][18].eventDone) {
                gainCoin(7, 18);
            }
            if (tileX == 6 && tileY == 18 && !eventRect[6][18].eventDone) {
                gainGems(6, 18);
            }
            if (tileX == 5 && tileY == 18 && !eventRect[5][18].eventDone) {
                condition(5, 18);
            }
            if (tileX == 4 && tileY == 18 && !eventRect[4][18].eventDone) {
                gainCoin(4, 18);
            }
            if (tileX == 3 && tileY == 18 && !eventRect[3][18].eventDone) {
                gainGems(3, 18);
            }
            if (tileX == 2 && tileY == 18 && !eventRect[2][18].eventDone) {
                gainToken(2, 18);
            }
            //end left
            //up
            if (tileX == 2 && tileY == 17 && !eventRect[2][17].eventDone) {
                gainCoin(2, 17);
            }
            if (tileX == 2 && tileY == 16 && !eventRect[2][16].eventDone) {
                gainGems(2, 16);
            }
            if (tileX == 2 && tileY == 15 && !eventRect[2][15].eventDone) {
                gainToken(2, 15);
            }
            if (tileX == 2 && tileY == 14 && !eventRect[2][14].eventDone) {
                damagePit(2, 14);
            }
            if (tileX == 2 && tileY == 13 && !eventRect[2][13].eventDone) {
                gainGems(2, 13);
            }
            if (tileX == 2 && tileY == 12 && !eventRect[2][12].eventDone) {
                gainToken(2, 12);
            }
            if (tileX == 2 && tileY == 11 && !eventRect[2][11].eventDone) {
                gainCoin(2, 11);
            }
            if (tileX == 2 && tileY == 10 && !eventRect[2][10].eventDone) {
                gainGems(2, 10);
            }
            if (tileX == 2 && tileY == 9 && !eventRect[2][9].eventDone) {
                condition(2, 9);
            }
            if (tileX == 2 && tileY == 8 && !eventRect[2][8].eventDone) {
                gainCoin(2, 8);
            }
            if (tileX == 2 && tileY == 7 && !eventRect[2][7].eventDone) {
                gainGems(2, 7);
            }
            if (tileX == 2 && tileY == 6 && !eventRect[2][6].eventDone) {
                gainToken(2, 6);
            }
            if (tileX == 2 && tileY == 5 && !eventRect[2][5].eventDone) {
                gainCoin(2, 5);
            }
            if (tileX == 2 && tileY == 4 && !eventRect[2][4].eventDone) {
                gainGems(2, 4);
            }
            if (tileX == 2 && tileY == 3 && !eventRect[2][3].eventDone) {
                damagePit(2, 3);
            }
            if (tileX == 2 && tileY == 2 && !eventRect[2][2].eventDone) {
                gainCoin(2, 2);
            }
            if (tileX == 2 && tileY == 1 && !eventRect[2][1].eventDone) {
                gainGems(2, 1);
            }
            //end of up
            //start of right
            if (tileX == 3 && tileY == 1 && !eventRect[3][1].eventDone) {
                gainToken(3, 1);
            }
            if (tileX == 4 && tileY == 1 && !eventRect[4][1].eventDone) {
                //39
                teleport(4, 1,1);
            }
            if (tileX == 5 && tileY == 1 && !eventRect[5][1].eventDone) {
                gainGems(5, 1);
            }
            if (tileX == 6 && tileY == 1 && !eventRect[6][1].eventDone) {
                gainToken(6, 1);
            }
            if (tileX == 7 && tileY == 1 && !eventRect[7][1].eventDone) {
                gainCoin(7, 1);
            }
            if (tileX == 8 && tileY == 1 && !eventRect[8][1].eventDone) {
                damagePit(8, 1);
            }
            if (tileX == 9 && tileY == 1 && !eventRect[9][1].eventDone) {
                gainToken(9, 1);
            }
            if (tileX == 10 && tileY == 1 && !eventRect[10][1].eventDone) {
                gainCoin(10, 1);
            }
            if (tileX == 11 && tileY == 1 && !eventRect[11][1].eventDone) {
                gainGems(11, 1);
            }
            if (tileX == 12 && tileY == 1 && !eventRect[12][1].eventDone) {
                condition(12, 1);
            }
            if (tileX == 13 && tileY == 1 && !eventRect[13][1].eventDone) {
                gainCoin(13, 1);
            }
            if (tileX == 14 && tileY == 1 && !eventRect[14][1].eventDone) {
                gainGems(14, 1);
            }
            if (tileX == 15 && tileY == 1 && !eventRect[15][1].eventDone) {
                //change to getdmg
                damagePit(15, 1);
            }
            if (tileX == 16 && tileY == 1 && !eventRect[16][1].eventDone) {
                gainCoin(16, 1);
            }
            if (tileX == 17 && tileY == 1 && !eventRect[17][1].eventDone) {
                gainGems(17, 1);
            }
            if (tileX == 18 && tileY == 1 && !eventRect[18][1].eventDone) {
                gainToken(18, 1);
            }
            if (tileX == 19 && tileY == 1 && !eventRect[19][1].eventDone) {
                teleport(19, 1,4);
            }
            if (tileX == 20 && tileY == 1 && !eventRect[20][1].eventDone) {
                gainGems(20, 1);
            }
            if (tileX == 21 && tileY == 1 && !eventRect[21][1].eventDone) {
                gainToken(21, 1);
            }
            if (tileX == 22 && tileY == 1 && !eventRect[22][1].eventDone) {
                gainCoin(22, 1);
            }
            //down tile
            if (tileX == 22 && tileY == 2 && !eventRect[22][2].eventDone) {
                gainGems(22, 2);
            }
            if (tileX == 22 && tileY == 3 && !eventRect[22][3].eventDone) {
                gainToken(22, 3);
            }
            if (tileX == 22 && tileY == 4 && !eventRect[22][4].eventDone) {
                gainCoin(22, 4);
            }
            if (tileX == 22 && tileY == 5 && !eventRect[22][5].eventDone) {
                //dmg tile
                damagePit(22, 5);
            }
            if (tileX == 22 && tileY == 6 && !eventRect[22][6].eventDone) {
                gainToken(22, 6);
            }
            if (tileX == 22 && tileY == 7 && !eventRect[22][7].eventDone) {
                gainCoin(22, 7);
            }
            if (tileX == 22 && tileY == 8 && !eventRect[22][8].eventDone) {
                gainGems(22, 8);
            }
            if (tileX == 22 && tileY == 9 && !eventRect[22][9].eventDone) {
                condition(22, 9);
            }
            if (tileX == 22 && tileY == 10 && !eventRect[22][10].eventDone) {
                gainCoin(22, 10);
            }
            if (tileX == 22 && tileY == 11 && !eventRect[22][11].eventDone) {
                gainGems(22, 11);
            }
            if (tileX == 22 && tileY == 12 && !eventRect[22][12].eventDone) {
                //68
                teleport(22, 12,2);
            }
            if (tileX == 22 && tileY == 13 && !eventRect[22][13].eventDone) {
                gainCoin(22, 13);
            }
            if (tileX == 22 && tileY == 14 && !eventRect[22][14].eventDone) {
                gainGems(22, 14);
            }
            if (tileX == 22 && tileY == 15 && !eventRect[22][15].eventDone) {
                gainToken(22, 15);
            }
            if (tileX == 22 && tileY == 16 && !eventRect[22][16].eventDone) {
                gainCoin(22, 16);
            }
            if (tileX == 22 && tileY == 17 && !eventRect[22][17].eventDone) {
                gainGems(22, 17);
            }
        }
        //debug
        System.out.println("Player is at tile: " + tileX + ", " + tileY);
    }

    public void damagePit(int col,int row) {
        System.out.println("DMG DONE");
        gp.ui.currentDialogue="GOT DAMAGED !!!";
        gp.ui.showConditionWindow = true;
        gp.player.diceStepsLeft = 0;
        gp.player.life -=1;
        gp.playSE(4);
    }

    public void gainCoin(int col,int row) {
        gp.player.diceStepsLeft = 0;
        gp.player.coin++;
        gp.playSE(1);
    }
    public void gainGems(int col,int row) {
        gp.player.diceStepsLeft = 0;
        gp.player.gems++;
        gp.playSE(2);
    }
    public void gainToken(int col,int row) {
        gp.player.diceStepsLeft = 0;
        gp.player.token++;
        gp.playSE(3);
    }

    public void teleport(int col,int row,int haha) {
        gp.player.diceStepsLeft = 0;
        gp.ui.currentDialogue="TELEPORTED";
        gp.ui.showConditionWindow = true;
        switch(haha){
            case 1:
                gp.player.direction = "up";
                gp.player.x = gp.tileSize * 2;
                gp.player.y = gp.tileSize * 18;
                gp.player.pathIndex=1;
                break;
            case 2:
                gp.player.direction = "down";
                gp.player.x = gp.tileSize * 22;
                gp.player.y = gp.tileSize;
                gp.player.pathIndex=3;
                break;
            case 3:
                gp.player.direction = "left";
                gp.player.x = gp.tileSize * 22;
                gp.player.y = gp.tileSize * 18;
                gp.player.pathIndex =0;
                break;
            case 4:
                gp.player.direction = "right";
                gp.player.x = gp.tileSize * 2;
                gp.player.y = gp.tileSize;
                gp.player.pathIndex=2;
                break;
        }
        gp.player.stepsTaken = 0;
        gp.playSE(5);

    }

    public void condition(int col, int row){
        gp.player.diceStepsLeft =0;
        if(gp.keyH. gp.player.token >=3 && gp.player.coin >=3 && gp.player.gems >=3){
            //condition met
            gp.ui.currentDialogue="CONDITION MET NETWORK GAIN !!!";
            gp.ui.showConditionWindow = true;
            gp.player.gems -=3;
            gp.player.coin-=3;
            gp.player.token-=3;
            if(tileX==19){
                gp.ui.one = true;
            }
            if(tileX==5){
                gp.ui.two = true;
            }
            if(tileX==2){
                gp.ui.three = true;
            }
            if(tileX==12){
                gp.ui.four = true;
            }
            if(tileX==22){
                gp.ui.five = true;
            }
            gp.playSE(6);
        }
        else{
            //jz say not met need more this
            gp.ui.currentDialogue="YOU NEED 3 COINS , 3 GEMS AND 3 TOKEN";
            gp.ui.showConditionWindow = true;
            gp.playSE(7);
        }
    }
}


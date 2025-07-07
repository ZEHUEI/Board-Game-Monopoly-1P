package Tile;

import main.GamePanel;
import main.UtilityTool;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


public class TileManager {

    GamePanel gp;
    public Tile[] tile;
    public int mapTileNum[][];

    public TileManager(GamePanel gp){
        this.gp =gp;
        tile = new Tile[50];
        mapTileNum = new int[gp.maxWorldCol][gp.maxWorldRow];
        getTileImage();
        loadMap();
    }

    public void getTileImage(){
        setup(0,"Floor",false);
    }
    public void setup(int index, String imageName, boolean collision){
        UtilityTool uTool = new UtilityTool();
        try{
            tile[index] = new Tile();
            tile[index].image = ImageIO.read(getClass().getResourceAsStream("/Tiles/"+ imageName+".png"));
            tile[index].image = uTool.scaleImage(tile[index].image, gp.tileSize, gp.tileSize);
            tile[index].collision = collision;

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void loadMap() {
        try {
            InputStream is = getClass().getResourceAsStream("/Map/worldmap.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(is));

            int col =0;
            int row=0;

            while(col < gp.maxWorldCol && row < gp.maxWorldRow)
            {
                String line = br.readLine();

                while(col < gp.maxWorldCol)
                {
                    String numbers[] = line.split(" ");

                    int num = Integer.parseInt(numbers[col]);

                    mapTileNum[col][row] = num;
                    col++;
                }
                if(col == gp.maxWorldCol)
                {
                    col =0;
                    row++;
                }
            }
            br.close();
        } catch (Exception e) {
        }
    }
    public void draw (Graphics2D g2){
        //only lenovo need this as the graphics r too good as asus tuf is quite old and dont need smoothing
        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_NEAREST_NEIGHBOR);

        int worldcol = 0;
        int worldrow = 0;
        int x = 0;
        int y =0;

        while(worldcol < gp.maxScreenCol && worldrow <gp.maxScreenRow){
            int tileNum = mapTileNum[worldcol][worldrow];
            g2.drawImage(tile[tileNum].image, x, y,gp.tileSize,gp.tileSize,null);
            worldcol++;
            x+= gp.tileSize;
            if(worldcol == gp.maxWorldCol){
                worldcol=0;
                x=0;
                worldrow++;
                y+= gp.tileSize;
            }
        }

//        while (worldcol < gp.maxWorldCol && worldrow < gp.maxWorldRow) {
//
//            int tileNum = mapTileNum[worldcol][worldrow];
//
//            int worldX = worldcol * gp.tileSize;
//            int worldY = worldrow * gp.tileSize;
//            int screenX = worldX - gp.player.worldX + gp.player.screenX;
//            int screenY = worldY - gp.player.worldY + gp.player.screenY;
//
//            if(worldX + gp.tileSize > gp.player.worldX - gp.player.screenX &&
//                    worldX - gp.tileSize <gp.player.worldX + gp.player.screenX &&
//                    worldY + gp.tileSize > gp.player.worldY - gp.player.screenY &&
//                    worldY - gp.tileSize <gp.player.worldY + gp.player.screenY)
//            {
//                g2.drawImage(tile[tileNum].image, screenX, screenY,null);
//            }
//            worldcol++;
//
//            if (worldcol == gp.maxWorldCol) {
//                worldcol = 0;
//                worldrow++;
//            }
//        }
    }



}

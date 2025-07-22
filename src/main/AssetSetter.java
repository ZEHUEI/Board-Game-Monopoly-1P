package main;

import Objects.Network;

public class AssetSetter {

    GamePanel gp;

    public AssetSetter(GamePanel gp){
        this.gp = gp;
    }

    public void setObject(){
        gp.obj[0] = new Network(gp);
        gp.obj[0].x = gp.tileSize * 2;
        gp.obj[0].y = gp.tileSize * 2;

        gp.obj[1] = new Network(gp);
        gp.obj[1].x = gp.tileSize * 3;
        gp.obj[1].y = gp.tileSize * 3;

    }
}

package main;

import Objects.Plants;
import Objects.Traffic;

public class AssetSetter {

    GamePanel gp;

    public AssetSetter(GamePanel gp){
        this.gp = gp;
    }

    public void setObject(){

        gp.obj[0] = new Plants(gp);
        gp.obj[0].x = gp.tileSize * 6;
        gp.obj[0].y = gp.tileSize * 4;

        gp.obj[1] = new Plants(gp);
        gp.obj[1].x = gp.tileSize * 7;
        gp.obj[1].y = gp.tileSize * 4;

        gp.obj[2] = new Plants(gp);
        gp.obj[2].x = gp.tileSize * 8;
        gp.obj[2].y = gp.tileSize * 4;

        gp.obj[3] = new Plants(gp);
        gp.obj[3].x = gp.tileSize * 9;
        gp.obj[3].y = gp.tileSize * 4;

        gp.obj[4] = new Plants(gp);
        gp.obj[4].x = gp.tileSize * 10;
        gp.obj[4].y = gp.tileSize * 4;

        gp.obj[5] = new Plants(gp);
        gp.obj[5].x = gp.tileSize * 11;
        gp.obj[5].y = gp.tileSize * 4;

        gp.obj[6] = new Plants(gp);
        gp.obj[6].x = gp.tileSize * 12;
        gp.obj[6].y = gp.tileSize * 4;

        gp.obj[7] = new Plants(gp);
        gp.obj[7].x = gp.tileSize * 13;
        gp.obj[7].y = gp.tileSize * 4;

        gp.obj[8] = new Plants(gp);
        gp.obj[8].x = gp.tileSize * 6;
        gp.obj[8].y = gp.tileSize * 6;

        gp.obj[9] = new Plants(gp);
        gp.obj[9].x = gp.tileSize * 7;
        gp.obj[9].y = gp.tileSize * 6;

        gp.obj[10] = new Plants(gp);
        gp.obj[10].x = gp.tileSize * 8;
        gp.obj[10].y = gp.tileSize * 6;

        gp.obj[11] = new Plants(gp);
        gp.obj[11].x = gp.tileSize * 9;
        gp.obj[11].y = gp.tileSize * 6;

        gp.obj[12] = new Plants(gp);
        gp.obj[12].x = gp.tileSize * 10;
        gp.obj[12].y = gp.tileSize * 6;

        gp.obj[13] = new Plants(gp);
        gp.obj[13].x = gp.tileSize * 11;
        gp.obj[13].y = gp.tileSize * 6;

        gp.obj[14] = new Plants(gp);
        gp.obj[14].x = gp.tileSize * 12;
        gp.obj[14].y = gp.tileSize * 6;

        gp.obj[15] = new Plants(gp);
        gp.obj[15].x = gp.tileSize * 13;
        gp.obj[15].y = gp.tileSize * 6;

        gp.obj[16] = new Plants(gp);
        gp.obj[16].x = gp.tileSize * 17;
        gp.obj[16].y = gp.tileSize * 15;

        gp.obj[17] = new Plants(gp);
        gp.obj[17].x = gp.tileSize * 16;
        gp.obj[17].y = gp.tileSize * 15;

        gp.obj[18] = new Plants(gp);
        gp.obj[18].x = gp.tileSize * 15;
        gp.obj[18].y = gp.tileSize * 15;

        gp.obj[19] = new Plants(gp);
        gp.obj[19].x = gp.tileSize * 14;
        gp.obj[19].y = gp.tileSize * 15;

        gp.obj[20] = new Plants(gp);
        gp.obj[20].x = gp.tileSize * 13;
        gp.obj[20].y = gp.tileSize * 15;

        gp.obj[21] = new Plants(gp);
        gp.obj[21].x = gp.tileSize * 12;
        gp.obj[21].y = gp.tileSize * 15;

        gp.obj[22] = new Plants(gp);
        gp.obj[22].x = gp.tileSize * 11;
        gp.obj[22].y = gp.tileSize * 15;

        gp.obj[23] = new Plants(gp);
        gp.obj[23].x = gp.tileSize * 10;
        gp.obj[23].y = gp.tileSize * 15;

        gp.obj[24] = new Plants(gp);
        gp.obj[24].x = gp.tileSize * 10;
        gp.obj[24].y = gp.tileSize * 13;

        gp.obj[25] = new Plants(gp);
        gp.obj[25].x = gp.tileSize * 11;
        gp.obj[25].y = gp.tileSize * 13;

        gp.obj[26] = new Plants(gp);
        gp.obj[26].x = gp.tileSize * 12;
        gp.obj[26].y = gp.tileSize * 13;

        gp.obj[27] = new Plants(gp);
        gp.obj[27].x = gp.tileSize * 13;
        gp.obj[27].y = gp.tileSize * 13;

        gp.obj[28] = new Plants(gp);
        gp.obj[28].x = gp.tileSize * 14;
        gp.obj[28].y = gp.tileSize * 13;

        gp.obj[29] = new Plants(gp);
        gp.obj[29].x = gp.tileSize * 15;
        gp.obj[29].y = gp.tileSize * 13;

        gp.obj[30] = new Plants(gp);
        gp.obj[30].x = gp.tileSize * 16;
        gp.obj[30].y = gp.tileSize * 13;

        gp.obj[31] = new Plants(gp);
        gp.obj[31].x = gp.tileSize * 17;
        gp.obj[31].y = gp.tileSize * 13;

        gp.obj[32] = new Traffic(gp);
        gp.obj[32].x = gp.tileSize * 21;
        gp.obj[32].y = gp.tileSize * 17;

        gp.obj[33] = new Traffic(gp);
        gp.obj[33].x = gp.tileSize * 3;
        gp.obj[33].y = gp.tileSize * 17;

        gp.obj[34] = new Traffic(gp);
        gp.obj[34].x = gp.tileSize * 3;
        gp.obj[34].y = gp.tileSize * 2;

        gp.obj[35] = new Traffic(gp);
        gp.obj[35].x = gp.tileSize * 21;
        gp.obj[35].y = gp.tileSize * 2;
    }
}

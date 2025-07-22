package Objects;

import main.GamePanel;
import Player.Entity;

public class Strikes extends Entity {

    public Strikes(GamePanel gp){

        super(gp);
        name = "Strikes";
        image = setup("/Object/red strike",gp.tileSize,gp.tileSize);
        image2 = setup("/Object/nostrike",gp.tileSize,gp.tileSize);

    }
}
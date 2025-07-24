package Objects;

import main.GamePanel;
import Player.Entity;

public class Traffic extends Entity {

    public Traffic(GamePanel gp){

        super(gp);
        name = "Traffic";
        image = setup("/Object/traffic",gp.tileSize,gp.tileSize);

    }
}
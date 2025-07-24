package Objects;

import Player.Entity;
import main.GamePanel;

public class Network extends Entity {

    public Network(GamePanel gp){
        super(gp);
        name ="Network";
        image = setup("/Object/nonet",gp.tileSize,gp.tileSize);
        image2 =setup("/Object/net",gp.tileSize,gp.tileSize);

    }
}

package Objects;

import Player.Entity;
import main.GamePanel;

public class Network extends Entity {

    public Network(GamePanel gp){
        super(gp);
        name ="Network";
        net =setup("/Object/net",gp.tileSize,gp.tileSize);
        nonet = setup("/Object/nonet",gp.tileSize,gp.tileSize);

    }
}

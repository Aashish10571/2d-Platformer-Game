package object;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class Obj_Chest extends SuperObject {
    public Obj_Chest() {
        name = "Chest";

        try {
            image = ImageIO.read(new File("C:\\Users\\Aashish\\Desktop\\JAVA SWING PROJECTS\\TreasureHuntingGame\\res\\objects\\chest.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

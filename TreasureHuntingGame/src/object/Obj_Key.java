package object;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class Obj_Key extends SuperObject {
    public Obj_Key() {
        name = "Key";

        try {
            image = ImageIO.read(new File("C:\\Users\\Aashish\\Desktop\\JAVA SWING PROJECTS\\TreasureHuntingGame\\res\\objects\\key.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

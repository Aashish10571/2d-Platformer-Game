package object;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class Obj_Boots extends SuperObject {
    public Obj_Boots() {
        name = "Boots";

        try {
            image = ImageIO.read(new File("C:\\Users\\Aashish\\Desktop\\JAVA SWING PROJECTS\\TreasureHuntingGame\\res\\objects\\boots.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
